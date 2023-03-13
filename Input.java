import java.util.Scanner;     // Importing scanner class
public class Input {
    public static void main(String[] args) {
        System.out.println("Taking input from the User");
        Scanner S = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = S.nextInt();
        System.out.println("Enter second number");
        int b =  S.nextInt();
        int sum = a + b;
        System.out.println("The sum of these numbers is : ");
        System.out.println(sum);



        boolean b1 = S.hasNextInt();  /*Used for checking the validity of expression. 
        i.e. to check whether user input is valid or not*/
        System.out.println(b1);

        // String str = S.next();
        // System.out.println(str);

        String str = S.nextLine();
        System.out.println(str);
    }
}
