package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to be added
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns a sorted list of cities
     * @return
     *      return the sorted list
     */
    public List<City>getCities(){
        List<City>list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * When given a city, return whether or not it belongs in the list
     * @param city
     *      a candidate city that is going to be checked whether it is in the city list
     * @return
     *      true if in the list; false otherwise
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }


    /**
     * Check if a city is present in the list. If it does then remove it from the list, if not then throw an exception
     * @param city
     *      a candidate city that is going to be removed from the list
     */
    public void delete(City city){

    }

}
