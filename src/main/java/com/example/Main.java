package com.example;

import org.apache.logging.log4j.LogManager;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        //JUL to SLF4J
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();

        System.out.println("Hello, World!");

        Logger.getLogger(Main.class.getName()).info("JUL Hello World!!!");

        LogManager.getLogger(Main.class.getName()).info("Log4j Hello world!!!");

        LoggerFactory.getLogger(Main.class).info("SLF4J Hello world!!!");

    }
}