package com.transactify.receiptapi.app.controller.request

import java.math.BigDecimal
import java.time.LocalDate

data class PaymentRequest (
    val personId: String,
    val amount: BigDecimal,
    val currency: String,
    val paymentMethod: String,
    val description: String?,
    val paymentDate: LocalDate?
)