package com.transactify.receiptapi.infra.messageprovider.model

import lombok.Data

@Data
class PaymentModel {
    private lateinit var personId: String
}