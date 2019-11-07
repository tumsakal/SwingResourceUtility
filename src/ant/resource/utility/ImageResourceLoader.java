package ant.resource.utility;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class ImageResourceLoader {
    public static Image getImage(String resourcePath) {
        Image image = null;
        try {
            URL imageURL = ResourceLoader.getResourceURL(resourcePath);
            image = ImageIO.read(imageURL);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
