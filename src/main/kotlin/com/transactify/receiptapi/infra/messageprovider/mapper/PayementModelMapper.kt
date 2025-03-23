package com.transactify.receiptapi.infra.messageprovider.mapper

import com.transactify.receiptapi.domain.entity.Payment
import com.transactify.receiptapi.infra.messageprovider.model.PaymentModel
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface PayementModelMapper {
    fun toModel(payment: Payment): PaymentModel
}