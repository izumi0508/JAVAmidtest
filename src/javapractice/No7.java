package javapractice;
import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("輸入月租費型式及通話時間為:");
        String in = scn.next();
        String styl = in.substring(0,3);
        int time  = Integer.parseInt(in.substring(4));
        double ans = 0;

        if(styl.equals("186")){

            if(time*0.09 > 186){
                ans = 0.8*time*0.09;
            }else{
                ans = 0.9*time*0.09;
            }

        }else if(styl.equals("386")){

            if(time*0.08 > 386){
                ans = 0.7*time*0.08;
            }else{
                ans = 0.8*time*0.08;
            }

        }else if(styl.equals("586")){

            if(time*0.07 > 586){
                ans = 0.6*time*0.07;
            }else{
                ans = 0.7*time*0.07;
            }

        }else if(styl.equals("986")){

            if(time*0.06 > 986){
                ans = 0.5*time*0.06;
            }else{
                ans = 0.6*time*0.06;
            }

        }

        System.out.println("通話費為:" + ans);

    }
}
