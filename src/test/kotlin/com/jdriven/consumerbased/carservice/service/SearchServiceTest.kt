package com.jdriven.consumerbased.carservice.service

import com.jdriven.consumerbased.carservice.service.SearchService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class SearchServiceTest {

    private lateinit var searchService: SearchService

    @BeforeEach
    fun setup() {
        searchService = SearchService()
    }

    @Test
    fun all() {
        assertThat(searchService.all()).hasSize(10)
    }
}