package vct;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;


public class test5 {

    /**
     * �ӿ���̨����һ��yyyy-MM-dd�������գ���ʽ�������ַ������ٽ�������ڼ������죬����FormatStyle.MEDIUM��ʽ���������ڡ�
     */
    public static void test1() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        // ָ����ʽ���ַ���תΪLocalDate
        LocalDate localDate = LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // ���7��
        localDate = localDate.plusDays(7);
        // ��ָ��ϵͳ��ʽ���
        System.out.println(localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
    }

    /**
     * ʹ��java8������ʱ�����ȡ��ǰϵͳʱ�䣬���Ը��ָ�ʽ������ʾ
     */
    public static void test2() {
        // ��ȡ��ǰϵͳʱ��
        LocalDateTime time = LocalDateTime.now();
        // �̵�ʱ���ʽ
        System.out.println("�̵ģ�" + time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT)));
        // �е�
        System.out.println("�еģ�" + time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM)));
        // ����
        System.out.println("���ģ�" + time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.LONG)));
        // ������
        System.out.println("�����ģ�" + time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.LONG)));

    }

    /**
     * ʹ��java8������ʱ�����ȡ��ǰϵͳʱ�䣬���޸����ʱ�䣨�ֱ��޸���ݡ��·ݡ��졢Сʱ����Ȼ���ӡ���
     */
    public static void test3() {
        // ��ȡ��ǰϵͳʱ��
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        // �޸����
        time = time.withYear(1997);
        System.out.println("����ݣ�" + time);
        // �޸�
        time = time.withMonth(12);
        System.out.println("���·ݣ�" + time);
        // �޸�
        time = time.withDayOfMonth(3);
        System.out.println("��������" + time);
        // �޸�
        time = time.withHour(12);
        System.out.println("��Сʱ��" + time);
    }

    public static void main(String[] args) {
        // test1();
        // test2();
        test3();

    }
}