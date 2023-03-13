import java.util.Scanner;
public class Input2 {
    public static void main(String[] args) {
        System.out.println("Taking the input from the user");
        Scanner S = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = S.nextInt();
        System.out.println("Enter second number");
        int b = S.nextInt();

        int sum = a + b;
        System.out.println("The sum is");
        System.out.println(sum);
        
        

    }
}


