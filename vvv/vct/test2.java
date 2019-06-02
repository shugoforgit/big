package vct;

public class test2 {
	public static void main (String[] args) {
		test2 t=new test2();
		t.test1();
	}
    /**
     *  String对象与StringBuffer对象互相转换，测试StringBuffer类的添加、插入、删除、反转操作。
     */
    public void test1() {
        // String 转 StringBuffer
        String str = "I love";
        StringBuffer sb = new StringBuffer(str);

        //  StringBuffer 转 String
        System.out.println("StringBuffer 转 String：" + sb.toString());

        // 添加
        sb.append(",too.");
        System.out.println("添加：" + sb.toString());

        // 插入
        sb.insert(6, " java");
        System.out.println("插入：" + sb.toString());

        // 删除
        sb.delete(11, 15);
        System.out.println("删除：" + sb.toString());

        // 反转
        sb.reverse();
        System.out.println("反转：" + sb.toString());
    }
}