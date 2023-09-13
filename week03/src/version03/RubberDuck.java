package version03;

public class RubberDuck extends Duck implements Quackable{

    public RubberDuck() {
        this.name = "고무오리";
    }

    @Override
    public void quack() {
        System.out.println("삑삑~");
    }

    @Override
    public void display() {

    }
}
