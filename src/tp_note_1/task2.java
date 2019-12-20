package tp_note_1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int h,m,s;
        Scanner sc= new Scanner(System.in);
        System.out.println("input seconde: ");
        int second = Integer.parseInt(sc.nextLine()); 
        h=second/3600;
        m=second/60;
        m=m%60;
        s=second%60;
        System.out.println("Time corresponding to "+second+"seconds is "+h+":"+m+":"+s);
    }
 
    
}