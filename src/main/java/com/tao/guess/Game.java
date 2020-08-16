package com.tao.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random=new Random();
        int secret=random.nextInt(10);
        System.out.println("random number:"+secret);

        Scanner scanner=new Scanner(System.in);
        int number=0;
        while(number != secret){

            System.out.println("input a number=: ");
             number=scanner.nextInt();
             if(number > secret){
                 System.out.println("number a  litter heigher");
                      }
             else if(number < secret){
                 System.out.println("number a  litter lower");
             }
             else{
                 System.out.println("you get it");
             }
        }
    }
}
