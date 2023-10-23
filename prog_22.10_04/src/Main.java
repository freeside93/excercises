import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        final int len = 7;
        int[] arr = new int[len];

        Arrays.setAll(arr,i -> rnd.nextInt(-10,6));
        System.out.println(Arrays.toString(arr));

        int maxNum = arr[0];
        int minNum = arr[0];
        for(int elm : arr){
            if(elm > maxNum){
                maxNum = elm;
            }else if(elm < minNum){
                minNum = elm;
            }
        }
        System.out.println("Min" + minNum + "\n");
        System.out.println(maxNum);

        int firstMinI= 0 , lastMinI = 0;
        for(int i =1; i < arr.length; ++i){
            if(arr[i] < arr[firstMinI]){
                firstMinI = i;
                lastMinI= i;
            }else if(arr[i] == arr[lastMinI]){
                lastMinI = i;
            }
        }
        System.out.printf("Първи индекс на мин.: %s," +
                "последен индекс на мин.:%s", firstMinI, lastMinI);

    }
}