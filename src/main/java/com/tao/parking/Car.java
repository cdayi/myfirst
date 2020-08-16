package com.tao.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;

    public Car(String id, LocalDateTime enter) {//按 "ALT+ INSERT產生建構子
        this.id = id;
        this.enter = enter;
    }
    public void leave(){
        leave=LocalDateTime.now();
    }

    public  long getDuration(){//得到進場和離場時間差
        Duration duration=Duration.between(enter,leave);
        return duration.toMinutes();
    }

    public void setleave(LocalDateTime leave){//設計一方法，當外界傳進leave值時，可經檢查是否正確
       if(leave.isAfter(enter) ){
           this.leave=leave;
       }
    }
}
