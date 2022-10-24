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
import java.lang.*;


public class No1 {
    
    public static void main(String[] args){
        String input = JavaPractice.input("Please input a number:");
        int number;
        int max_prime = 0;

        for (int num_length = input.length(); num_length >= 0; num_length--) {

            for (int i = 0; i + num_length < input.length(); i++) {
                number = Integer.parseInt(input.substring(i, (i + num_length + 1)));

                if (JavaPractice.prime(number)) {

                    if (number > max_prime) {
                        max_prime = number;
                    }

                }

            }

            if (max_prime != 0) {
                break;
            }

        }

        if (max_prime != 0) {
            System.out.println("The max prime is:" + max_prime);
        } else {
            System.out.println("No prime found");
        }

    }
}
