package com.company;
import java.util.*;
import java.text.DateFormat;

public class getDate20 extends Thread{

    public void run(){
        Date miFecha;
        Locale localizacion;
        DateFormat fechaFormatter;
        DateFormat horaFormatter;
        String horaOut;
        String fechaOut;

        for(int i = 0; i < 20; i++){
            miFecha = new Date();
            localizacion = new Locale("es");

            horaFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, localizacion);
            fechaFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, localizacion);

            horaOut = horaFormatter.format(miFecha);
            fechaOut = fechaFormatter.format(miFecha);

            System.out.printf("%s \n %s \n",horaOut,fechaOut);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }

    }

}
