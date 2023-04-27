/* wap to print prime number from 1 to n using for loop :
//  exemple=2,3,5 */
import java.util.Scanner;
public class prime_for {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check print prime number from 1 to n");
        int num=sc.nextInt();
        for (int i=1;i<=num;i++){
            int count=0;
            for (int j=1;j<=i; j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2)
                System.out.println(i);
        }
    }
}

