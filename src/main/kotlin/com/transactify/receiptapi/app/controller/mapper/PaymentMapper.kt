package com.transactify.receiptapi.app.controller.mapper

import com.transactify.receiptapi.app.controller.request.PaymentRequest
import com.transactify.receiptapi.domain.entity.Payment
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import java.util.UUID

@Mapper(componentModel = "spring", uses = [PaymentRequest::class])
interface PaymentMapper {
    @Mapping(target = "transactionId", expression = "java(java.util.UUID.randomUUID().toString())")
    @Mapping(target = "status", constant = "PENDING")
    fun toEntity(paymentRequest: PaymentRequest): Payment
}