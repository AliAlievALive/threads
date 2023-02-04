package com.almir.lesson9_lowLevelSync;

import static com.almir.Util.RunProcessor.runProcessor;

public class App {
    public static void main(String[] args) throws InterruptedException {
        runProcessor(new Processor());
    }
}
