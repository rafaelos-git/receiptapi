package com.transactify.receiptapi.domain.provider

import com.transactify.receiptapi.domain.entity.Payment

interface SendToKafkaMessageProvider {
    fun publishPayment(payment: Payment)
}