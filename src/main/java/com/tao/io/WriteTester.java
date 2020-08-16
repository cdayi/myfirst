package com.tao.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        FileWriter fr=new FileWriter("data2.txt");
        fr.write("abc");
        fr.flush();
        fr.close();
    }  //見建立data2.txt檔案，即可寫入
}
