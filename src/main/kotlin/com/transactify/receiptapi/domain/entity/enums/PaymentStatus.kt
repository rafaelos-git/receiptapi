package com.transactify.receiptapi.domain.entity.enums

enum class PaymentStatus {
    PENDING,    // payment is waiting for validation
    VALIDATED,  // payment is validated
    CONFIRMED,  // payment is confirmed
    REJECTED,   // payment was reject in the validation process
    FAILED,     // payment failed in the confirmation process
    COMPLETED   // payment is completed
}