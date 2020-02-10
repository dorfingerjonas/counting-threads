public class Main {

    final static long MAX_VALUE = 300_000_000;
    final static int NR_THREADS = 3;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Counting Threads example");
        Counter counter = new Counter();
        testCounterThreads("Counter unprotected", counter);
    }

    private static void testCounterThreads(String name, CounterInterface counter) throws InterruptedException {
        CountingThread[] threads = new CountingThread[NR_THREADS];
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new CountingThread("Counter" + (i + 1), counter, MAX_VALUE / threads.length);
            threads[i].start();
        }

        for (CountingThread thread : threads) {
            thread.join();
        }

        long stopTime = System.currentTimeMillis();
        long timeElapsed = stopTime - startTime;
        System.out.printf("Result: %,d \tDiff: %,d \tTime: %,d ms\n",
                counter.getCounter(),
                (MAX_VALUE - counter.getCounter()),
                timeElapsed);
    }
}