package com.tao.com

import java.time.LocalDateTime

fun main(args: Array<String>) {
    var parkinglot = HashMap<String, LocalDateTime>()
    var enter = LocalDateTime.of(2020, 8, 3,
            8, 0, 0);
    var car: Car= Car("AAA-0001", enter) //car may be a null
    parkinglot.put(car!!.id, car.enter)  //"!!"表示認同若null可接受
    car = Car("bbb-0002", enter.plusMinutes(15))
    parkinglot.put(car.id, car.enter)
    var level = LocalDateTime.of(2020, 8, 3,
            9, 0, 0)
    //第一台車
    enter = parkinglot.get("AAA-0001")
    car.leave = level
    println("${car?.id} duration: ${car?.duration()}")

    val hours1 = Math.ceil(car!!.duration() / 60.0)
    println("停車時間1：" + hours1)
}