import java.util.Scanner;
class prime{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number to check prime or Not :");

int number = sc.nextInt();

int count=0;

if(number>1){

for(int i=1;i<=number;i++){

	if(number%i==0){

	count++;
	}
if(count==2){

System.out.println("Prime Number !");
}
else{
System.out.println("Not a Prime Number !");
}
}


}
else{
System.out.println("Not a Prime Number !");

}

}}
