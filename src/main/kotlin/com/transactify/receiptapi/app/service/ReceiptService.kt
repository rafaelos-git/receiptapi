package com.transactify.receiptapi.app.service

import com.transactify.receiptapi.app.controller.request.PaymentDto

interface ReceiptService {
    fun createReceipt(paymentDto: PaymentDto)
}