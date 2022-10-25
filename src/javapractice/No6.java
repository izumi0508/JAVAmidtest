package javapractice;
import java.util.Scanner;
import java.util.Arrays;

public class No6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入不超過七個0~9的數字 以逗號間隔:");
        String in = scn.next();
        String noComma = in.replaceAll("\\p{Punct}", "");
        int len = noComma.length();
        int[] arr = new int[len];

        for(int i = 0;i < len;i++){
            arr[i] = Integer.parseInt(noComma.substring(i,i+1));
        }

        int[] maxmin = new int[len];
        System.arraycopy(arr,0 , maxmin, 0, len);
        Arrays.sort(maxmin);

        int max = 0,min = 0;
        int c = 1;

        for(int i = 0;i < len;i++){
            max += maxmin[i]*c;
            c *= 10;
        }

        c = 1;

        for(int i = len - 1;i >= 0;i--){
            min += maxmin[i]*c;
            c *= 10;
        }

        System.out.println("最大值數列與最小值數列差值為:" + (max - min));

    }
}
