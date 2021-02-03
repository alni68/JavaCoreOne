package JavaCoreOne;

public class Way extends Overcome {
    private int length;

    public Way(String name, int length) {
        super(name);

        this.length=length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Move actions) {
        System.out.println("The road " + super.getName() + " length: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("run success");

            return true;
        } else {
            System.out.println("run not success");

            return false;
        }
    }
}