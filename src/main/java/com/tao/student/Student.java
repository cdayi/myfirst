package com.tao.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass=60;//類別層級的定義+static

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public float heightest(){ //最高的成績

       int max= (english > math) ? english:math;
//       if (english > math){
//           max=english;
//       }else{
//           max=math;
//       }
       return max;
    }

    public int getAverage(){
        return (english+math)/2;
    }

    public void print(){

        System.out.print(name+"\t"+english+"\t"+math+"\t"
                           +getAverage());

        if (getAverage() >= pass) {
            System.out.print("\t YOU PASS");
        }else {
            System.out.print("\t you failed");
        }

        char grading='F';
        switch (getAverage()/10){
            case 9:
                grading='A';
                break;
            case 8:
                grading='B';
                break;
            case 7:
                grading='C';
                break;
            case 6:
                grading='D';
                break;
            default:
                grading='F';
        }
      System.out.println("\t grading:"+grading);

    }

}




