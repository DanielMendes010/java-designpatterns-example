package creationpatterns.factorymethod.factory;

import creationpatterns.factorymethod.button.Button;
import creationpatterns.factorymethod.button.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
