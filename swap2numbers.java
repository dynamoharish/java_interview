import java.util.Scanner;

class swap2numbers{

	public static void main(String args[]){

	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the A value: ");
	a=sc.nextInt();
	System.out.println("Enter the B value: ");
	b=sc.nextInt();
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping A value is "+a);
	System.out.println("After swapping B value is "+b);


}

}
