/* 参考了网上一个输出两个字符串中相同字符的例子 */
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2;
        try {
            System.out.print("请输入第一个字符串:");//字符串有先后顺序区别
            s1 = in.nextLine();
            System.out.print("请输入第二个字符串:");
            s2 = in.nextLine();
            getSameChar(s1, s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void getSameChar(String s1, String s2) {
        char[] c = new char[100];
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        int t = 0,n = 0;
        System.out.println(s1 + "与" + s2 + "顺序相同的字符串有");
        for (int i = 0; i < a1.length; i++) {
            for (int j = t; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    c[n] = a2[j];
                    n++;
                    t = j + 1;//当查找到相同的字符时，标记在第二字符串中的位置，下一次循环从标记后开始
                    break;
                }
            }
        }
        System.out.println(c);
    }
}
