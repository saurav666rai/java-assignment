import java.util.Scanner;

public class table_for {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want to print table");
        int num=sc.nextInt();
        for (int i=1;i<=10; i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
