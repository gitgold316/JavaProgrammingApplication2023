package UtubeVersion01;

public interface Subject {
    void registerSubscriber(Subscriber s);
    void removeSubscriber(Subscriber s);
    void notifySubscriber();
}
