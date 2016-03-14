package com.Utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.WebDriver;


public class WebDriverHelper {

    public enum Browser {
        HEADLESS_DESKTOP, HEADLESS_TABLET_PORTRAIT, HEADLESS_TABLET_LANDSCAPE, FIREFOX_DESKTOP, FIREFOX_TABLET_LANDSCAPE, FIREFOX_TABLET_PORTRAIT
    }

    public static WebDriver createDriver(Browser browser) {

        switch (browser) {
            case HEADLESS_DESKTOP: {
                PhantomJSDriver phantomDriver = new PhantomJSDriver();
                phantomDriver.manage().window().setSize(new Dimension(1920, 1080));
                return phantomDriver;
            }
            case HEADLESS_TABLET_PORTRAIT: {
                PhantomJSDriver phantomDriver = new PhantomJSDriver();
                phantomDriver.manage().window().setSize(new Dimension(768, 1024));
                return phantomDriver;
            }
            case HEADLESS_TABLET_LANDSCAPE: {
                PhantomJSDriver phantomDriver = new PhantomJSDriver();
                phantomDriver.manage().window().setSize(new Dimension(1024, 768));
                return phantomDriver;
            }
            case FIREFOX_DESKTOP: {
                FirefoxDriver firefoxDriver = new FirefoxDriver();
                firefoxDriver.manage().window().setSize(new Dimension(1920, 1080));
                return firefoxDriver;
            }
            case FIREFOX_TABLET_PORTRAIT: {
                FirefoxDriver firefoxDriver = new FirefoxDriver();
                firefoxDriver.manage().window().setSize(new Dimension(768, 1024));
                return firefoxDriver;
            }
            case FIREFOX_TABLET_LANDSCAPE: {
                FirefoxDriver firefoxDriver = new FirefoxDriver();
                firefoxDriver.manage().window().setSize(new Dimension(1024, 768));
                return firefoxDriver;
            }
            default: {
                FirefoxDriver firefoxDriver = new FirefoxDriver();
                firefoxDriver.manage().window().setSize(new Dimension(1920, 1080));
                return firefoxDriver;
            }
        }
    }
}
