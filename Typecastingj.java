public class Typecastingj{
    public static void main(String[] args){


        // Widening casting is done automatically when passing a smaller size type to a larger size type:
        int a=9;
        double b=a;
        System.out.println(a);
        System.out.println(b); // int to double

        // Narrowing Casting
        // Narrowing casting must be done manually by placing the type in parentheses in front of the value:
       
         double b2= 9d;
         int a2=  (int)b2;
         System.out.println(b2);
         System.out.println(a2);

    }
}