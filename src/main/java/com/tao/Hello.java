package com.tao;

public class Hello {

    public static void main(String[] args) {
     person p=new person("yuan",66.5f, 1.7f);
     p.hello();
     //p.weight=66.5f;
     //p.height=1.7f;
     System.out.println(p.bmi());
     System.out.println(p.name+"  "+p.height+"  "+p.weight);
     System.out.println("中文系統");
     System.out.print("請輸入英文成績");

     /*Integer a1=8;
     float a3=34.5f;*/
    }
}
