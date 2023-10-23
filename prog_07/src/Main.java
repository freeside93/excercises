import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



       Integer lastEnteredNum = null,enteredNum =null, firstOddNum = null, lastOddNum = null;
       do{
            lastEnteredNum = enteredNum;
            enteredNum = sc.nextInt();
            if(enteredNum % 2 != 0){
                if(firstOddNum == null ){
                    firstOddNum = enteredNum;
                }lastOddNum = enteredNum;
            }


       }while(enteredNum != lastEnteredNum);
        if(firstOddNum == null){
            System.out.println(" Няма прочетено нечетно число");
        }else{
            System.out.println("Първо прочетено нечетно число:" + firstOddNum +
                    "\n последно нечетно число:" + lastOddNum);
        }

    }
}