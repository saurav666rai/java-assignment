import java.util.Scanner;

public class fact_do_while {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print reverse");
        int num=sc.nextInt();
        int fac=1; int i=1;
        do {
            fac=fac*i;
            i++;
        }while (i<=num);
        System.out.println(fac);
    }
}
