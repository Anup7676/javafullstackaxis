package com.ani.thread.sync;

public class App {

    public static void demo2() {

        ImpData dt = new ImpData();

        Runnable task1 = new Spellingchecker(dt);
        Thread t1 = new Thread(task1);
      
        Runnable task2 = new GrammarChecker(dt);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } 
        catch (InterruptedException e) {
           System.out.println("There is a problem");
        }

        dt.currentCount();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 Threading 🔥");
        demo2();
    }
}
