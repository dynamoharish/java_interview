class oddevencount{
public static void main(String args[]){

int number=1266613;
int odd_count=0;
int even_count=0;
int newnumber;
while(number>0){

newnumber=number%10;

if(newnumber%2==0){

even_count++;
}
else{

odd_count++;
}
number=number/10;
}
System.out.println("No of Odd number is"+odd_count);
System.out.println("No of Even number is"+even_count);

}
}
