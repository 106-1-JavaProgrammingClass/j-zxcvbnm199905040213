import java.util.Scanner;

public class HW06 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cm = scn.nextInt();
        int kg = scn.nextInt();
        System.out.println((double) Math.round(kg)/0.454);
        System.out.println((double)Math.round(cm)/2.54);
    }
}