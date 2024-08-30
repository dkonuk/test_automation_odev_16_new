package tests;

import common.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ElementsTest extends BaseTest {



    @BeforeMethod
    public void before(){
        pagemanager.elementsPage.open();
    }

    @Test
    public void clickMeButtonTest() {
        pagemanager.elementsPage.buttons.click();
        pagemanager.elementsPage.clickMeButton.click();
        assertThat(pagemanager.elementsPage.clickMessage.getText()).isEqualTo("You have done a dynamic click");
    }
}
