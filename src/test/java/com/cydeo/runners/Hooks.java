package com.cydeo.runners;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before  //it should come form cucumber java NOT JUNIT
    public void setUp() {
        System.out.println("SET UP BEFORE EACH SCENARIO");
    }


    @After  //it should come form cucumber java NOT JUNIT
    public void tearDown()  {

        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }
}
