package vct;

public class test3 {
	public static void main (String[] args) {
		test3 t=new test3();
		t.test1();
	}

    public void test1() {
        // ·实现包装类与基本数据类型之间转换
        //  基本数据类型 转 包装类
        Integer i = Integer.valueOf(123);
        // 包装类 转 基本数据类型
        int i1 = i.intValue();
        System.out.println(i);
        System.out.println(i1);
        System.out.println("----------");

        // ·实现包装类与字符串相互转换
        // 字符串 转 包装类
        int i2 = Integer.parseInt("123");
        // 包装类 转 字符串
        String str = i.toString();
        System.out.println(i2);
        System.out.println(str);
        System.out.println("----------");

        // ·实现基本数据类型与字符串之间相互转换
        // 字符串 转 基本数据类型
        int i3 = Integer.parseInt("123");
        // 基本数组类型 转 字符串
        String str2 = i3 + "";
        System.out.println(i3);
        System.out.println(str2);

    }
}