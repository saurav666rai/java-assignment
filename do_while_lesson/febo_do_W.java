import java.util.Scanner;

public class febo_do_W {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the terms");
        int num=sc.nextInt();
        int x=0;
        int y=1;
        int sum=0;
        do {
            System.out.println(sum);
            x=y;
            y=sum;
            sum=x+y;
        }while(sum<num);
    }
}
