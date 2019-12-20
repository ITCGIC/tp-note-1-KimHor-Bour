package tp_note_1;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        int n;
        int riel=4000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for converting money in Riels to Dollars.");
        System.out.println("\tConversion rate is: 1 USD = 4000 RIELS");
        System.out.print("\tPlease input money in Riels: ");
        n= Integer.parseInt(sc.nextLine());

        double dollar = (double)n/riel;
        System.out.println("--------------------------");
        System.out.println(n+" RIELS = "+dollar+" USD");
    }

    
}