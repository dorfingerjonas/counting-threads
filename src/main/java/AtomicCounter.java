import java.util.concurrent.atomic.AtomicLong;

public class AtomicCounter implements CounterInterface {

    private AtomicLong counter = new AtomicLong(0);

    @Override
    public synchronized void increment() {
        counter.incrementAndGet();
    }

    @Override
    public long getCounter() {
        return counter.get();
    }

    @Override
    public void init(long startValue) {
        counter.set(startValue);
    }
}