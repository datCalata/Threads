package com.company;

/**
 * Created by jcala on 03/02/2017.
 */
public class getTheMail implements Runnable{

    private int checkingAttemps;
    private int delay;

    public getTheMail(int cA,int delay){
        checkingAttemps = cA;
        this.delay = delay*1000;
    }

    @Override
    public void run() {
        for(int i = 0; i < checkingAttemps; i++){

            try{
                Thread.sleep(delay);
            }catch (InterruptedException e){

            }

            System.out.println("Checking Mail");


        }
    }
}
