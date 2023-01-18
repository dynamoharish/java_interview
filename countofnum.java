import java.util.Scanner;
class countofnum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int number;
System.out.println("Enter the Number: ");
number = sc.nextInt();
int count=0;
while(number>0){
number=number/10;
count++;
}
System.out.println("No of digits in Number is: "+count);

}}
