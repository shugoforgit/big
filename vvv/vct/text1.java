package vct;



import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class text1 {
	public static void main (String[] args) {
		text1 t=new text1();
		t.test1();
		t.test2();
		t.test3();
		t.test4();
		t.test5();
		t.test6();
	}
    private static String str = "this is a test of java";
    /**
      (1) ͳ�Ƹ��ַ�������ĸs���ֵĴ���
     */
    public void test1() {
        int count = 0;
        Pattern pattern = Pattern.compile("s");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            count++;
        }
        System.out.println("���ִ�����" + count);
    }

    /**
      (2) ȡ�����ַ���"test"  
     */
    public void test2() {
        System.out.println("��ȡ���ַ�����" + str.substring(10, 14));
    }

    /**
     * (3) �����ַ������Ƶ�һ���ַ�����Char[] str��
     */
    public void test3() {
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }

    /**
     * (4) ���ַ�����ÿ�����ʵĵ�һ����ĸ��ɴ�д�� ���������̨��//��������ʽ1
     */
    public void test4() {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            StringBuilder sb = new StringBuilder(matcher.group().toLowerCase());
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            System.out.print(sb.toString() + " ");
        }
    }

    /**
      (5) �����ַ�ʽʵ�ָ��ַ����ĵ��������(��StringBuffer��forѭ����ʽ�ֱ�ʵ��)11
     */
    public void test5() {
        // ʹ��StringBuffer
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
        // ʹ��forѭ��
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    /**
      (6) �����ַ���ת����һ���ַ������飬��Ҫ��ÿ������Ԫ�ض���һ���������Ӣ�ĵ���,�����������̨
     */
    public void test6() {
        String[] s = str.split(" ");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
