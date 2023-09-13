package version03;

public abstract class Duck {
    String name;

    public void quack() {
        System.out.println("꽥꽥~");
    }
    public void swim(){
        System.out.println("수영중..");
    }
    public void fly(){
        System.out.println("날다~");
    }
    public abstract void display();
}
