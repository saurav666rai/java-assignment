import java.util.Scanner;

public class table_do_while {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print table");
        int num=sc.nextInt();
        int i=1;
        do {
            System.out.println(num+"x"+i+"="+num*i);
            i++;
        }while(i<=10);
    }
}
