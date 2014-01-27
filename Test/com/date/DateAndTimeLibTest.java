package com.date;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by prateekj on 1/27/14.
 */
public class DateAndTimeLibTest {
    @Test
    public void test_to_convert_string_in_date_form() throws Exception {
        DateAndTimeLib temp = new DateAndTimeLib();
        String date = "2014-01-27";
        Date expected = new Date();
        expected.days = 27;
        expected.month = 01;
        expected.year = 2014;
        Date actual = temp.getDate(date);
        assertEquals(expected.month,actual.month);
        assertEquals(expected.days,actual.days);
        assertEquals(expected.year,actual.year);
    }


}
