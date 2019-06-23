package vct;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;


public class test5 {

    /**
     * 从控制台输入一个yyyy-MM-dd（年月日）格式的日期字符串，再将这个日期加上七天，再用FormatStyle.MEDIUM格式输出这个日期。
     */
    public static void test1() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        // 指定格式将字符串转为LocalDate
        LocalDate localDate = LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // 添加7天
        localDate = localDate.plusDays(7);
        // 以指定系统格式输出
        System.out.println(localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
    }

    /**
     * 使用java8的日期时间包获取当前系统时间，并以各种格式加以显示
     */
    public static void test2() {
        // 获取当前系统时间
        LocalDateTime time = LocalDateTime.now();
        // 短的时间格式
        System.out.println("短的：" + time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT)));
        // 中的
        System.out.println("中的：" + time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM)));
        // 长的
        System.out.println("长的：" + time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.LONG)));
        // 完整的
        System.out.println("完整的：" + time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.LONG)));

    }

    /**
     * 使用java8的日期时间包获取当前系统时间，并修改这个时间（分别修改年份、月份、天、小时），然后打印结果
     */
    public static void test3() {
        // 获取当前系统时间
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        // 修改年份
        time = time.withYear(1997);
        System.out.println("改年份：" + time);
        // 修改
        time = time.withMonth(12);
        System.out.println("改月份：" + time);
        // 修改
        time = time.withDayOfMonth(3);
        System.out.println("改天数：" + time);
        // 修改
        time = time.withHour(12);
        System.out.println("改小时：" + time);
    }

    public static void main(String[] args) {
        // test1();
        // test2();
        test3();

    }
}