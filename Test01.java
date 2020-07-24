package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        Test01 t = new Test01();
        String s = t.judge(str);
        System.out.println(s);
    }
    public String judge(String str){
        int a = str.length();
        String regex = "[\\d]{1,}";
        String regex1 = "[\\d]{1,}\\.[\\d]{1,}";
        if(str.matches(regex)){
            int b = Integer.valueOf(str);
            System.out.println(b * 10);
            return "";
        }else if(str.matches(regex1)){
            double b = Double.valueOf(str);
            System.out.println(b * 5);
        return"";
        }
        else{
            return "不是数字";
        }
    }

}
