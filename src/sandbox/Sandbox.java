package sandbox;

import sandbox.workers.TestTimeWorker;

/**
 *
 * @author Martin
 */
public class Sandbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestTimeWorker testTimeWorker = new TestTimeWorker();
        testTimeWorker.start();
    }

}
