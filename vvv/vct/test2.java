package vct;

public class test2 {
	public static void main (String[] args) {
		test2 t=new test2();
		t.test1();
	}
    /**
     *  String������StringBuffer������ת��������StringBuffer�����ӡ����롢ɾ������ת������
     */
    public void test1() {
        // String ת StringBuffer
        String str = "I love";
        StringBuffer sb = new StringBuffer(str);

        //  StringBuffer ת String
        System.out.println("StringBuffer ת String��" + sb.toString());

        // ���
        sb.append(",too.");
        System.out.println("��ӣ�" + sb.toString());

        // ����
        sb.insert(6, " java");
        System.out.println("���룺" + sb.toString());

        // ɾ��
        sb.delete(11, 15);
        System.out.println("ɾ����" + sb.toString());

        // ��ת
        sb.reverse();
        System.out.println("��ת��" + sb.toString());
    }
}