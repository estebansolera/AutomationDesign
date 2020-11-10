package pages.v7.multifilepageobjectsectionsdriverinterfaces.Sections;

import core.Element;
import core.ElementFindService;
import org.openqa.selenium.By;

public class CartInfoSection {
    private final ElementFindService _elementFindService;

    public CartInfoSection(ElementFindService elementFindService) {
        _elementFindService = elementFindService;
    }

    private Element cartIcon() {
        return _elementFindService.findElement(By.className("cart-contents"));
    }

    private Element cartAmount() {
        return _elementFindService.findElement(By.className("amount"));
    }

    public String getCurrentAmount()
    {
        return cartAmount().getText();
    }

    public void openCart()
    {
        cartIcon().click();
    }
}