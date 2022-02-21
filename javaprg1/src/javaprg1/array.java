package javaprg1;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	  int[] arr = {23,82,57,45,38};
	
	System.out.println("Enter the number to search in an array : ");		
	 int n = sc.nextInt();
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==n)
		{
			System.out.println("Match Found!!");
		}
		
		else
		{
			System.out.println("Match Not Found!!");
			break;
		}

		
	}
	
}

}
         