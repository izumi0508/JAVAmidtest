/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author ANGEL
 */
import java.util.Scanner;

public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void input(String[] args) {
        // TODO code application logic here
    }
    
    
    public static String input(String str) {
        System.out.print(str);
        String str1 = "";
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            str1 = scan.nextLine();
        }
        return str1;
    }

    public static boolean prime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
