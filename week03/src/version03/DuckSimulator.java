package version03;

public class DuckSimulator {
    public static void main(String[] args) {

        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.fly();

        //version02.Duck duck = new version02.Duck();
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.fly(); // fly 메서드가 오버라이드 되어 있고 안쪽에 코드가 없음
        decoyDuck.quack(); //quack 메서드가 오버라이드 되어있고 안쪽에 코드가 없음

        RubberDuck rubberDuck = new RubberDuck();
        MallardDuck mallardDuck = new MallardDuck();
        rubberDuck.quack();

        //System.out.println(rubberDuck.name + "가 ");
//        rubberDuck.fly();  //없는 기능
        mallardDuck.swim();

        //System.out.println(mallardDuck.name + "가 ");
        mallardDuck.fly();
        mallardDuck.quack();
    }
}
