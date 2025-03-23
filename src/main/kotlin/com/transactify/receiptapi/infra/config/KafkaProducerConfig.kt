package com.transactify.receiptapi.infra.config

import com.fasterxml.jackson.databind.JsonSerializer
import com.transactify.receiptapi.infra.messageprovider.model.PaymentModel
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.core.ProducerFactory

@Configuration
class KafkaProducerConfig {
    @Value("\${kafka.bootstrap.servers}")
    private lateinit var servers : String

    @Bean
    fun producerFactory() : ProducerFactory<String, PaymentModel> {
        val config = mapOf(
            ProducerConfig.BOOTSTRAP_SERVERS_CONFIG to servers,
            ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG to StringSerializer::class.java,
            ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG to JsonSerializer::class.java
        )
        return DefaultKafkaProducerFactory(config)
    }

    @Bean
    fun kafkaTemplate() : KafkaTemplate<String, PaymentModel> {
        return KafkaTemplate(producerFactory())
    }
}