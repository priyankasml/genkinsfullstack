package com.klef.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class HotelmangementapiSrpingbootApplication {

    private static final Logger logger = LoggerFactory.getLogger(HotelmangementapiSrpingbootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HotelmangementapiSrpingbootApplication.class, args);
        logger.info("Project running............");
    }

}
