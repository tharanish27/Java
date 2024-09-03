import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = sc.nextInt();
        int a = 0, b = 1, next;
        System.out.print("Fibonacci Sequence: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}
