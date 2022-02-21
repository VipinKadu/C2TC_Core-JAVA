package javaprg1;
import java.util.Scanner;

public class arroccur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {3,82,57,45,3,8};
		System.out.println("Enter the number to get its occurences : ");
		int n = sc.nextInt();
		int repeated = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(n == arr[i])
			{
				repeated++;
			}

		}
		
System.out.println(n+"  occurred  "+repeated+"  times  ");
	}

}
