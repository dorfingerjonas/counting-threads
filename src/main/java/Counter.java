public class Counter implements CounterInterface {

    private long counter = 0;

    @Override
    public void increment() {
        counter++;
    }

    @Override
    public long getCounter() {
        return counter;
    }

    @Override
    public void init(long startvalue) {
        counter = startvalue;
    }
}