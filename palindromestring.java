import java.util.Scanner;

class palindromestring{


public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter any String");
String name = sc.nextLine();
String org_string=name;

StringBuilder sb=new StringBuilder();
sb.append(name);
sb.reverse();
String rev = sb.toString();
if(org_string.equals(rev)){

System.out.println("The given String is Palindrome");
}
else{
System.out.println("The given String is Not palindrome");

}

}
}
