import java.util.*;
public class Alphabets 
{  
	public static void main(String args[])  
	{  
		char[] arr=new char[26];
		arr=getAlphabetArray();    
                System.out.println("The Alphabetic characters are :");        
		for (int i = 0; i < arr.length; i++){
		System.out.print( arr[i]+ " ");     
	}}
	public static char[] getAlphabetArray()  
	{  
		char[] arr1= new char[26]; 
		char c='A';
		int i=0;
		while(c<='z')
		{
			arr1[i]=c;
			i++;
			c++;
                }
		return arr1;
	}
	 
}  