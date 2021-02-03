package JavaCoreOne;

public class Man extends Move {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Man(String name, int distance, int jumpHeight) {
        this.name=name;
        this.runDistance=distance;
        this.jumpHeight=jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Man " + this.name + " is running " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Man " + this.name + " is jumping " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }

}
