import java.util.Scanner;
class largestof3number{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int first,second,third;

System.out.println("Enter the First Number : ");
first = sc.nextInt();
System.out.println("Enter the Second Number : ");
second = sc.nextInt();
System.out.println("Enter the Third Number : ");
third = sc.nextInt();
int largest,largest2;
/*
//Logic 1
if(first>second && first>third){

System.out.println("Largest no is: "+first);
}
else if(second>first && second>third){
System.out.println("Largest no is: "+second);

}
else{
System.out.println("Largest no is: "+third);
}
*/

//logic 2 using ternary operator
largest = first>second?first:second;
largest2 = third>largest?third:largest;
System.out.println("Largest no is : "+largest2);

}
}
