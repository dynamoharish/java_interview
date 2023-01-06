import java.util.Scanner;

class reverse_number{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the any Number");

int num=sc.nextInt();

/*
//Logic 1(Using Algorithm)
int rev=0;

while(num!=0){

	rev=rev*10+num%10;
	num=num/10;
}
System.out.println("Reversed Number is "+rev);

//Logic 2(Using StringBuffer class)

StringBuffer rev;
StringBuffer sb=new StringBuffer(String.valueOf(num));
rev = sb.reverse();
System.out.println("Reversed Value is "+rev);

*/

//Logic 3("Using StringBuilder class")

StringBuilder sb=new StringBuilder();
sb.append(num);
StringBuilder rev=sb.reverse();
System.out.println(rev);



}


}