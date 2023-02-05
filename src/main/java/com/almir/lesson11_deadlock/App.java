package com.almir.lesson11_deadlock;

import static com.almir.Util.RunProcessor.runner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        runner(new Runner());
    }
}
