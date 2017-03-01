/**
 * Created by Probook on 2017-02-27.
 */
public class BoltExample {

    public static void main(String[] args) {
        Bolt bolt = new Bolt();

        //  bolt.prisukti();
        loop(bolt);
        //  bolt.atsukti();

    }

    private static void loop(Bolt bolt) {
        for (int i = 0; i <= 5; i++) {

            bolt.prisukti();
        }
    }
}
