package com.mayi;

import org.apache.log4j.Logger;

/**
 * Created by fy on 2017/11/1.
 */

public class Main {

    public static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args){
        System.out.println("this is demo study");
        log.info("this is log info");
        log.debug("this is log debug");
        log.warn("this is log warn");
        log.error("this is log error");
    }
}
