package day02;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        String s[] = str.split("\\;");
        for (int i = 0; i < s.length; i++) {
           String c[] = s[i].split("\\,");
            Person p = new Person(c[0],Integer.valueOf(c[1]),c[2],Integer.valueOf(c[3]));
            System.out.println(p.toString());
        }

        //Person p = new Person();
        //System.out.println(p.toString());
    }

}
