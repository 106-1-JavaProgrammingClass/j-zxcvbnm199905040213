import java.nio.channels.Pipe;
import java.util.Scanner;

public class Ch16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float v1 = scn.nextFloat() ;
        float v2 = scn.nextFloat() ;
        System.out.println((v1*v1*3.1415926d*v2));


    }
}