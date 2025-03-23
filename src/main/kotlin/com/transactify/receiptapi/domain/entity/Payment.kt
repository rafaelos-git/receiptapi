package com.transactify.receiptapi.domain.entity

class Payment {
    private lateinit var personId: String

    fun getPersonId(): String {
        return personId
    }

    fun setPersonId(personId: String) {
        this.personId = personId
    }
}