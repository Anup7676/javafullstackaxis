package com.ani.thread.sync;

public class Spellingchecker implements Runnable {

    private final ImpData dt;
    
    public Spellingchecker(ImpData dt) {
        this.dt = dt;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++ ) {
            dt.increment();
        }
    }
    
}
