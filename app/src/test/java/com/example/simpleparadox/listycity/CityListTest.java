package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CityListTest {
    @Test
    void testHasCity(){
        CityList cityList = new CityList();
        City city1 = new City("Edmonton", "AB");
        City city2 = new City("Saskatoon", "SK");
        City city3 = new City("Calgary", "SK");
        City city4 = new City("Suzhou", "Jiangsu");
        cityList.add(city1);
        assertTrue(cityList.hasCity(city1));
        cityList.add(city2);
        assertTrue(cityList.hasCity(city2));
        assertFalse(cityList.hasCity(city3));
        assertFalse(cityList.hasCity(city4));
    }
}
