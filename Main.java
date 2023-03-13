public class Main{
    public static void main(String[] args){
        String txt= "hellohowareyou";
        System.out.println(txt);
        // System.out.println( "The length of the String is " + txt.length());
        System.out.println(txt.length());
        String txt2 ="Nitin Kumar";
        System.out.println(txt2.toUpperCase()); //NITIN KUMAR
        System.out.println(txt2.toLowerCase()); //nitin kumar

       //finding location in a string
        String s="Nitin you are a good man";
        System.out.println(s.indexOf("you"));// returns index of first letter of a specified text including whitespace// index starts from 0.

        //Comparing strings by compareTo() and equals()
        String a="NITIN";
        String b="NITIN";
        System.out.println(a.compareTo(b)); //returns index 0 coz both are equal
        System.out.println(a.equals(b));   // returns true if it's equal otherwise false
        

       String a1= "Nitin";
       String b1= "Kumar";
       System.out.println(a1.concat(b1)); //combines both => NitinKumar

       System.out.println("NitinKumar"); // => NitinKumar
    }
}


