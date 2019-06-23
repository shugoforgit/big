package vct;

import org.junit.Test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test4 {
    /**
     * 4.1 检查一个电话号码是否符合(0000)0000-0000
     */
    public void test1() {
        Pattern pattern = Pattern.compile("\\(\\d{4}\\)\\d{4}-\\d{4}");
        Matcher matcher1 = pattern.matcher("(0001)1234-3214");
        System.out.println("(0001)1234-3214：" + matcher1.matches());
        Matcher matcher2 = pattern.matcher("(001)1234-3214");
        System.out.println("(001)1234-3214：" + matcher2.matches());
    }

    /**
     * 4.2 将一个字符串中所有的ip地址打印出来
     */
    public void test2() {
        Pattern pattern = Pattern.compile("((25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))");
        Matcher m = pattern.matcher("da555.168.255.1p68fdaf132+192.5.12.5.2f4ae856f12.168.25.2+68ae45edsr65g65");
        while (m.find()) {
            System.out.println("IP: " + m.group());
        }
    }

    /**
     * 4.3 将字符串中连续出现的字符压缩成一个。比如aaabbbccccd，压缩后变成abcd。
     */
    public void test3() {
        Pattern pattern = Pattern.compile("(\\w)\\1*");
        Matcher matcher = pattern.matcher("aaabbbccccd");
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group(1));
        }
        System.out.println(sb.toString());
    }

    /**
     * 4.4 将连续出现的abc用一个abc代替。---选做
     */
    public void test4() {
        Pattern pattern = Pattern.compile("(abc)\\1*");
        Matcher matcher = pattern.matcher("abcabcabc+abc+sabcabca9bcf");
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1));
        }
        matcher.appendTail(sb);
        System.out.println(sb.toString());
    }

    /**
     * 4.5 从控制台输入邮箱地址，验证是否为邮箱地址。从JOptionPane中输入邮箱地址，验证是否是合法的邮箱。----选做
     */
    public static void test5() {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9_+]+@[a-zA-Z0-9_+]+(\\.[a-zA-Z0-9_+]+)+");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        Matcher matcher = pattern.matcher(email);
        System.out.println(email + "：" + matcher.matches());
    }

    /**
     * 4.6 输入一个字符串，判断该字符串是否以abc结尾。
     */
    public static void test6() {
        Pattern pattern = Pattern.compile(".*abc");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            Matcher matcher = pattern.matcher(s);
            System.out.println(matcher.matches());
        }
    }

    /**
     * 4.7 截取http://地址。在一个网页的源文件中提取静态的http地址。------选做
     */
    public void test7() {
        // 获取网页源代码
        StringBuffer sb = new StringBuffer();
        try {
            //构建一URL对象
            URL url = new URL("https://www.baidu.com");
            //使用openStream得到一输入流并由此构造一个BufferedReader对象
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String line;
            //读取www资源
            while ((line = in.readLine()) != null)
            {
                sb.append(line);
            }
            in.close();
        }
        catch (Exception ex)
        {
            System.err.println(ex);
        }
        System.out.println(sb.toString());
        // 正则匹配
        Pattern pattern = Pattern.compile("https?://\\w+(\\.\\w+)+");
        Matcher matcher = pattern.matcher(sb.toString());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    /**
     * 4.8 将一个字符串中的所有整数提取出来，保存在一维数组中。比如”ae256dd—w348e6”，提取出256,348,6三个整数
     */
    public void test8() {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("ae256dd—w348e6");
        int[] array = new int[3];
        int i = 0;
        while (matcher.find()) {
            array[i++] = Integer.parseInt(matcher.group());
        }
        for (int i1 : array) {
            System.out.println(i1);
        }
    }

    /**
     * 4.9 文本替换：将字符串中所有的”pupel”替换为”pupil”。
     */
    public void test9() {
        Pattern pattern = Pattern.compile("pupel");
        Matcher matcher = pattern.matcher("1pupel2pupel3pupe9");
        String newStr = matcher.replaceAll("pupil");
        System.out.println(newStr);
    }

    /**
     * 4.10 从一个字符串中提取以%cxll=开头，右部是%的字符串（不包含%）。
     * 字符串为：
     * "%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11"
     */
    public void test10() {
        Pattern pattern = Pattern.compile("%CXLL=.*?(?=%)");
        Matcher matcher = pattern.matcher("%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }


    public static void main(String[] args) {
        //test5();
        //test6();
    }

}