package com.transactify.receiptapi.infra.messageprovider

import com.transactify.receiptapi.domain.entity.Payment
import com.transactify.receiptapi.domain.provider.SendToKafkaMessageProvider
import com.transactify.receiptapi.infra.exception.SendToKafkaException
import com.transactify.receiptapi.infra.messageprovider.mapper.PayementModelMapper
import com.transactify.receiptapi.infra.messageprovider.model.PaymentModel
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class SendToKafkaMessageProviderImpl(
    private val paymentModelMapper: PayementModelMapper,
    private val kafkaTemplate: KafkaTemplate<String, PaymentModel>
) : SendToKafkaMessageProvider {
    @Value("\${kafka.topic.payment}")
    private lateinit var topic: String

    override fun publishPayment(payment: Payment) {
        val paymentModel = paymentModelMapper.toModel(payment)
        try {
            kafkaTemplate.send(topic, paymentModel)
        } catch (e: Exception) {
            throw SendToKafkaException("Error while sending message to Kafka", e)
        }
    }
}