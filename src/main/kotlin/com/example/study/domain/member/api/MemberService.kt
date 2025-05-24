package com.example.study.domain.member.api

import com.example.study.common.exception.ApiException
import com.example.study.common.exception.ErrorCode
import com.example.study.domain.member.repository.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * MemberService
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2025. 05. 25.
 */
@Service
class MemberService(
    private val memberRepository: MemberRepository
) {

    @Transactional
    fun register(request: MemberRegisterRequest) {
        val phoneNumber = request.phoneNumber
        if (memberRepository.existsByPhoneNumber(phoneNumber)) {
            throw ApiException.from(ErrorCode.E404_NOT_FOUND, "요청 핸드폰 번호($phoneNumber)는 이미 존재합니다.")
        }

        memberRepository.save(request.toEntity())
    }
}