package com.transactify.receiptapi.infra.config

import com.transactify.receiptapi.domain.usecase.PublishPaymentUseCase
import com.transactify.receiptapi.domain.usecase.impl.PublishPaymentUseCaseImpl
import com.transactify.receiptapi.infra.messageprovider.SendToKafkaMessageProviderImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PublishPaymentConfig {
    @Bean
    fun publishPaymentUseCase(
        sendToKafkaMessageProviderImpl: SendToKafkaMessageProviderImpl
    ): PublishPaymentUseCase {
        return PublishPaymentUseCaseImpl(
            sendToKafkaMessageProviderImpl
        )
    }
}