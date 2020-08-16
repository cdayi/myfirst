package com.tao.com

import java.util.*

fun main(args: Array<String>) {
    val secret=Random().nextInt(10)+1
    println(secret)
    val scanner=Scanner(System.`in`)
    for(i in 1..4){
        System.out.println("請輸入一數字(${i}/4:)")
        var  number=scanner.nextInt()

        println("第${i}次輸入: $number")

        if(number>secret){
            println("be lowwer")
        }else if(number<secret){
            println("be higher")
        }else{
            println("you get it:"+number)
            println("game over")
            break

        }
    }

}
