package com.jdriven.consumerbased.cardservice.service

import com.jdriven.consumerbased.cardservice.service.domain.Car
import org.springframework.stereotype.Service

@Service
class SearchService {
    private val cars = listOf(
            Car("Volkswagen", 1998, 100000)
    )

    fun all() = cars
    fun search() = cars
}