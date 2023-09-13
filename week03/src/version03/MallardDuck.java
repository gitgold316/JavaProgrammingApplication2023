package version03;

public class MallardDuck extends Duck implements Quackable,Flyable{
    @Override
    public void quack() {
        System.out.println("꽥꽥~");
    }

    @Override
    public void fly() {
        System.out.println(this.name + "가 날다");
    }

    public MallardDuck() {
        this.name = "청둥오리";
    }

    @Override
    public void display() {

    }
}
