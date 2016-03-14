package com.Model;

import com.Utils.WebDriverHelper.Browser;

public class Configuration {

    // Command line parameters.
    private String baseURL;
    private Browser browser;
    private String username;
    private String password;

    // Content type names.
    private final static String HOMEPAGE = "homepage";
    private final static String ARTICLE = "article";

    // Content types paths.
    private final static String PATH_ARTICLE = "/node/add/article";

    // UI Objects
    private final static String FIELD_USERNAME = "edit-name";
    private final static String FIELD_PASSWORD = "edit-pass";
    private final static String BUTTON_LOGIN = "edit-submit";

    // Get command line parameters.
    public String getBaseURL() {
        return baseURL;
    }

    public Browser getBrowser() {
        return browser;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Get content type name.
    public String getHomepage() {
        return HOMEPAGE;
    }

    public String getArticle() {
        return ARTICLE;
    }

    // Get content type paths.
    public String getArticlePath() {
        return PATH_ARTICLE;
    }

    // Get UI objects.
    public String getUsernameField() {
        return FIELD_USERNAME;
    }

    public String getPasswordField() {
        return FIELD_PASSWORD;
    }

    public String getLoginButton() { return BUTTON_LOGIN; }

    // Set command line parameters.
    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public void setUsernameValue(String username) {
        this.username = username;
    }

    public void setPasswordValue(String password) {
        this.password = password;
    }
}
