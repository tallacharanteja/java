import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("not a prime number");
            return;
        }
        int i;
         boolean isprime=true;
        for(i=2;i*i<n;i++){
            if(n%i==0){
                System.out.println(" not a prime number");
            }
            break;
        }
        if(isprime){
            System.out.println(" a prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
