package com.transactify.receiptapi.app.controller.request

import lombok.Data

@Data
class PaymentDto {
    private lateinit var personId: String
}