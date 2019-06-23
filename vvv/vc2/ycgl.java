package vc2;

/**
 * π§æﬂ¿‡
 */
public class ycgl {
    public static int parseInt(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = num * 10 +  ch - '0';
            } else {

            }
        }
        return num;
    }
}