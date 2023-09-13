package version02;

public class DuckSimulator {
    public static void main(String[] args) {
        //version02.Duck duck = new version02.Duck();
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.fly(); // fly 메서드가 오버라이드 되어 있고 안쪽에 코드가 없음
        decoyDuck.quack(); //quack 메서드가 오버라이드 되어있고 안쪽에 코드가 없음

        RubberDuck rubberDuck = new RubberDuck();
        MallardDuck mallardDuck = new MallardDuck();
        rubberDuck.quack();
        //System.out.println(rubberDuck.name + "가 ");
        rubberDuck.fly();  //fly 기능이 없어야 하는 러버덕 객체, fly 메서드를 오버라이드(안쪽에 코드가 없음)
        mallardDuck.swim();
        //System.out.println(mallardDuck.name + "가 ");
        mallardDuck.fly();
        mallardDuck.quack();
    }
}
