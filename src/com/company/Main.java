package com.company;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	    //Thread getDate = new getDate20();
	    //Runnable getMail1 = new getTheMail(2,8);
	    //Runnable getMail2 = new getTheMail(1,12);

	    //getDate.start();

	    //new Thread(getMail1).start();
	    //new Thread(getMail2).start();

	    addEventPoolThread();
    }
    public static void addEventPoolThread(){
        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
        eventPool.scheduleAtFixedRate(new SystemCheckDate(),0,1,TimeUnit.SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"),5,10, TimeUnit.SECONDS);


    }

}
