package com.transactify.receiptapi.infra.exception

class SendToKafkaException : RuntimeException {
    constructor() : super()
    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
}