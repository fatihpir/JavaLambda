package thread;

/**
 * Created by fatihpir on 23.12.2016.
 */
public class Thread {
    public static void main(String[] args){
        /*
        Eski türden
         */
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Bilinen java ile");
            }
        };
        /*
        Lambda ile
         */
        Runnable r2=()-> System.out.println("Java 8 lambda ile");

        r1.run();
        r2.run();
    }
}
