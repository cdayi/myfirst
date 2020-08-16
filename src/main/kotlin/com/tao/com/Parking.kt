package com.tao.com
import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter=LocalDateTime.of(2020,7,22,10,20,0);
   // val leave=LocalDateTime.of(2020,7,22,12,50,0);
    val leave=LocalDateTime.now()
    val car=Car("AAA-1234",enter)
    car.leave=leave
    println(car.duration())
    val hours=Math.ceil(car.duration()/60.0)
    println("停車時間："+hours)

}

class Car(val id:String,val enter:LocalDateTime){
    var leave:LocalDateTime?=null//SETTER方法，檢查leave是否正確，在下一行使用set(value)
     set(value){
        if(enter.isBefore(value)){
            field=value
        }
    }
    fun duration()=Duration.between(enter,leave).toMinutes()
}