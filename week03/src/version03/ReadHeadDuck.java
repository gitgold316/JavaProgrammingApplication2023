package version03;

public class ReadHeadDuck extends Duck implements Quackable,Flyable{
    public ReadHeadDuck() {
        this.name = "아메리카흰죽지";
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥~");
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void display() {

    }
}
