package com.jiker.keju;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Taxi {
    public String calculateFare(String trafficText) {
        String[] trafficStepTexts = trafficText.split(",");
        String regEx="[^0-9]";
        Pattern pattern = Pattern.compile(regEx);

        Matcher milesMatcher = pattern.matcher(trafficStepTexts[0]);
        System.out.println( milesMatcher.replaceAll("").trim());
        Matcher waitingMinutesMatcher = pattern.matcher(trafficStepTexts[1]);
        System.out.println( waitingMinutesMatcher.replaceAll("").trim());
        return "";
    }
}
