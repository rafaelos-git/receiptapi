package com.transactify.receiptapi.domain.usecase

import com.transactify.receiptapi.domain.entity.Payment

interface PublishPaymentUseCase {
    fun publishPayment(payment: Payment)
}