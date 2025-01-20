package creationpatterns.abstractfactory.client;

import creationpatterns.abstractfactory.button.Button;
import creationpatterns.abstractfactory.checkbox.Checkbox;
import creationpatterns.abstractfactory.factory.GUIFactory;

public class Application {

    private Button button;

    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
