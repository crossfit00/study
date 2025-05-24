package com.example.study.domain.member.entity

/**
 * MemberStatus
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2025. 05. 24.
 */
enum class MemberStatus(
    private val description: String
) {
    SERVICE("서비스 이용 중"),
    WITHDRAWN("탈퇴 신청한 상태 (30일 이내 철회 가능"),
    END("탈퇴 후 30일 이후 (철회 불가능)"),
}