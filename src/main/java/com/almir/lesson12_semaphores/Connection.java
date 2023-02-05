package com.almir.lesson12_semaphores;

import java.util.concurrent.Semaphore;

public class Connection {
    private static final Connection instance = new Connection();
    private final Semaphore sem = new Semaphore(10);
    private int connections = 0;
    public Connection() {
    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            doConnect();
        }
        finally {
            sem.release();
        }
    }

    public void doConnect() {
        synchronized (this) {
            connections++;
            System.out.println("Current connections: " + connections);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            connections--;
        }
    }
}
