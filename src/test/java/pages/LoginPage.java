package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigate() {
        page.navigate("https://example.com/login");
    }

    public void login(String user, String pass) {
        page.fill("#username", user);
        page.fill("#password", pass);
        page.click("#loginBtn");
    }
}