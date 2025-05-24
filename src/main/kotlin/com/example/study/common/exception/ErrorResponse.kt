package com.example.study.common.exception

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import org.apache.commons.lang3.StringUtils

/**
 * ErrorResponse
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2025. 05. 25.
 */
class ErrorResponse(
    errorCode: ErrorCode,
    detailMessage: String?,
) {
    @JsonIgnore
    private val errorCode: ErrorCode = errorCode

    @JsonIgnore
    private val detailMessage: String? = detailMessage

    @JsonProperty("code")
    fun getCode(): String {
        return errorCode.getCode()
    }

    @JsonProperty("typeMessage")
    fun getTypeMessage(): String {
        return errorCode.name
    }

    @JsonProperty("detailMessage")
    fun getDetailMessage(): String? {
        return StringUtils.defaultIfEmpty(detailMessage, errorCode.defaultMessage)
    }
}