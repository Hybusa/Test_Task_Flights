package com.gridnine.testing;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class FlightFilterTest {
    FlightFilter flightFilter;
    List<Flight> flightList = FlightBuilder.createFlights();
    @Test
    public void filterBeforeNowTestFromCreated_Success(){
        flightFilter = new FlightFilterBeforeNow();

        List<Flight> expectedFlights =   IntStream.range(0, flightList.size())
                .filter(i -> i!=2)
                .mapToObj(flightList::get)
                .collect(Collectors.toList());

        List<Flight> filteredActualList  = flightFilter.filterFlights(flightList);

        Assert.assertEquals(expectedFlights,filteredActualList);
    }

    @Test
    public void filterArrivalBeforeDeparture_Success(){
        flightFilter = new FlightFilterArrivalBeforeDeparture();

        List<Flight> expectedFlights =   IntStream.range(0, flightList.size())
                .filter(i -> i!=3)
                .mapToObj(flightList::get)
                .collect(Collectors.toList());

        List<Flight> filteredActualList  = flightFilter.filterFlights(flightList);

        Assert.assertEquals(expectedFlights,filteredActualList);
    }

    @Test
    public void filterMoreThen2HoursOnLand_Success(){
        flightFilter = new FlightFilterMoreThen2HoursOnLand();

        List<Flight> expectedFlights =   IntStream.range(0, flightList.size())
                .filter(i -> i!=4&&i!=5)
                .mapToObj(flightList::get)
                .collect(Collectors.toList());

        List<Flight> filteredActualList  = flightFilter.filterFlights(flightList);

        Assert.assertEquals(expectedFlights,filteredActualList);
    }

}