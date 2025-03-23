package com.transactify.receiptapi.app.controller.mapper

import com.transactify.receiptapi.app.controller.request.PaymentDto
import com.transactify.receiptapi.domain.entity.Payment
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface PaymentMapper {
    fun toEntity(paymentDto: PaymentDto): Payment
}