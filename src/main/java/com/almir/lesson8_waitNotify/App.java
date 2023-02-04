package com.almir.lesson8_waitNotify;

import static com.almir.Util.RunProcessor.runProcessor;

public class App {
    public static void main(String[] args) throws InterruptedException {
        runProcessor(new Processor());
    }

}
