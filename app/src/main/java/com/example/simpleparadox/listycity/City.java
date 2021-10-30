package com.example.simpleparadox.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    /**
     * This method compare the cities based on their city names.
     * @param city
     *      A candidate city that is going to be compared to the current city
     * @return
     *      -1, 0, 1 based on whether the city comes before or after or equal
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

}
