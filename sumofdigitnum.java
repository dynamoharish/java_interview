import java.util.Scanner;
class sumofdigitnum{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number: ");
int number=sc.nextInt();
int sum=0;
while(number>0){

int new_number = number%10;

sum = sum+new_number;
number = number/10;

}
System.out.println("The sum of Number is: "+sum);

}

}
