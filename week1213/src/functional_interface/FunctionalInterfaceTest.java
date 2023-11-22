// 함수적 인터페이스 (jdk 8 이상)
// Type         parameter   return value    method
// Predicate    o           boolean         test()
// Supplier     x           o               get()
// Consumer     o           void            accept()
// Function     o           o               apply()
// Operator     o           o               apply()


package functional_interface;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        //Operator
        UnaryOperator<Integer> square = n -> n * n; //매개변수 1개
        System.out.println(square.apply(7));

        BinaryOperator<Integer> add = (a, b) -> a + b;  // 매개변수 여러개
        System.out.println(add.apply(7, -11));

        //Consumer
        Consumer<String> pokemon = (name) -> {
            System.out.println(name + "!");
        };
        pokemon.accept("피카츄");
    }
}
