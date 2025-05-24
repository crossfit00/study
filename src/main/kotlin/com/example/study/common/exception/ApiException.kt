package com.example.study.common.exception

/**
 * ApiException
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2025. 05. 25.
 */
class ApiException private constructor(
    val errorCode: ErrorCode,
    val resultErrorMessage: String?,
    override val cause: Throwable?,
) : RuntimeException(
    cause
) {
    companion object {
        fun from(
            errorCode: ErrorCode,
            resultErrorMessage: String? = null,
            cause: Throwable? = null
        ): ApiException {
            return ApiException(
                errorCode,
                resultErrorMessage,
                cause
            )
        }
    }
}