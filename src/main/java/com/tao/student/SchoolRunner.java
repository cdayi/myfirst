package com.tao.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {

        //userinput(); 按 ctrl +alt + m
        Student.pass=50;//類別層級

        GraduateStutent grad=new GraduateStutent(
                "NAME4",70,80,90) ;
        grad.print();

        Student stu=new Student("name",88,55);
        Student stu1=new Student("name1",30,65);
        Student stu2=new Student("name2",50,55);
        stu.print();
        stu1.print();
        stu2.print();

        System.out.println("MAX VALUE:"+stu.heightest());
    }

    private static void userinput() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter name");
        String name=scanner.next();

        System.out.print("Please enter English score");
        int english=scanner.nextInt();

        System.out.print("Please enter math score");
        int math=scanner.nextInt();

        Student stu=new Student(name,english,math);
        stu.print();
        System.out.println("MAX VALUE:"+stu.heightest());
    }
}
