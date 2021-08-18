import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("***Perfect Number***");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number!!!");
        int num = scan.nextInt();
        PerfectNumber.perfectNum(num);
    }

    public static void perfectNum(int n){
        int sum=0;
        System.out.println("The prime divisors are : ");

        for(int i=1;i<n;i++){
           int value=n%i;
           if(value==0){
               System.out.println(i);
               sum+=i;
           }
        }
        System.out.println("Sum of the divisors : ");
        System.out.println(sum);

        if(sum==n){
            System.out.println("As sum is equal to the given number. Its a Perfect Number!!!!");
        }
        else{
            System.out.println("As sum is not equal to the given number. Its not a Perfect Number!!!!");
        }
    }
}