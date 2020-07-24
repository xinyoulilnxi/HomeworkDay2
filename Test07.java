package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        System.out.println(count(str));

    }
    public static String count(String str){
        if(str.contains(".")){
            if(str.contains("+")){
                String []s = str.split("\\+");
                double a = Double.valueOf(s[0]);
                double b = Double.valueOf(s[1]);
                Double c = a + b;
                return s[0] + "+" + s[1] + "=" + c;
            }else if(str.contains("-")){
                String []s = str.split("\\-");
                double a = Double.valueOf(s[0]);
                double b = Double.valueOf(s[1]);
                Double c = a - b;
                return s[0] + "-" + s[1] + "=" + c;
            }else if(str.contains("*")){
                String []s = str.split("\\*");
                double a = Double.valueOf(s[0]);
                double b = Double.valueOf(s[1]);
                Double c = a * b;
                return s[0] + "*" + s[1] + "=" + c;
            }else{
                String []s = str.split("\\/");
                double a = Double.valueOf(s[0]);
                double b = Double.valueOf(s[1]);
                Double c = a / b;
                return s[0] + "/" + s[1] + "=" + c;
            }
        }else{
            if(str.contains("+")){
                String []s = str.split("\\+");
                int a = Integer.valueOf(s[0]);
                int b = Integer.valueOf(s[1]);
                int c = a + b;
                return s[0] + "+" + s[1] + "=" + c;
            }else if(str.contains("-")){
                String []s = str.split("\\-");
                int a = Integer.valueOf(s[0]);
                int b = Integer.valueOf(s[1]);
                int c = a - b;
                return s[0] + "-" + s[1] + "=" + c;
            }else if(str.contains("*")){
                String []s = str.split("\\*");
                int a = Integer.valueOf(s[0]);
                int b = Integer.valueOf(s[1]);
                int c = a * b;
                return s[0] + "*" + s[1] + "=" + c;
            }else{
                String []s = str.split("\\/");
                int a = Integer.valueOf(s[0]);
                int b = Integer.valueOf(s[1]);
                int c = a / b;
                return s[0] + "/" + s[1] + "=" + c;
            }
        }

    }
}
