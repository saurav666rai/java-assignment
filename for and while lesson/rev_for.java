import java.util.Scanner;

public class rev_for {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int num=sc.nextInt();
        int rev=0;
        for (;num>0;num=num/10){
            rev=(rev*10)+(num%10);
        }
        System.out.println(rev);
    }
}
