package com.jdriven.consumerbased.carservice.service

import com.jdriven.consumerbased.carservice.service.domain.Car
import com.jdriven.consumerbased.carservice.service.domain.CarSearch
import com.jdriven.consumerbased.carservice.service.domain.Color
import com.jdriven.consumerbased.carservice.service.domain.Fuel
import org.springframework.stereotype.Service
import java.time.LocalDate.of

@Service
class SearchService {
    private val cars = listOf(
            Car("Peugeot", "308", 2014, 12, Color.BLACK, Fuel.DIESEL, 80000, of(2014, 12, 24)),
            Car("Peugeot", "208", 2011, 10, Color.BLUE, Fuel.GASOLINE, 60000, of(2011, 10, 3)),
            Car("Volkswagen", "Polo", 1998, 1, Color.BLUE, Fuel.GASOLINE, 120000, of(1998, 5, 5)),
            Car("Volvo", "V40", 2013, 1, Color.GRAY, Fuel.GASOLINE, 5000, of(2013, 1, 1)),
            Car("Volvo", "V50", 2005, 1, Color.BLACK, Fuel.DIESEL, 160000, of(2005, 1, 1)),
            Car("Volvo", "XC90", 2016, 7, Color.BLACK, Fuel.DIESEL, 50000, of(2026, 7, 21)),
            Car("Volkswagen", "Up", 2008, 7, Color.BLACK, Fuel.GASOLINE, 80000, of(2008, 7, 16)),
            Car("Ford", "Ka", 1999, 1, Color.GREEN, Fuel.GASOLINE, 200000, of(1999, 1, 1)),
            Car("Citroen", "C3", 2008, 3, Color.BLACK, Fuel.GASOLINE, 80000, of(2014, 12, 24)),
            Car("Citroen", "BX", 1985, 1, Color.RED, Fuel.DIESEL, 210000, of(1995, 1, 5))
    )

    fun all() = cars
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