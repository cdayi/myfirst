package com.tao;

public class person {

    float weight;
    float  height;
    String name;
    public person(String name,float weight,float height){
        this.name=name;
        this.weight=weight;
        this.height=height;

    }

    public person(float weight,float height) {

    }

    public float bmi() {
          float bmi = weight/(height*height);
          return bmi;
    }

   // System.out.println(bmi);

   /* Integer a1=8;
    float weight = 66.5f;
    String a2="chang";
    char a3='d';*/

    public void hello(){
        System.out.println("Hello wORLD");
    }
}
