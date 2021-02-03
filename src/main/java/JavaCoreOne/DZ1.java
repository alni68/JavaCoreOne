package JavaCoreOne;

import java.util.Random;

public class DZ1 {
    public static void main(String[] args) {

        Random rand=new Random();
        Move[] actions=new Move[3];

        int distance=rand.nextInt(10);
        int heigth=rand.nextInt(10);
        actions[0]=new Man("Kuzma", distance, heigth);

        distance=rand.nextInt(10);
        heigth=rand.nextInt(10);
        actions[1]=new Robot("Android", distance, heigth);

        distance=rand.nextInt(10);
        heigth=rand.nextInt(10);
        actions[2]=new Cat("Vsapogah", distance, heigth);

        Overcome[] barriers=new Overcome[6];

        boolean isRoad;
        for (int i=0; i < barriers.length; i++) {
            distance=rand.nextInt(10);
            isRoad=rand.nextBoolean();
            if (isRoad) {
                barriers[i]=new Way("Way " + i, distance);
            } else {
                barriers[i]=new Wall("Wall " + i, distance);
            }
        }

        for (int i=0; i < actions.length; i++) {
            boolean result=true;
            for (int j=0; j < barriers.length; j++) {

                result=barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Passed!");
            } else {
                System.out.println("Fail!");
            }
        }
    }
}
