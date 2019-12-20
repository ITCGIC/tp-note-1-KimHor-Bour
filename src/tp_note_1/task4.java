package tp_note_1;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        int h1,h2,m1,m2,s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for calculating cost of a call.");
        System.out.print("Please input start hours: ");
        h1=Integer.parseInt(sc.nextLine());
        System.out.print("Please input start minutes: ");
        m1=Integer.parseInt(sc.nextLine());
        System.out.print("Please input start seconds: ");
        s1=Integer.parseInt(sc.nextLine());
        System.out.print("Please input end hours: ");
        h2=Integer.parseInt(sc.nextLine());
        System.out.print("Please input end minutes: ");
        m2=Integer.parseInt(sc.nextLine());
        System.out.print("Please input end seconds: ");
        s2=Integer.parseInt(sc.nextLine());

        int hs1,hs2,ms1,ms2,start,end,uses;
        //find second that start time
        hs1=h1*3600;
        ms1=m1*60;
        start=hs1+ms1+s1;
        //find second that end time
        hs2=h2*3600;
        ms2=m2*60;
        end=hs2+ms2+s2;
        //find second that use
        uses=end-start;
        //find hours minute and second used
        int hs=uses/3600;
        int ms=uses/60;
            ms=ms%60;
        int s=uses%60;
        //calculate price 
        double price=((hs*60)*0.05)+(ms*0.05)+((0.05*s)/60);

        System.out.println("-----------------------------");
        System.out.println("Total call duration: "+hs+"h "+ms+"mn "+s+"s");
        System.out.println("Total cost of this call: "+price+"$");
    }
}