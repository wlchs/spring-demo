package com.laszloborbely.spring_demo_security.aspects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndexAfterReturnAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void afterReturn(Object returnValue) throws Throwable {
        logger.info("value return was {}", returnValue);
    }
}
