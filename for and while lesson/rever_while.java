import java.util.Scanner;

public class rever_while {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int n=sc.nextInt(); int rem=0;
        int rev=0;
        while(n>0){
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        System.out.println(rev);

    }
}
