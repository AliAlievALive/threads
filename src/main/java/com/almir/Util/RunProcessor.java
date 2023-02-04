package com.almir.Util;

import com.almir.lesson9_lowLevelSync.Processor;

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

}
