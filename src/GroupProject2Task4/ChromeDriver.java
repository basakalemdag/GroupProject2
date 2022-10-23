package GroupProject2Task4;

public class ChromeDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("navigate to Chrome");
    }

    @Override
    public void getScreenshot() {
        System.out.println("get screenshot from Chrome");
    }

    @Override
    public void open() {
        System.out.println("open Google Chrome");
    }

    @Override
    public void close() {
        System.out.println("close Google Chrome");
    }

    @Override
    public String getTitle() {
        System.out.println("Title: Google Chrome");
        return "Google Chrome";
    }
}

class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("navigate to Firefox");
    }

    @Override
    public void getScreenshot() {
        System.out.println("get screenshot from Firefox");
    }

    @Override
    public void open() {
        System.out.println("open Firefox");
    }

    @Override
    public void close() {
        System.out.println("close Firefox");
    }

    @Override
    public String getTitle() {
        System.out.println("Title: Firefox");
        return "Firefox";
    }
}

class SafariDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("navigate to Safari");
    }

    @Override
    public void getScreenshot() {
        System.out.println("get screenshot from Safari");
    }

    @Override
    public void open() {
        System.out.println("open Safari");
    }

    @Override
    public void close() {
        System.out.println("close Safari");
    }

    @Override
    public String getTitle() {
        System.out.println("Title: Safari");
        return "Safari";
    }
}

