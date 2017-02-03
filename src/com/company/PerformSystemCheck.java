package com.company;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jcala on 03/02/2017.
 */
public class PerformSystemCheck implements Runnable{

    private String checkWhat;
    ReentrantLock lock = new ReentrantLock();

    public PerformSystemCheck(String checkWhat) {
        this.checkWhat = checkWhat;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.println("I'm checking  "+checkWhat);
        lock.unlock();
    }
}
