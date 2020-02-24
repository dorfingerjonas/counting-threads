import java.util.concurrent.Semaphore;

public class SemaphoreCounter implements CounterInterface {

    private long counter = 0;
    static Semaphore sem = new Semaphore(1);

    @Override
    public void increment() {
        try {
            sem.acquire();
            counter++;
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public long getCounter() {
        return counter;
    }

    @Override
    public void init(long startValue) {
        counter = startValue;
    }
}