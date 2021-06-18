import java.util.Random;
public class RandomMethod{
       public static void main(String args[]){
             System.out.println("The Random number = "+randomNumbers());
       }
       public static int randomNumbers(){
            Random rand=new Random();
            return rand.nextInt(51);
       }
}