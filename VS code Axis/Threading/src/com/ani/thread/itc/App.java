package com.ani.thread.itc;

public class App {

    public static void demo3(){
        ItcHub hub = new ItcHub();

        Runnable producer = new NumProducer(hub);
        Thread t1 = new Thread(producer);

        Runnable consumer = new NumConsumer(hub);
        Thread t2 = new Thread(consumer);

        // t2.start();
        t1.start();
        t2.start();
    }
    public static void main(String[] args) throws Exception{
        System.out.println("🔥 Threading 🔥");
        demo3();
    }
}
