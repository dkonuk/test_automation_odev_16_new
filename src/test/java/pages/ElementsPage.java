package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage extends BasePage {

    public SelenideElement buttons = $("div.show li#item-4");
    public SelenideElement clickMeButton = $("div.mt-4 > button.btn-primary:not(#rightClickBtn)");
    public SelenideElement clickMessage = $("#dynamicClickMessage");


    public ElementsPage(String pageUrl) {
        super(pageUrl);
    }
}
