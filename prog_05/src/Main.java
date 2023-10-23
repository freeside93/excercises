import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a,b,c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        int d = (b * b) - (4 * a * c);
        System.out.println("Брой решения:"
         + (d < 0 ? 0 : d > 0 ? 2 : 1)
                );
        double result = 0;
        double result2 = 0;
        int resultCount;
        if(d > 0) {
            result = -b - Math.sqrt(d) / 2 * a;
            result2 = -b + Math.sqrt(d) / 2 * a;
        }
        System.out.printf("Result 1 : %s, and Result 2 : %s", result, result2);
        scan.close();

    }
        

      
       
}