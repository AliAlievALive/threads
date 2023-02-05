package com.almir.lesson10_re_entrantLocks;

import static com.almir.Util.RunProcessor.runner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        runner(new Runner());
    }
}
