import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        Long[] arr = new Long[7];
        Arrays.setAll(arr, i -> rnd.nextLong(0,21) * 2);
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        Long inputL = sc.nextLong();
        int firstI = -1;
        int lastI = -1;
        for(int i= 0;i < arr.length; i++ ){
            if(inputL == arr[i]){
                if(firstI == -1){
                    firstI = i;
                }
                    lastI = i;

            }
        }
        if(lastI == -1){
            System.out.println("Няма елемент който да отг. на въведената стойност");
            return;
        }
        System.out.println(firstI);
        System.out.println(lastI);
        System.out.println(Arrays.asList(arr).contains(inputL));
        sc.close();



    }
}