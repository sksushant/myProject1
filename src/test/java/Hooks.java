import functionLibrary.commonFunctions;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Hooks {
    commonFunctions commonfunctions = new commonFunctions();

    @Before
    public void beforeTest() {
        commonfunctions.openBrowser();
    }

    @After
    public void afterTest() {
        commonfunctions.closeBrowser();
    }

}

