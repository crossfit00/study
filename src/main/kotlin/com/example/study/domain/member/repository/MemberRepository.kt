package com.example.study.domain.member.repository

import com.example.study.domain.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

/**
 * MemberRepository
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2025. 05. 25.
 */
interface MemberRepository : JpaRepository<Member, Long> {
    fun existsByPhoneNumber(phoneNumber: String): Boolean
}