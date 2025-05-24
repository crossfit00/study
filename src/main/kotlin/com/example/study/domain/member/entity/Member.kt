package com.example.study.domain.member.entity

import com.example.study.domain.BaseEntity
import jakarta.persistence.*
import java.time.LocalDate
import java.time.LocalDateTime

/**
 * Member
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2025. 05. 24.
 */
@Table(name = "member")
@Entity
class Member(
    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "phone_number", nullable = false)
    val phoneNumber: String,

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    val gender: Gender,

    @Column(name = "birth", nullable = false)
    val birth: LocalDate,

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    var status: MemberStatus,

    @Column(name = "withdraw_at", nullable = true)
    var withdrawAt: LocalDateTime? = null
): BaseEntity() {

    fun updateWithDrawMember() {
        this.status = MemberStatus.WITHDRAWN
        this.withdrawAt = LocalDateTime.now()
    }
}