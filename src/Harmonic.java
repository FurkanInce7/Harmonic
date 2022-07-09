 import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {

        int N;
        double result= 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Put your N number: ");
        N= input.nextInt();

        for (double i= 1 ; i <= N; i++) {
            result += ( 1 / i);
        }
        System.out.println("Your harmonic number is "+ result);
    }
}
