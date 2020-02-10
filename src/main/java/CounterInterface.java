public interface CounterInterface {

    void increment();
    long getCounter();
    void init(long startValue);
}