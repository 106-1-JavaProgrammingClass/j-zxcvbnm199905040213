import java.util.Scanner;

public class Ch10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String v1 = scn.nextLine();
        char v2 = scn.next().charAt(0);
        char v3 = scn.next().charAt(0);
        System.out.println(v1.replace(v2,v3));
    }
}