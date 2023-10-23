import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      long w,x,y,z;
      System.out.print("1-во число: ");
      w = scan.nextLong();
      System.out.print("2-ро число: ");
      x = scan.nextLong();
      System.out.print("3-то число: ");
      y = scan.nextLong();
      System.out.print("4-то число: ");
      z = scan.nextLong();
      int n;
//      n= w % 2 != 0 ? 1 : 0;
//      if(x % 2 != 0) ++n;
//      if(y%2 != 0) ++n;
//      if(z%2 != 0)++n;

        n = (w%2 != 0 ? 1 : 0) + (x%2 != 0 ? 1:0)
            + (y%2 != 0 ? 1 : 0) + (z%2 != 0? 1:2);
        long f =0;
        switch(n){
            case 1: f = w * (x +y + z); break;
            case 2: f =(w+ x) * (y +z); break;
            case 3: f = (w + x +y ) * z; break;
            case 4: f = w-x +y -z; break;
            default: f= w -x + y -z;
        }
        System.out.println("f("+ w + ',' + x + ',' + y + ',' + z + ") = "+ f);

      scan.close();
    }
}