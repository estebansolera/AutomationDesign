package instrumented.code;

import org.openqa.selenium.By;

import java.util.List;

public class DriverDecorator extends Driver {
    protected final Driver Driver;

    public DriverDecorator(Driver driver) {
        Driver = driver;
    }

    @Override
    public void start(Browser browser) {
        Driver.start(browser);
    }

    @Override
    public void quit() {
        Driver.quit();
    }

    @Override
    public void goToUrl(String url) {
        Driver.goToUrl(url);
    }

    @Override
    public Element findElement(By locator) {
        return Driver.findElement(locator);
    }

    @Override
    public List<Element> findElements(By locator) {
        return Driver.findElements(locator);
    }
}