package com.nam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import x42.Sicario;

import static java.lang.Thread.sleep;

public class Main {

    public static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
	// write your code here

        log.info("Info");
        log.warn("Warning");
        log.debug("Debug");
        log.error("Error");

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("Tick");

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                log.info("Tack");

                Sicario hitman = new Sicario();

                hitman.X42();
            }
        });

        th.start();

    }
}
