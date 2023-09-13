package version02;

public class MallardDuck extends Duck{
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
