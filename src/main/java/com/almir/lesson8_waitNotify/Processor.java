package com.almir.lesson8_waitNotify;

import com.almir.Util.InterfaceProcessor;

import java.util.Scanner;

public class Processor implements InterfaceProcessor {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread running ...");
            wait();
            System.out.println("Resumed.");
        }
    }

    public void consume() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this) {
            System.out.println("Waiting for return key.");
            scanner.nextLine();
            System.out.println("Return key pressed");
            notify();
            Thread.sleep(5000);
        }
    }
}
