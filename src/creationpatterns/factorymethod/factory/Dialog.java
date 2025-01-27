package creationpatterns.factorymethod.factory;

import creationpatterns.factorymethod.button.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    protected abstract Button createButton();
}
