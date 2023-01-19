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

if(first>second && first>third){

System.out.println("FIrst number is Greater than others !");
}
else if(second>first && second>third){
System.out.println("Second number is Greater than others !");

}
else{

System.out.println("Third number is Greater !");


}


}


}
