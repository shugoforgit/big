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
      (1) 统计该字符串中字母s出现的次数
     */
    public void test1() {
        int count = 0;
        Pattern pattern = Pattern.compile("s");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            count++;
        }
        System.out.println("出现次数：" + count);
    }

    /**
      (2) 取出子字符串"test"  
     */
    public void test2() {
        System.out.println("获取子字符串：" + str.substring(10, 14));
    }

    /**
     * (3) 将本字符串复制到一个字符数组Char[] str中
     */
    public void test3() {
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }

    /**
     * (4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。//用正则表达式1
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
      (5) 用两种方式实现该字符串的倒序输出。(用StringBuffer和for循环方式分别实现)11
     */
    public void test5() {
        // 使用StringBuffer
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
        // 使用for循环
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    /**
      (6) 将本字符串转换成一个字符串数组，，要求每个数组元素都是一个有意义的英文单词,并输出到控制台
     */
    public void test6() {
        String[] s = str.split(" ");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
