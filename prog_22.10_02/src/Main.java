import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    final int Len = 6, min = -5, overMax = 7;
    Random rnd = new Random();
    int[] ar = rnd.ints(Len, min,overMax).toArray();
    System.out.println(Arrays.toString(ar));
    System.out.print("Нечетни числа: \n");
    int count = 0;
    long countForStream = 0;
    for(int num:ar){
        if(num%2 != 0){
            count++;
            System.out.println(num);
        }
    }
    countForStream = Arrays.stream(ar).filter(elm-> elm%2 != 0).count();
    System.out.println("Брой нечетни числа:");
    System.out.println(count);
    System.out.println(countForStream);

    int L = 0;
    for(int R =ar.length- 1, t; L<=R;){
        if(ar[L]%2 != 0){
            L++;
        }else{
            t = ar[L];
            ar[L] =ar[R];
            ar[R] = t;
            --R;
        }
    }
    int[] odd = Arrays.copyOfRange(ar,0,L);
    System.out.println(Arrays.toString(odd));
    }
}