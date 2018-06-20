package com.jdriven.consumerbased.cardservice.controller.dto

import com.jdriven.consumerbased.cardservice.service.domain.Car

data class SearchResponse(val cars: List<Car>)