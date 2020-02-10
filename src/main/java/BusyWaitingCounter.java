public class BusyWaitingCounter implements CounterInterface {

    private long value;
    private boolean available = true;

    @Override
    public void increment() {
        // Entry section
        while (!available) {
            // do nothing
            ;
        }

        available = false;

        // critical section
        value++;

        // Exit section
        available = true;
    }

    @Override
    public long getCounter() {
        return value;
    }

    @Override
    public void init(long startValue) {
        value = startValue;
    }
}