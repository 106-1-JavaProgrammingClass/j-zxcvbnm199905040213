import java.util.Scanner;

public class Ch05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int weight = scn.nextInt();
        int height = scn.nextInt();
        System.out.println(weight / 2.54);
        System.out.println(height / 0.454);
    }
}
