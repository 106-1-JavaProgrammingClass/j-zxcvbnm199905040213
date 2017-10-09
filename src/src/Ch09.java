import java.util.Scanner;

public class Ch09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float v1 = scn.nextFloat();
        System.out.println(Math.round(v1/600*10)/10f);
    }
}
