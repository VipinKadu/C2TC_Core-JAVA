package javaprg1;

public class swap {

	public static void main(String[] args) {
		
	int a = 50, b= 100;

        System.out.println("The Values of a and B are :");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        
        int temp = a;

        
        a = b;

        b = temp;

        System.out.println("The swapped values of a and b are :");
        System.out.println("a = " +a);
        System.out.println("b = " +b);

	}

}
