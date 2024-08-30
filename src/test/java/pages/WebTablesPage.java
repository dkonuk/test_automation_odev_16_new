package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebTablesPage extends BasePage {

    public SelenideElement addButton = $("button[id='addNewRecordButton']");
    public SelenideElement firstName = $("input#firstName");
    public SelenideElement lastName = $("input#lastName");
    public SelenideElement email = $("input#userEmail");
    public SelenideElement age = $("input#age");
    public SelenideElement salary = $("input#salary");
    public SelenideElement department = $("input#department");
    public SelenideElement updatedElementName = $("div:nth-child(4) > div > div:nth-child(1)");


    public SelenideElement submitButton = $("button[id='submit']");
    private String recordToUpdate;
    public SelenideElement editButton = $("#edit-record-4");
    public WebTablesPage(String pageUrl) {
        super(pageUrl);
    }
}
