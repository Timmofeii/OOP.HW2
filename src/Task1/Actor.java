package Task1;

public abstract class Actor implements ActorBehavior {
    protected  String name;
    protected  boolean makeOrder;
    protected boolean takeOrder;

    public String getName() {
        return name;
    }

    public Actor(String name) {
        this.name = name;

    }
}
