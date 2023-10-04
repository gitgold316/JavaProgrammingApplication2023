package UtubeVersion01;

public class KoreanSubscriber implements Subscriber{
    private String name;
    private int value;
    private LandCh landch;  //has-a (Aggregation)

    public KoreanSubscriber(String name, LandCh landch) {
        this.name = name;
        this.landch = landch;
        landch.registerSubscriber(this); //실행시점의 객체를 UtubeVersion01.LandCh 객체를 이용하여 ArrayList에 등록
    }

    @Override
    public void update(int value) {
        this.value = value;
        System.out.println(name + "님 가격이" + value + "원으로 변경되었습니다");
    }
}
