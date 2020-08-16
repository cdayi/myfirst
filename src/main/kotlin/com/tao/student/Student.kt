package com.tao.student

import java.util.*

fun main(args: Array<String>) {

    Student1.pass=50//類別層級

    //userinput()
    val stu = Student1("name", 77,88)
   //stu.print()
    val stu1 = Student1("name1", 55,55)
    stu.print()
    stu1.print()

   // System.out.println("\t"+"成績等級"+stu.grading() )
    System.out.println("最高分數成績："+"\t"+stu.hightest())
}
class Student1(var name:String,var english:Int,var math:Int) {

     companion object{ //設定類別層級的方式
         var pass=60
     }

    fun print() {
        System.out.print(name + "\t" + english + "\t" + math + "\t"
                + getAverage() + "\t" +
                if (getAverage() > pass) "PASS" else "FAILED"  )

        System.out.println("\t成績等級\t"+grading())
    }

 fun grading(): Char{
      var grading=when(getAverage())
      {
    in 90..100 ->'A'
    in 80..89 -> 'B'
    in 70..79 -> 'C'
    in 60..69 -> 'D'
    else -> 'F'
}
    return grading
    }

    fun getAverage():Int{

        return  (english+math)/2
    }

     fun hightest():Int{

         var max=if (english >math)
                    {   System.out.print("english")
                        english}
                        else
                        { print("math")
                            math     }
         return max
    }


private fun userinput() {
    val scanner = Scanner(System.`in`)
    System.out.print("請輸入姓名")
    val name = scanner.next()

    System.out.print("請輸入英文成績")
    val english = scanner.nextInt()

    System.out.print("請輸入數學成績")
    val math = scanner.nextInt()

    val stu = Student1(name, english, math)
    stu.print()
}


}
