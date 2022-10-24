package javapractice;
import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("X軸座標:");
        int X = scn.nextInt();
        System.out.println("Y軸座標:");
        int Y = scn.nextInt();
        int dis = X*X + Y*Y;
        String ans = "";

        if(X==0 && Y==0){
            ans = "原點";
        } else if(X==0 && Y>0){
            ans = "上半平面Y軸上";
        } else if(X==0 && Y<0){
            ans = "下半平面Y軸上";
        } else if(X>0 && Y==0){
            ans = "右半平面X軸上";
        } else if(X<0 && Y==0){
            ans = "左半平面X軸上";
        } else if(X>0 && Y>0){
            ans = "第一象限";
        } else if(X<0 && Y>0){
            ans = "第二象限";
        } else if(X<0 && Y<0){
            ans = "第三象限";
        } else if(X>0 && Y<0){
            ans = "第四象限";
        }

        if(ans.equals("原點")){
            System.out.println("該點位於原點");
        } else {
            System.out.println("該點位於" + ans + "，離原點距離為根號" + dis);
        }
        
    }
}
