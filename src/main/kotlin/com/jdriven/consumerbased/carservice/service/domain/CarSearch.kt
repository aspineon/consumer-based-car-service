package com.jdriven.consumerbased.carservice.service.domain

data class CarSearch(val make: String?,
                     val model: String?,
                     val yearMin: Int?,
                     val yearMax: Int?,
                     val color: Color?,
                     val fuel: Fuel?,
                     val kilometersMin: Int?,
                     val kilometersMax: Int?)