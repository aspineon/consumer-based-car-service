package com.jdriven.consumerbased.cardservice.service.domain

import java.time.LocalDate

data class Car(
        val make: String,
        val model: String,
        val year: Int,
        val month: Int,
        val color: Color,
        val fuel: Fuel,
        val kilometers: Int,
        val registrationDate: LocalDate)