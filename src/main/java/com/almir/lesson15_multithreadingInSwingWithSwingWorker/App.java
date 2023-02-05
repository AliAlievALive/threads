package com.almir.lesson15_multithreadingInSwingWithSwingWorker;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame("SwingWorker Demo"));
    }
}
