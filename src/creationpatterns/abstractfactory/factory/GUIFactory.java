package creationpatterns.abstractfactory.factory;

import creationpatterns.abstractfactory.button.Button;
import creationpatterns.abstractfactory.checkbox.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
