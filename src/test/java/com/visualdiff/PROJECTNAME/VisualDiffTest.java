package com.visualdiff.PROJECTNAME;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.Model.Configuration;
import com.Utils.WebDriverHelper;
import com.Utils.ConfigurationHelper;
import com.Utils.MethodsHelper;
import org.kreyssel.selenium.visualdiff.core.junit4.TakesScreenshotRule;

public class VisualDiffTest {

    @Rule
    public TakesScreenshotRule screenshot = new TakesScreenshotRule();
    private Configuration configParams = new Configuration();
    private MethodsHelper methodsHelper = new MethodsHelper();
    private WebDriver driver;

    @Before
    public void init() {
        configParams = ConfigurationHelper.getConfigurationParameters();
        driver = WebDriverHelper.createDriver(configParams.getBrowser());
    }

    @After
    public void destroy() {
        driver.close();
    }

    @Test
    public void takeScreenshotsOfContentTypes() throws Exception {

        // HOMEPAGE.
        driver.get( configParams.getBaseURL() );
        methodsHelper.loginToCMS(driver);
        screenshot.takeScreenshot(configParams.getHomepage(), driver );

        // ARTICLE CONTENT TYPE.
        driver.get( configParams.getBaseURL() + configParams.getArticlePath() );
        screenshot.takeScreenshot(configParams.getArticle(), driver );

    }
}