package com.example.study.domain.member.api

import com.example.study.domain.member.entity.Gender
import com.example.study.domain.member.entity.Member
import com.example.study.domain.member.entity.MemberStatus
import jakarta.validation.constraints.NotBlank
import java.time.LocalDate

/**
 * MemberRegisterRequest
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2025. 05. 25.
 */
data class MemberRegisterRequest(
    @field:NotBlank
    val name: String,

    @field:NotBlank
    val phoneNumber: String,

    @field:NotBlank
    val gender: Gender,

    @field:NotBlank
    val birth: LocalDate
) {
    fun toEntity(): Member {
        return Member(
            name = name,
            phoneNumber = phoneNumber,
            gender = gender,
            birth = birth,
            status = MemberStatus.SERVICE
        )
    }
}