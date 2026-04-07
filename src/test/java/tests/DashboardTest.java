package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DashboardPage;

public class DashboardTest extends BaseTest {

    @Test
    public void testDashboard() {

        DashboardPage dash = new DashboardPage(page);
        System.out.println("Title: " + dash.getTitle());
    }
}