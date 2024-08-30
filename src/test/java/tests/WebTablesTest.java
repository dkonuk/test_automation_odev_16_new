package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTablesTest extends BaseTest {
    @BeforeMethod
    public void before(){
        pagemanager.webTablesPage.open();
    }

    @Test
    public void addNewUserTest() {
        pagemanager.webTablesPage.addButton.click();
        pagemanager.webTablesPage.firstName.setValue("TestName");
        pagemanager.webTablesPage.lastName.setValue("Test");
        pagemanager.webTablesPage.email.setValue("Test@test.com");
        pagemanager.webTablesPage.age.setValue("35");
        pagemanager.webTablesPage.salary.setValue("35000");
        pagemanager.webTablesPage.department.setValue("Test");
        pagemanager.webTablesPage.submitButton.click();

        pagemanager.webTablesPage.editButton.click();
        pagemanager.webTablesPage.firstName.clear();
        pagemanager.webTablesPage.firstName.setValue("John");
        pagemanager.webTablesPage.lastName.clear();
        pagemanager.webTablesPage.lastName.setValue("Doe");
        pagemanager.webTablesPage.email.clear();
        pagemanager.webTablesPage.email.setValue("Doe@doe.com");
        pagemanager.webTablesPage.age.clear();
        pagemanager.webTablesPage.age.setValue("40");
        pagemanager.webTablesPage.salary.clear();
        pagemanager.webTablesPage.salary.setValue("40000");
        pagemanager.webTablesPage.department.clear();
        pagemanager.webTablesPage.department.setValue("Human Resources");
        pagemanager.webTablesPage.submitButton.click();
        assertThat(pagemanager.webTablesPage.updatedElementName.getText()).isEqualTo("John");





    }
}
