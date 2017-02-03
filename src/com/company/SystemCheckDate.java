package com.company;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by jcala on 03/02/2017.
 */
public class SystemCheckDate implements Runnable{

    @Override
    public void run() {
        Date myDate = new Date();
        Locale location = new Locale("es");

        DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, location);
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, location);

        System.out.printf("%s \n%s \n",timeFormatter.format(myDate),dateFormatter.format(myDate));
    }
}
