package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void verifyTitle() {
        System.out.println("Page Title: " + driver.getTitle());
    }
}
