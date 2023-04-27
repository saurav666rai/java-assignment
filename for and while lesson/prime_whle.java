/* wap to print prime number from 1 to n using while loop :
//  exemple=2,3,5 */
import java.util.Scanner;
public class prime_whle {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print prime number from 1 to n");
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            int j=1; int count=0;
            while(j<=i){
                if (i%j==0)
                    count++;
                j++;
            }
            if (count==2)
                System.out.println(i);
            i++;
        }
    }
}
