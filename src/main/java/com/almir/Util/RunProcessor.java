package com.almir.Util;

public class RunProcessor {
    public static void runProcessor(InterfaceProcessor processor) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                processor.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                processor.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    public static void runner(InterfaceRunner runner) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                runner.firstThread();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                runner.secondThread();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        runner.finished();
    }
}
