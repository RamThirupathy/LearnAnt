package com.rkt;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
         logger.info("Hi, There!!");
    }
}