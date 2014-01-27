package com.date;

/**
 * Created by prateekj on 1/27/14.
 */

class Date{
    int year;
    int month;
    int days;
}

public class DateAndTimeLib {
    Date getDate(String dateString){
        Date date = new Date();
        String[] dateParts = dateString.split("-");
        date.year  = Integer.parseInt(dateParts[0]);
        date.month = Integer.parseInt(dateParts[1]);
        date.days = Integer.parseInt(dateParts[2]);
        return date;
    }

    int getDifference(String date1, String date2){
        int totalDays;
        Date firstDate = getDate(date1);
        Date secondDate = getDate(date2);
        return 0;
    }
}
