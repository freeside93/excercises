import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1-во число: ");
        double firstNum = scan.nextDouble();
        System.out.print("2-ро число:");
        double secondNum = scan.nextDouble();
        System.out.printf("%s, + %s  = %s", firstNum, secondNum, firstNum + secondNum);
        scan.close();

    }
}