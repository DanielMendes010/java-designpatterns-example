package creationpatterns.abstractfactory.client;

import creationpatterns.abstractfactory.factory.GUIFactory;
import creationpatterns.abstractfactory.factory.MacOSFactory;
import creationpatterns.abstractfactory.factory.WindowsFactory;

public class Demo {

    private static Application configureApplication() {
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        application = new Application(factory);
        return application;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }

 }
