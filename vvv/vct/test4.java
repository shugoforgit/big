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
     * 4.1 ���һ���绰�����Ƿ����(0000)0000-0000
     */
    public void test1() {
        Pattern pattern = Pattern.compile("\\(\\d{4}\\)\\d{4}-\\d{4}");
        Matcher matcher1 = pattern.matcher("(0001)1234-3214");
        System.out.println("(0001)1234-3214��" + matcher1.matches());
        Matcher matcher2 = pattern.matcher("(001)1234-3214");
        System.out.println("(001)1234-3214��" + matcher2.matches());
    }

    /**
     * 4.2 ��һ���ַ��������е�ip��ַ��ӡ����
     */
    public void test2() {
        Pattern pattern = Pattern.compile("((25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))");
        Matcher m = pattern.matcher("da555.168.255.1p68fdaf132+192.5.12.5.2f4ae856f12.168.25.2+68ae45edsr65g65");
        while (m.find()) {
            System.out.println("IP: " + m.group());
        }
    }

    /**
     * 4.3 ���ַ������������ֵ��ַ�ѹ����һ��������aaabbbccccd��ѹ������abcd��
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
     * 4.4 ���������ֵ�abc��һ��abc���档---ѡ��
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
     * 4.5 �ӿ���̨���������ַ����֤�Ƿ�Ϊ�����ַ����JOptionPane�����������ַ����֤�Ƿ��ǺϷ������䡣----ѡ��
     */
    public static void test5() {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9_+]+@[a-zA-Z0-9_+]+(\\.[a-zA-Z0-9_+]+)+");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        Matcher matcher = pattern.matcher(email);
        System.out.println(email + "��" + matcher.matches());
    }

    /**
     * 4.6 ����һ���ַ������жϸ��ַ����Ƿ���abc��β��
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
     * 4.7 ��ȡhttp://��ַ����һ����ҳ��Դ�ļ�����ȡ��̬��http��ַ��------ѡ��
     */
    public void test7() {
        // ��ȡ��ҳԴ����
        StringBuffer sb = new StringBuffer();
        try {
            //����һURL����
            URL url = new URL("https://www.baidu.com");
            //ʹ��openStream�õ�һ���������ɴ˹���һ��BufferedReader����
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String line;
            //��ȡwww��Դ
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
        // ����ƥ��
        Pattern pattern = Pattern.compile("https?://\\w+(\\.\\w+)+");
        Matcher matcher = pattern.matcher(sb.toString());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    /**
     * 4.8 ��һ���ַ����е�����������ȡ������������һά�����С����硱ae256dd��w348e6������ȡ��256,348,6��������
     */
    public void test8() {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("ae256dd��w348e6");
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
     * 4.9 �ı��滻�����ַ��������еġ�pupel���滻Ϊ��pupil����
     */
    public void test9() {
        Pattern pattern = Pattern.compile("pupel");
        Matcher matcher = pattern.matcher("1pupel2pupel3pupe9");
        String newStr = matcher.replaceAll("pupil");
        System.out.println(newStr);
    }

    /**
     * 4.10 ��һ���ַ�������ȡ��%cxll=��ͷ���Ҳ���%���ַ�����������%����
     * �ַ���Ϊ��
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