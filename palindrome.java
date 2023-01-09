import java.util.Scanner;

class palindrome{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the any Number");

int num=sc.nextInt();

int org_num=num;
//Logic 1(Using Algorithm)
int rev=0;

while(num!=0){

	rev=rev*10+num%10;
	num=num/10;
}
if(org_num==rev){

System.out.println("The given number is Palindrome");

}
else{
System.out.println("The given number is Not a Palindrome");

}


}


}
