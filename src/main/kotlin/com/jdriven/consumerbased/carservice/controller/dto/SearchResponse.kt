package com.jdriven.consumerbased.carservice.controller.dto

import com.jdriven.consumerbased.carservice.service.domain.Car

data class SearchResponse(val cars: List<Car>)