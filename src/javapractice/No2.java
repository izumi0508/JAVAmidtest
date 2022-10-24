package javapractice;
import java.util.Scanner;
public class No2 {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input a number");
        int dg = scn.nextInt();
        double s,ns;

        if(dg >= 701){
            s = 5.63*(dg-700) + 2626.5;
            ns = 4.5*(dg-700) + 2230.5;
        }else if(dg >= 501){
            s = 4.97*(dg-500) + 1632.5;
            ns = 4.01*(dg-500) + 1428.5;
        }else if(dg >= 331){
            s = 4.39*(dg-330) + 886.2;
            ns = 3.61*(dg-330) + 814.8;
        }else if(dg >= 121){
            s = 3.02*(dg-120) + 252;
            ns = 2.68*(dg-120) + 252;
        }else{
            s = 2.1*dg;
            ns = 2.1*dg;
        }

        System.out.println("Summer months:" + s);
        System.out.println("Non-Summer months:" + ns);
    }
}
