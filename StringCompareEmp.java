import java.util.Scanner;
public class StringCompareEmp{
   public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the two strings of same size:");
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      System.out.println( "The First word when alaphabetically arranged is "+findFirstWord(str1,str2));
   }
   public static String findFirstWord(String S1,String S2){
   for(int i=0;i<S1.length();i++)
   {
   if((int)S1.charAt(i)==(int)S2.charAt(i))
   {
       continue;
   }
   else if((int)S1.charAt(i)<(int)S2.charAt(i))
   {
       return S1;
   }
   else 
   {
       return S2;
   }
   }
   return "null";
}
}