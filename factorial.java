import java.util.Scanner;
class factorial{  
 public static void main(String args[]){
//Using Loop  
  int i,fact=1;  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number: ");
  int number=sc.nextInt();
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
