package com.jiker.keju;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiTest {

    @Test
    public void should_show_price_given_only_paying_starting_fare() {
        Taxi taxi = new Taxi();
        assertEquals("收费6元", taxi.calculateFare("1公里,等待0分钟"));
    }
}
