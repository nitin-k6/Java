// Loops can execute a block of code as long as a specified condition is reached.
//Loops are handy because they save time, reduce errors, and they make code more readable.

public class Whileloopj{
    public static void main(String[] args){
        int i=0;
        //The while loop loops through a block of code as long as a specified condition is true
        while(i<5){
            System.out.println(i);
            i++; // If we don't increment then it will run till  infinite loop(0 will keep printing)
        }
    }
}