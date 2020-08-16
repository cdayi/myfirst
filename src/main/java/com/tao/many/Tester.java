package com.tao.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {

        HashMap<String,String> stock=new HashMap<>();
        stock.put("2330","ABCD");//put(key,value)
        stock.put("2317","EFGH");//若key值重複，會將value複蓋
        System.out.println(stock.get("2330"));
        System.out.println(stock);
        for (String key:stock.keySet()//使用for each 讀出value
             ) {
            System.out.println(stock.get(key));
        }
        //hashset();
        //List();

        //arrayTes,t();
        //System.out.println("ABCDEF");
    }

    private static void hashlist() {
        HashSet<Integer> set=new HashSet<>();//set會自動檢查資料，不會有重複值
        set.add(3);
        set.add(6);
        set.add(4);
        set.add(9);
        set.add(6);
        for(int n:set) {       //set無法單筆找出個值，僅能利用迴圈找出
            System.out.println(n);
        }
    }

    private static void List() {
        ArrayList list=new ArrayList();
        list.add(1);//增加值到陣列
        list.add(6);
        list.add("abd");
        list.add(true);
        System.out.println(list);
        int n1=(int)list.get(0); //取陣列中的值
        String n3=(String)list.get(2);
        System.out.println("array size="+list.size());

        ArrayList<Integer> list1=new ArrayList();//陣列中僅能放integer
        list1.add(3);//增加值到陣列
        list1.add(6);
        list1.add(9);
        list1.add(8);
        System.out.println(list1);

        List<Integer> scores= Arrays.asList(44,55,57,88,99);
        for (int score:scores
             ) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers=new int[5];
        numbers[0]=5;
        numbers[1]=7;
        numbers[2]=9;
        numbers[3]=4;
        numbers[4]=3;
        int[] scores={68,88,77,55,66};

        for(int i=0;i<5;i++){
        System.out.println(scores[i]);
        }
        for (int n:numbers)
        {
            System.out.println(n);
        }
    }
}
