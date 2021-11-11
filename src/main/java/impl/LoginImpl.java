package impl;

import pages.LoginPage;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class LoginImpl {
    private LoginPage page;

    public LoginPage getPage() {
        if (page == null) {
            page = new LoginPage();
        }
        return page;
    }

    public void navToLoginPage() {
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }

    public void fillInput(String inputUser, String value) {
        switch (inputUser.toLowerCase()) {
            case "username":
                getPage().userNameInput.sendKeys(value);
                break;
            case "password":
                getPage().passwordInput.sendKeys(value);
                break;
            default:
                System.out.println("username/password not found...");
        }
    }
}
