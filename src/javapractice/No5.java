package javapractice;
import java.util.Scanner;
public class No5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("輸入階層值M:");
        int M = scn.nextInt();
        int N = 1;
        int i = 1;

        while(i <= M){
            i *= N;
            N += 1;
        }

        System.out.println("超過M為"+ M + "的最小階層N值為:" + (N-1));
    }
}
