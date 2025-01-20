package creationpatterns.factorymethod.button;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<staticfactory.button>Test Button</staticfactory.button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
