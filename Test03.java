package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String ip = console.next();
        String regex = "\\.";
        String[] s = ip.split(regex);
        for (String a:
             s) {
            System.out.println(a);
        }
    }
}
