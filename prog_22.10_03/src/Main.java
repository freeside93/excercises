import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean hasK = false;
        boolean hasN = false;
        int k, n;
        while(true){
            System.out.println("Въведете к:");
            k = sc.nextInt();
            if(k<0 || k>=4){
                continue;
            }else{
                hasK = true;
                System.out.println("Въведете N:");
                n = sc.nextInt();
                while(n < k || n >=10) {
                    System.out.println("Въведете N:");
                    n = sc.nextInt();
                }
                    hasN = true;

                if(hasN == true && hasK == true){
                    break;
                }
        }

        }
        System.out.printf("K is %s, N is %s \n", k, n);
        for(int L1 =1,L2 = k+1, L3 = n +1; L3>0; --L3){
            String fs = String.format("%%%dc%%%dc%%%dc\n",L1, L2,L3);

            System.out.printf(fs, '=', '*', '&');
            System.out.printf("%" + L1 + "c%" + L2 + "c%" + L3 + "c\n", '=', '*' , '&');
            if(L2 >1){
                --L2;
                ++L1;
            }
        }
    }

}