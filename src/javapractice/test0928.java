package javapractice;

import java.util.Arrays;

public class test0928 {
    public static void main(String[] args) {
        byte[] arr = new byte[]{90,80,30,70,100,20};

        Arrays.sort(arr);

        System.out.println("max:" + arr[arr.length-1]);
        System.out.println("min:" + arr[0]);

        int add = (int)'Z';
        char[][] midterm = new char[5][];

        for(int i = 0; i < 5; i++){
            midterm[i] = new char[5-i];
        }

        int x = 5;
        int y = 0;

        for(int i = 0;i < midterm.length;i++){

            System.out.println(" ");

            for(int j = 0;j<x;j++){
                midterm[i][j] = (char)add;
                System.out.print(midterm[i][j] + " ");
                add -= 1;
                y += 1;
            }

            x -= 1;

        }
    }
}

class Person{
    String name;
    int weight;

    void eat(){
        weight +=1;
    }
}
