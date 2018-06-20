package com.jdriven.consumerbased.carservice.service

import com.jdriven.consumerbased.carservice.service.domain.Car
import com.jdriven.consumerbased.carservice.service.domain.CarSearch
import com.jdriven.consumerbased.carservice.service.domain.Color
import com.jdriven.consumerbased.carservice.service.domain.Fuel
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
open class SearchService {
    private val cars = listOf(
            Car("Peugeot", "308", 2014, 12, Color.BLACK, Fuel.DIESEL, 80000, LocalDate.of(2014, 12, 24))
    )

    open fun all() = cars
    fun search(carSearch: CarSearch) = cars.filter { matches(it, carSearch) }

    private fun matches(car: Car, carSearch: CarSearch) : Boolean {
        if(carSearch.color != null && carSearch.color != car.color) {
            return false
        }
        if(carSearch.fuel != null && carSearch.fuel != car.fuel) {
            return false
        }
        if(carSearch.kilometersMin != null && car.kilometers < carSearch.kilometersMin) {
            return false
        }
        if(carSearch.kilometersMax != null && car.kilometers > carSearch.kilometersMax) {
            return false
        }
        if(carSearch.make != null && car.make != carSearch.make) {
            return false
        }
        if(carSearch.model != null && car.model != carSearch.model) {
            return false
        }
        if(carSearch.yearMin != null && car.year < carSearch.yearMin) {
            return false
        }
        if(carSearch.yearMax != null && car.year > carSearch.yearMax) {
            return false
        }

        return true
    }
}