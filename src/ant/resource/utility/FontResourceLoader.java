package ant.resource.utility;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class FontResourceLoader {
    public static Font getFont(String resourcePath) {
        Font font = null;
        try {
            URI fontURI = ResourceLoader.getResourceURI(resourcePath);
            File fontFile = new File(fontURI);
            font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        return font;
    }
}
