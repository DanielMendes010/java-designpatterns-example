package creationpatterns.abstractfactory.factory;

import creationpatterns.abstractfactory.button.Button;
import creationpatterns.abstractfactory.button.MacOSButton;
import creationpatterns.abstractfactory.checkbox.Checkbox;
import creationpatterns.abstractfactory.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
