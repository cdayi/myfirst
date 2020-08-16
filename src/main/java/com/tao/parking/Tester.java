package com.tao.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Tester {

    public static void main(String[] args) {

        LocalDateTime  enter=
                LocalDateTime.of(2020,7,19,18,20,0);
        LocalDateTime leave=
                LocalDateTime.now();//車離開的系統時間
        //System.out.println(enter);

        Car car=new Car("AAA-1234",enter);
        car.setleave(leave);;
        System.out.println("car duration:"+car.getDuration());
        long hours=(long)Math.ceil(car.getDuration()/60.0);//ceil取最大整數
        System.out.println(hours);

       // System.out.println(System.currentTimeMillis());//目前系統時間

        //java8();
              //CTRL+ALT+M

        //java();



    }

    private static void java8() {
        //java8
        Instant instant=Instant.now();//現在的時間
        System.out.println(instant);
        //local
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        //格式化時間
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));

        now=now.plus(Duration.ofDays(3));//設定時間+3小時
        System.out.println(formatter.format(now));

        //自訂時間格式
        LocalDateTime
                other=LocalDateTime.of(2020,11,18,20,15,0);
        System.out.println(formatter.format(other));
    }

    private static void java() {
        Date date=new Date();
        System.out.println((date));
        System.out.println((date.getTime()));
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        System.out.println((sdf.format(date)));

        String s= "2019/07/20 15:20:30";// 日期格式轉換：Sun Dec 29 15:20:30 CST 2019
        Date otherday=null;
        try {

            otherday=sdf.parse(s);;//在parse上按 ALT+ ENTER
            System.out.println(otherday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());//時間計算使用CALDENRAR
        calendar.set(Calendar.MONTH,9);
        System.out.println(calendar.getTime());//得到data時間用gettime
        calendar.add(Calendar.DAY_OF_YEAR,3);//增加日期方式
        System.out.println(calendar.getTime());
    }

}





