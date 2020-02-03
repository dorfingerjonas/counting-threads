public class Counter {

    private long counter;

    public long getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }

    public void init(long startValue) {
        counter = startValue;
    }
}