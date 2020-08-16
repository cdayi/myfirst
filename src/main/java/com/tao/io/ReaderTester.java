package com.tao.io;

import java.io.*;

public class ReaderTester {
    public static void main(String[] args) {

        try {
            BufferedReader br=new BufferedReader(new FileReader("data.txt"));
            String line=br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //filereader();
        //inputstream();

    }

    private static void filereader() {
        try {
            FileReader fr=new FileReader("data.txt");
            int n=fr.read();//讀人整行中文資料
            while(n!=-1){
                System.out.print((char)n);
                n=fr.read();
            }
             System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputstream() {
        File file=new File("data.txt");//在myfirst下建立檔案data.txt
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

        try{
        FileInputStream is=new FileInputStream(file);
        int n=is.read();
        while(n!=-1){

          System.out.println((char)n);
            n=is.read();//ioException of error
        }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();//印出檔案錯誤追蹤軌跡
            System.out.println("message");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("file open success");
    }

}
