package com.example.study.domain.member.api

import com.example.study.common.exception.ApiResponse
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/**
 * MemberApi
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2025. 05. 25.
 */
@RestController
class MemberApi(
    private val memberService: MemberService
) {

    @PostMapping("/member")
    fun register(@Valid @RequestBody request: MemberRegisterRequest): ApiResponse<Nothing> {
        memberService.register(request)
        return ApiResponse.success()
    }
}