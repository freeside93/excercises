import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        final int Len  = 15;
        Integer[] arr = rnd.ints(Len, -10, 11).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        for(int pos = arr.length -1; pos > 0; --pos){
            int iMin = pos;
            for(int i = 0; i < pos; ++i){
                if(arr[i] < arr[iMin]){
                    iMin = i;
                }
            }
            Integer t = arr[pos];
            arr[pos] = arr[iMin];
            arr[iMin] = t;
        }
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr, (a,b) -> Integer.compare(a,b));

    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr,  (a,b) -> {
        int res = Boolean.compare(a%2!=0, b%2!=0);
        if(res == 0) res = Integer.compare(a,b);
        return res;
    });
        System.out.println(Arrays.toString(arr));
    }

}