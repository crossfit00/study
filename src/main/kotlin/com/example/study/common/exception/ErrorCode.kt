package com.example.study.common.exception

import org.springframework.http.HttpStatus

/**
 * ErrorCode
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2025. 05. 24.
 */
enum class ErrorCode(
    val httpStatus: HttpStatus,
    val minorStatus: String,
    val defaultMessage: String? = null,
) {
    // ------------------------------ 400 ------------------------------
    E400_BAD_REQUEST(HttpStatus.BAD_REQUEST, "000", defaultMessage = "필수 파라미터 값이 없거나 잘못된 값으로 요청을 보낸 경우 발생"),

    // ------------------------------ 401 ------------------------------
    E401_UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "000", defaultMessage = "인증 토큰이 없거나, 유효하지 않은 경우 발생합니다."),

    // ------------------------------ 403 ------------------------------
    E403_FORBIDDEN(HttpStatus.FORBIDDEN, "000", defaultMessage = "사용 권한이 없는 경우 발생"),

    // ------------------------------ 404 ------------------------------
    E404_NOT_FOUND(HttpStatus.NOT_FOUND, "000", "요청한 리소스가 존재하지 않는 경우 발생"),

    // ------------------------------ 405 ------------------------------
    E405_METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "000", "허용하지 않는 HTTP Method를 요청한 경우 발생"),

    // ------------------------------ 500 ------------------------------
    E500_INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "000", "서버 내부에서 에러가 발생하는 경우 발생"),
    ;

    fun getCode(): String {
        return httpStatus.value().toString() + minorStatus
    }

    override fun toString(): String {
        return getCode()
    }
}
