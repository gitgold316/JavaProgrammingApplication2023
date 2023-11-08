package functional_interface;
// 함수적 인터페이스 (jdk 8 이상)
// Type         parameter   return value    method
// Predicate    o           boolean         test()
// Supplier     x           o               get()
// Consumer     o           void            accept()
// Function     o           o               apply()
// Operator     o           o               apply()

import java.util.Locale;
import java.util.function.*;

public class functionalInterfaceDemo1 {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = n -> n + 8;
        System.out.println(f1.apply(7));

        ToDoubleBiFunction<String, Integer> f2 = (pi, radius) -> Double.parseDouble(pi) * radius * radius;
        double area = f2.applyAsDouble("3.14592", 10);

//        BiConsumer<Integer, Integer> c2 = (n1, n2) -> System.out.println(n1 + n2);
//        c2.accept(7, 8);
//
//        Consumer<String> c1 = n -> {
//            System.out.println(n.toUpperCase());
//        };
//        c1.accept("Hello Java");

//        Supplier<Double> s1 = () -> 2.51;
//        System.out.println(s1.get());
//
//        IntSupplier s2 = () -> (int) (Math.random() * 6) + 1;
//        System.out.println(s2.getAsInt());

//        IntPredicate add = x -> x % 2 == 1;
//        System.out.println(add.test(11) ? "홀수" : "짝수");
    }
}
