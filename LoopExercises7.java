package Loops.Exercises7;
import java.util.Scanner;
public class LoopExercises7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number n in the harmonic series:");
            int n=input.nextInt();
            double result=0;
            for(double i=1;i<=n;i++){
                result=(1/i)+result;
            }
            System.out.println(result);
        }

    }
    
}
