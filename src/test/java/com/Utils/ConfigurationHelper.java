package com.Utils;

import com.Model.Configuration;
import com.Utils.WebDriverHelper.Browser;

public class ConfigurationHelper {

   public static Configuration getConfigurationParameters() {
       Configuration configuration = new Configuration();

       // Command line parameters.
       String baseURL = System.getProperty("baseURL");
       String browser = System.getProperty("browser");
       String username = System.getProperty("username");
       String password = System.getProperty("password");

       // Set command line parameter values.
       configuration.setBaseURL(baseURL);
       configuration.setBrowser(Browser.valueOf(browser));
       configuration.setUsernameValue(username);
       configuration.setPasswordValue(password);
       return configuration;
   }
}
