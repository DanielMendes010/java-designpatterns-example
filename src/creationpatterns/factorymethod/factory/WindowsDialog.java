package creationpatterns.factorymethod.factory;

import creationpatterns.factorymethod.button.Button;
import creationpatterns.factorymethod.button.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
