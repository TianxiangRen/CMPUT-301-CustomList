package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
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


    @Test
    void testDelete(){
        CityList cityList = new CityList();
        City city1 = new City("Edmonton", "AB");
        cityList.add(city1);
        assertTrue(cityList.hasCity(city1)); // The city is there before the deletion
        cityList.delete(city1);
        assertFalse(cityList.hasCity(city1)); // The city has gone after the deletion
        assertThrows(IllegalArgumentException.class, ()->{
            cityList.delete(city1);
        });
    }
}
