package com.transactify.receiptapi.domain.usecase.impl

import com.transactify.receiptapi.domain.entity.Payment
import com.transactify.receiptapi.domain.provider.SendToKafkaMessageProvider
import com.transactify.receiptapi.domain.usecase.PublishPaymentUseCase

class PublishPaymentUseCaseImpl(
    private val sendToKafkaMessageProvider: SendToKafkaMessageProvider
) : PublishPaymentUseCase {
    override fun publishPayment(payment: Payment) {
        sendToKafkaMessageProvider.publishPayment(payment)
    }
}