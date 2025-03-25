package com.transactify.receiptapi.app.controller

import com.transactify.receiptapi.app.controller.request.PaymentRequest
import com.transactify.receiptapi.app.service.ReceiptService
import com.transactify.receiptapi.infra.utils.logger
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
class ReceiptController(private val receiptService: ReceiptService) {
    @PostMapping("/receipt")
    fun createReceipt(@RequestBody paymentRequest: PaymentRequest): ResponseEntity<Void> {
        logger().info("Creating receipt for payment: $paymentRequest")
        receiptService.createReceipt(paymentRequest)
        return ResponseEntity.ok().build()
    }
}