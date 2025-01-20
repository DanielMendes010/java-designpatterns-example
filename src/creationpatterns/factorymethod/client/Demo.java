package creationpatterns.factorymethod.client;

import creationpatterns.factorymethod.factory.Dialog;
import creationpatterns.factorymethod.factory.HtmlDialog;
import creationpatterns.factorymethod.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 11")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
