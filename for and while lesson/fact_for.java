import java.util.Scanner;
public class fact_for {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to print factorial");
        int n=sc.nextInt(); int fac=1;
        for (int i=1; i<=n; i++){
            fac=fac*i;
        }
        System.out.println(fac);
    }
}
