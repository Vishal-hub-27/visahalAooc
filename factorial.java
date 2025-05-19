import java.util.*;
class factorial{
public static void main(String args[]){
int i,fact=1,n;
Scanner sc= new Scanner(System.in);
System.out.println("enter the number you want to find factorial of: ");
n=sc.nextInt();
for(i=1;i<=n;i++){
fact*=i;
}//end of for loop
System.out.println("factorial="+fact);

}
}