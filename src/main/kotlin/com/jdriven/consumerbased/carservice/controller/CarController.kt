package com.jdriven.consumerbased.carservice.controller

import com.jdriven.consumerbased.carservice.controller.dto.SearchResponse
import com.jdriven.consumerbased.carservice.service.SearchService
import com.jdriven.consumerbased.carservice.service.domain.CarSearch
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/car")
class CarController(private val searchService: SearchService) {

    @GetMapping
    fun all() = SearchResponse(searchService.all())

    @PostMapping("/search")
    fun search(@RequestBody carSearch: CarSearch) = SearchResponse(searchService.search(carSearch))
}