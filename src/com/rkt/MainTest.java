package com.rkt;

import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.fail;

public class MainTest {
    private static final Logger logger = Logger.getLogger(MainTest.class);

    @Test
    public void testNothing() {
        logger.info("Test nothing.");
        //fail("Fake fail");
    }
}
