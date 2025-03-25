package com.transactify.receiptapi.infra.messageprovider.model

import com.transactify.receiptapi.domain.entity.enums.PaymentStatus
import java.math.BigDecimal
import java.time.LocalDateTime

data class PaymentModel (
    val transactionId: String,
    val personId: String,
    val amount: BigDecimal,
    val currency: String,
    val paymentMethod: String,
    val description: String?,
    val paymentDate: LocalDateTime?,
    var status: PaymentStatus
)