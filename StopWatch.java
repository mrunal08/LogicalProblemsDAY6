import java.util.Scanner;
public class StopWatch {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("START");
        System.out.println("Type something to stop time after Start");
        long startTime = System.currentTimeMillis();

        Scanner scan = new  Scanner(System.in);
        String a =scan.next();
        long stopTime =System.currentTimeMillis();

        long reactionTime=stopTime-startTime;
        System.out.println("Total Time : "+reactionTime+"ms");





    }


}
