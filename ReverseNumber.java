import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        System.out.println("Enter the number to be reversed!!! ");
        Scanner scan=new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("The given number is : "+number);
        ReverseNumber.rNumber(number);
    }

    public static void rNumber(int n){
        int reverseNum=0;
        while(n>0){
            int remainder = n%10;
            reverseNum=(reverseNum*10)+remainder;
            n=n/10;

        }
        System.out.println("Reverse of given number is : "+reverseNum);
    }
}
