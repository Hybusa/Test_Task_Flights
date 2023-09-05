package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flightList =  FlightBuilder.createFlights();
        System.out.println(flightList);
        System.out.println();

        FlightFilter flightFilter = new FlightFilterBeforeNow();
        System.out.println("Departure before now: \n" +flightFilter.filterFlights(flightList));
        System.out.println();

        flightFilter = new FlightFilterArrivalBeforeDeparture();
        System.out.println("Arrival before departure: \n" + flightFilter.filterFlights(flightList));
        System.out.println();

        flightFilter = new FlightFilterMoreThen2HoursOnLand();
        System.out.println("More then 2 hours on land: \n" +flightFilter.filterFlights(flightList));
        System.out.println();
    }
}