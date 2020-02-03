public class Counter {

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }

    public void init(int startValue) {
        counter = startValue;
    }
}