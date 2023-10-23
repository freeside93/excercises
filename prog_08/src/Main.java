import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Integer[] ar = {10, 333, -4,5,6,-7};

    String[] ars = Arrays.stream(ar)
            .map(elm -> elm.toString()).toArray(String[]::new);

    for(var s: ars) System.out.println(s);
    int[] ai = Arrays.stream(ar).mapToInt( el -> (int)el).toArray();
    for(var i: ai) System.out.println(i);
    long[] longs = Arrays.stream(ar).mapToLong(el -> el).toArray();



    }
}