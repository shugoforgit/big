package apple;


import java.util.function.Consumer;
public class applecs {
    public static void consumerApple(apple[] apples, Consumer<apple> consumer) {
        for (apple apple : apples) {
            consumer.accept(apple);
        }
    }
}
