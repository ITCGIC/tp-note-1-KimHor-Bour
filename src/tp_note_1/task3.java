package tp_note_1;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        int h,m,s;
        Scanner sc= new Scanner(System.in);
        System.out.println("Program for converting time to seconds.");
        System.out.print("Please input hours: ");
        h=Integer.parseInt(sc.nextLine());
        System.out.print("please input minutes: ");
        m=Integer.parseInt(sc.nextLine());
        System.out.print("Please input Second: ");
        s=Integer.parseInt(sc.nextLine());
        int second=(h*3600)+(m*60)+s;
        System.out.println("\n----------------------------------");
        System.out.println("Number of seconds = "+h+"x3600 + "+m+"x60 + "+s+" = "+second);

    }
}