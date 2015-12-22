package org.h6;

import org.h6.ducker.GitInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class DuckerApplication {

    private final static Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        SpringApplication.run(DuckerApplication.class, args);
        logger.log(Level.INFO, "[TAG] :" + GitInfo.TAG);
    }
}

