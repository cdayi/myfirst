package com.tao.com

import java.util.*
import java.util.Random//使用 java.util.Random 看看，可先刪除原 import 該行，
                         // 再用 Alt + Enter 另外 import

fun main(args: Array<String>) {

    val secret=Random().nextInt(10)+1
    println(secret)
    val scanner=Scanner(System.`in`)

    var number=0
    while(number !=secret) {
        println("enter a number")
        number = scanner.nextInt()
        //println(number)
        if(number > secret){
            println("please be lowwer")
        }else{
            println("please be higher")
        }

    }
    println("you get it "+number)

}