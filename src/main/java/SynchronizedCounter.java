public class SynchronizedCounter implements CounterInterface {

    private long counter = 0;

    @Override
    public synchronized void increment() {
        counter++;
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