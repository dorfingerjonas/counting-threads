public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Counting Threads example");

        long maxCount = 300_000_000;

        Counter counter = new Counter();
        CountingThread[] threads = new CountingThread[3];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new CountingThread("Counter" + (i + 1), counter, maxCount / threads.length);
            threads[i].start();
        }

        for (CountingThread thread : threads) {
            thread.join();
        }

        long stopTime = System.currentTimeMillis();
        long timeElapsed = stopTime - startTime;
        System.out.printf("Result: %,d \tDiff: %,d \tTime: %,d ms\n",
                counter.getCounter(),
                (maxCount - counter.getCounter()),
                timeElapsed);
    }
}