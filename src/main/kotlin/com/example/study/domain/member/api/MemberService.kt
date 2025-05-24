package com.example.study.domain.member.api

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
        memberRepository.save(request.toEntity())
    }
}