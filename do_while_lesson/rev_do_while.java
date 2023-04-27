import java.util.Scanner;

public class rev_do_while {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int num=sc.nextInt();
        int rev=0;
        do {
            rev=(rev*10)+(num%10);
            num=num/10;
        }while(num>0);
        System.out.println(rev);
    }
}