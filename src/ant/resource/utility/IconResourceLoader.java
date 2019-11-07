package ant.resource.utility;

import javax.swing.*;
import java.net.URL;

public class IconResourceLoader {
    public static Icon getIcon(String resourcePath) {
        URL iconURL = ResourceLoader.getResourceURL(resourcePath);
        return new ImageIcon(iconURL);
    }
}
