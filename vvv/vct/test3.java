package vct;

public class test3 {
	public static void main (String[] args) {
		test3 t=new test3();
		t.test1();
	}

    public void test1() {
        // ��ʵ�ְ�װ���������������֮��ת��
        //  ������������ ת ��װ��
        Integer i = Integer.valueOf(123);
        // ��װ�� ת ������������
        int i1 = i.intValue();
        System.out.println(i);
        System.out.println(i1);
        System.out.println("----------");

        // ��ʵ�ְ�װ�����ַ����໥ת��
        // �ַ��� ת ��װ��
        int i2 = Integer.parseInt("123");
        // ��װ�� ת �ַ���
        String str = i.toString();
        System.out.println(i2);
        System.out.println(str);
        System.out.println("----------");

        // ��ʵ�ֻ��������������ַ���֮���໥ת��
        // �ַ��� ת ������������
        int i3 = Integer.parseInt("123");
        // ������������ ת �ַ���
        String str2 = i3 + "";
        System.out.println(i3);
        System.out.println(str2);

    }
}