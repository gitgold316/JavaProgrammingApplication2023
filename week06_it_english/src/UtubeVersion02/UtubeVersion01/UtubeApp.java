package UtubeVersion01;

public class UtubeApp {
    public static void main(String[] args) {
        LandCh mylandChannel = new LandCh(); // 너튜브 부동산 체널 개설
        KoreanSubscriber ks1 = new KoreanSubscriber("꼬부기",mylandChannel); //구독자 생성 ( 생성과 동시에 2번쨰 매개 변수로 전달된 mylandCh에 등록)
        KoreanSubscriber ks2 = new KoreanSubscriber("피카츄",mylandChannel);
        mylandChannel.setPrice(300000000);  //가격 변동 이 생기면 구독자들에게 알림이 전달됨
        KoreanSubscriber ks3 = new KoreanSubscriber("개굴닌자",mylandChannel);
        mylandChannel.setPrice(250000000);
        mylandChannel.removeSubscriber(ks2);
        mylandChannel.setPrice(260000000);

    }
}
