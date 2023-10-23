import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long firstNum = scan.nextLong();
        long secondNum = scan.nextLong();
        long thirdNum = scan.nextLong();

        System.out.printf("first num : %s, secondNUm: %s, thirdNum: %s ",
                firstNum, secondNum, thirdNum);
        scan.close();
    }
}