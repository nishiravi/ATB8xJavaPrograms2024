package sept.ex_27092024.Task_27Sept;

import java.util.Scanner;

public class Lab076Q2A_Firs5EvenNumbers {
    public static void main(String[] args) {

        int i=1;
        int j=1;
        do{
            if(i%2==0) {
                System.out.println(i);
                j++;
            }
            i++;
        }while(j<=5);

    }
}
