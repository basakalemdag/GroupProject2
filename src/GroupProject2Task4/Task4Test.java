package GroupProject2Task4;

public class Task4Test {

    public static void main(String[] args) {

        RemoteWebDriver[] arr = { new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        for(RemoteWebDriver driver:arr) {
            driver.navigate();
            driver.getScreenshot();
            driver.open();
            driver.close();
            driver.getTitle();
        }
    }
}
