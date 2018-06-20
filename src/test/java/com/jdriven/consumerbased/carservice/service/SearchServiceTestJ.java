package com.jdriven.consumerbased.carservice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchServiceTestJ {
    private SearchService searchService;

    @BeforeEach
    public void setup() {
        searchService = new SearchService();
    }

    @Test
    public void all() {
        assertThat(searchService.all()).hasSize(10);
    }
}
