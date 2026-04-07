package ui;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class TestUI {

    @Test
    public void testGoogle() {

        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(true)
            );

            Page page = browser.newPage();
            page.navigate("https://www.google.com");

            System.out.println("Page Title: " + page.title());

            browser.close();
        }
    }
}