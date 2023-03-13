 public class Brcont{
    public static void main(String[] args){
        for(int i=0; i<10; i++){
            if(i==4){
                break;
            }  // loops stop when it encounter 4
            System.out.println(i); // 4 will not get printed
        }     // 0 to 3 gets printed
    }
 }

/*public class brcont{
    public static void main(String[] args){
        for(int i=0; i<10; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);  //0 to 9 get printed leaving 3
        }
    }
}*/
