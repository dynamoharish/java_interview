import java.util.Scanner;

class swap2numbers{

	public static void main(String args[]){

	int a,b,c,t;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the A value: ");
	a=sc.nextInt();
	System.out.println("Enter the B value: ");
	b=sc.nextInt();
	
/*	//logic 1:-
	
	t=a;
	a=b;
	b=t;

	System.out.println("After Swapping A value is "+a);
	System.out.println("After swapping B value is "+b);

	//logic 2:-	
	a=a+b;
	b=a-b;
	a=a-b;

	System.out.println("After Swapping A value is "+a);
	System.out.println("After swapping B value is "+b);

	//logic 3:-
	a=a*b;
	b=a/b;
	a=a/b;

	System.out.println("After Swapping A value is "+a);
	System.out.println("After swapping B value is "+b);

	//logic 4:-
	a=a^b;
	b=a^b;
	a=a^b;

	System.out.println("After Swapping A value is "+a);
	System.out.println("After swapping B value is "+b);
	
*/
	//logic 5;

	b=a+b-(a=b);
	
	System.out.println("After Swapping A value is "+a);
	System.out.println("After swapping B value is "+b);


}

}
