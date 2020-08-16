package com.tao.student;

public class GraduateStutent extends Student {

    int thesis;
    static int pass=70;
    public  GraduateStutent(String name,int english,int math,int thesis){
        super(name,english,math);
        this.thesis=thesis;
    }

    @Override //ctrl + o "複寫父類別方法
    public float heightest() {
        //int max= (english > math) ? english:math;
        int max=0;
    if (english > math){
        max=english;
      } else if(math>english) {
          max=math;
         }else if(thesis>max){
            max=thesis;
        }
        return max;
    }

    @Override
    public int getAverage() { return (english+math+thesis)/3;
                          }

    @Override
    public void print() {
        System.out.print(name+"\t"+english+"\t"+math+"\t"
                +thesis+"\t"+getAverage());

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

