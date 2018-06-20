package com.jdriven.consumerbased.cardservice.controller

import com.jdriven.consumerbased.cardservice.controller.dto.SearchResponse
import com.jdriven.consumerbased.cardservice.service.SearchService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/car")
class CarController(private val searchService: SearchService) {

    @GetMapping
    fun all() = SearchResponse(searchService.search())

    @PostMapping("/search")
    fun search() = SearchResponse(searchService.search())
}