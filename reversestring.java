import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter any String Value: ");
	String name = sc.nextLine();
     StringBuilder sb=new StringBuilder();
     sb.append(name);

     StringBuilder rev = sb.reverse();
	System.out.println(rev);
        }
    }
