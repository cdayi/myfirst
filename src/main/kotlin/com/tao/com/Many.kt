package com.tao.com

import java.time.LocalDateTime

fun main(args: Array<String>) {
    var parkinglot=HashMap<String,Car?>()
    var enter= LocalDateTime.of(2020,8,3,
            8,0,0);
    var car:Car?=Car("AAA-0001",enter) //car may be a null
    parkinglot.put(car!!.id,car)  //"!!"表示認同若null可接受
    car= Car("bbb-0002",enter.plusMinutes(15))
    parkinglot.put(car.id,car)
    var level=LocalDateTime.of(2020,8,3,
            9,0,0)
    //第一台車
     car=parkinglot.get("AAA-0001")
    car?.leave=level
    println("${car?.id} duration: ${car?.duration()}")

    val hours1=Math.ceil(car!!.duration()/60.0)
    println("停車時間1："+hours1)
    parkinglot.remove(car?.id) //車離開移除記錄
    println("車庫還有多少車："+parkinglot.size)

    //第二台車
    car=parkinglot.get("bbb-0002")
    car?.leave=level.plusMinutes(130)
    println("${car?.id} duration: ${car?.duration()}")

    val hours2=Math.ceil(car!!.duration()/60.0)
    println("停車時間2："+hours2)




    /*val list= listOf(1,2,3,4)//不可在增加list內元素
    println(list)
    val scores= listOf(99,88,66,55)
    for(score in scores){
        println(score)
    }
    val mutableList= mutableListOf(5,6,8,3) //可增加list內值 mutable
    mutableList.add(7)
     println(mutableList)*/
}