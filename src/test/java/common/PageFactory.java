package common;

import pages.ElementsPage;
import pages.WebTablesPage;

public class PageFactory {

    public static ElementsPage buildElementsPage() {
        return new ElementsPage("/elements");
    }
    public static WebTablesPage buildWebTablesPage() {
        return new WebTablesPage("/webtables");
    }
}
