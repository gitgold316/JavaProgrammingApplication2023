package UtubeVersion01;

import java.util.ArrayList;
import java.util.List;

public class LandCh implements Subject{
    private int price;
    private List<Subscriber> subscribers;

    public LandCh() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber s) {  //구독자 등록
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) { //구독자 해지
        subscribers.remove(s);
    }

    @Override
    public void notifySubscriber() {  //구독자들에게 가격변동을 알림
//        for(UtubeVersion01.Subscriber subscriber : subscribers)
//            subscriber.update(price);
        subscribers.forEach(s -> s.update(price));

    }

    public void setPrice(int price) {
        this.price = price;
        notifySubscriber();  //부동산 가격 변동시 알람 메서드 호출
    }
}
