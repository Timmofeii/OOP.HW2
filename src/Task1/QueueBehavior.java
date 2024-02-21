package Task1;

public interface QueueBehavior {
    void takenQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseForQueue();

}
