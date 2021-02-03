package JavaCoreOne;

public abstract class Overcome {
    private String name;

    public Overcome(String name) {
        this.name=name;
    }

    protected abstract boolean moving(Move actions);

    public String getName() {
        return name;
    }
}
