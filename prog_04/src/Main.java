import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x,y,z;
        System.out.print("1-во число: ");
        x = scanner.nextLong();
        System.out.print("2-ро число: ");
        y = scanner.nextLong();
        System.out.print("3-то число: ");
        z = scanner.nextLong();
        System.out.println("Средно аритметично: " + (x+y+z)/ 3.0);
        scanner.close();
        System.out.println(Long.MAX_VALUE);
    }
}