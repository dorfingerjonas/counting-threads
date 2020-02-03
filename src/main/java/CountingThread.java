public class CountingThread extends Thread{

    private Counter counter;
    private long maxCount;
    private String threadName;

    public CountingThread(String threadName, Counter counter, long maxCount) {
        super(threadName);
        this.counter = counter;
        this.maxCount = maxCount;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < maxCount; i++) {
            counter.increment();
        }
    }
}