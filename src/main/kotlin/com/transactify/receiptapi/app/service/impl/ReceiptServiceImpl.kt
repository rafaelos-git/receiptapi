package com.transactify.receiptapi.app.service.impl

import com.transactify.receiptapi.app.controller.mapper.PaymentMapper
import com.transactify.receiptapi.app.controller.request.PaymentRequest
import com.transactify.receiptapi.app.service.ReceiptService
import com.transactify.receiptapi.domain.usecase.PublishPaymentUseCase
import org.springframework.stereotype.Component

@Component
class ReceiptServiceImpl(
    private val paymentMapper: PaymentMapper,
    private val publishPaymentUseCase: PublishPaymentUseCase
) : ReceiptService {
    override fun createReceipt(paymentRequest: PaymentRequest) {
        publishPaymentUseCase.publishPayment(paymentMapper.toEntity(paymentRequest))
    }
}