package com.tao.guess;

import java.util.Random;
import java.util.Scanner;

public class Gamefor {
    public static void main(String[] args) {

        int secret=new Random().nextInt(10)+1;
        System.out.println(secret);

        Scanner scanner=new Scanner(System.in);

        for(int i=1;i<=4;i++){
           System.out.println("please enter a number:"+i+"/4");
           int number=scanner.nextInt();
           System.out.println("the no."+i+"time:  "+number);
           if(number>secret){
               System.out.println("please be higher");
           }else if(number < secret){
               System.out.println("please be lowwer");
           }else{
               System.out.println("you get it:  "+number);
               break;
           }
            System.out.println("end");
        }

    }
}
