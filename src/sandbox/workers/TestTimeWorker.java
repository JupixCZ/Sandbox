package sandbox.workers;

import com.sun.jna.Native;
import sandbox.domain.Kernel32;

public class TestTimeWorker implements Runnable {

    private Thread t;
    private String threadName;
    private final Kernel32 lib;

    public TestTimeWorker() {
        lib = (Kernel32) Native.loadLibrary("kernel32", Kernel32.class);
    }

    @Override
    public void run() {
        System.out.println("run");
        while (true) {
            Kernel32.SYSTEMTIME time = new Kernel32.SYSTEMTIME();
            lib.GetLocalTime(time);
            System.out.println("Year is " + time.wYear);
            System.out.println("Month is " + time.wMonth);
            System.out.println("Day of Week is " + time.wDayOfWeek);
            System.out.println("Day is " + time.wDay);
            System.out.println("Hour is " + time.wHour);
            System.out.println("Minute is " + time.wMinute);
            System.out.println("Second is " + time.wSecond);
            System.out.println("Milliseconds are " + time.wMilliseconds);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

}
