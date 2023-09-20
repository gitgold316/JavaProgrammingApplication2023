
public class PokemonGame {
    public static void main(String[] args) {
        NoFly noFly = new NoFly();
        Pikachu pikachu = new Pikachu(noFly); //  Association, Has-a (Composition)
        //pikachu.setFlyable(new NoFly());    // 프로그램 실행 중 동적으로 하늘을 나는 방식 변경
        pikachu.performFly();

    }
}