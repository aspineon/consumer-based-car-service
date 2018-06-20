package com.jdriven.consumerbased;

import com.jdriven.consumerbased.carservice.Application;
import com.jdriven.consumerbased.carservice.controller.CarController;
import com.jdriven.consumerbased.carservice.service.SearchService;
import com.jdriven.consumerbased.carservice.service.domain.Car;
import com.jdriven.consumerbased.carservice.service.domain.Color;
import com.jdriven.consumerbased.carservice.service.domain.Fuel;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public abstract class BaseClass {

    public static final String THE_BEST_CAR_BRAND = "BMW";
    public static final String THE_SINGLE_BEST_CAR_BRAND = "Volkswagen";

    @Autowired
    CarController carController;

    @MockBean
    SearchService searchService;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(carController);


        Mockito.when(searchService.all())
                .thenReturn(
                        Arrays.asList(
                                new Car(THE_BEST_CAR_BRAND, "1", 2017, 12, Color.BLACK, Fuel.GASOLINE, 0, LocalDate.now()),
                                new Car(THE_SINGLE_BEST_CAR_BRAND, "1", 2017, 12, Color.BLACK, Fuel.DIESEL, 0, LocalDate.now()))
                );
    }

}