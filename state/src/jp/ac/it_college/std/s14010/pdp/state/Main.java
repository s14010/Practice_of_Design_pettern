package jp.ac.it_college.std.s14010.pdp.state;

/**
 * Created by s14010 on 15/06/17.
 */
public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24 ; hour++) {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){

                }
            }
        }
    }
}
