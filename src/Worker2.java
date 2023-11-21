public class Worker2 implements Runnable {

    private final Object resource1;

    public Worker2(Object resource1) {
        this.resource1 = resource1;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            try {
                System.out.println("* Worker2");
                Thread.sleep(1000);
                System.out.println("* Worker2");
                Thread.sleep(1000);
                System.out.println("* Worker2");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
