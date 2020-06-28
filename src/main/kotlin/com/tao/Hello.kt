package com.tao

fun main(args: Array<String>) {

   var h=Human(weight=66.5f,height=1.7f)

    h.hello()
    h.bmi()
}
class Human(var weight :Float, var height :Float){

    fun bmi() {

     var bmi=weight/(height*height)
     //return bmi
        println(bmi)

    }
    fun hello(){
        println("Hello Kotlin")
    }
}
