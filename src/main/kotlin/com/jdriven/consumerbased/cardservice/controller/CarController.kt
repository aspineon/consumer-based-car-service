package com.jdriven.consumerbased.cardservice.controller

import com.jdriven.consumerbased.cardservice.controller.dto.SearchResponse
import com.jdriven.consumerbased.cardservice.service.SearchService
import com.jdriven.consumerbased.cardservice.service.domain.CarSearch
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/car")
class CarController(private val searchService: SearchService) {

    @GetMapping
    fun all() = SearchResponse(searchService.all())

    @PostMapping("/search")
    fun search(@RequestBody carSearch: CarSearch) = SearchResponse(searchService.search(carSearch))
}