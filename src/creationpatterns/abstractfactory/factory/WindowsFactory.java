package creationpatterns.abstractfactory.factory;

import creationpatterns.abstractfactory.button.Button;
import creationpatterns.abstractfactory.button.WindowsButton;
import creationpatterns.abstractfactory.checkbox.Checkbox;
import creationpatterns.abstractfactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
