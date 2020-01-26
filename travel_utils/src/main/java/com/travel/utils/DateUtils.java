package com.travel.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //Date to string
    public static String dateToString(Date date, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String format = sdf.format(date);
        return format;
    }


    //String to Date
    public static Date stringToDate(String str, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date parse = sdf.parse(str);
        return parse;
    }

    public static String iToS(Integer i){
        if(i==0){
            return "CLOSE";
        }else{
            return "OPEN";
        }
    }

    public static String orderiToS(Integer i){
        if(i==0){
            return "UNPAID";
        }else{
            return "PAID";
        }
    }
}
