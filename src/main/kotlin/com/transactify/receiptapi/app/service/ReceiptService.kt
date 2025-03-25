package com.transactify.receiptapi.app.service

import com.transactify.receiptapi.app.controller.request.PaymentRequest

interface ReceiptService {
    fun createReceipt(paymentRequest: PaymentRequest)
}