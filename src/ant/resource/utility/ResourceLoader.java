package ant.resource.utility;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ResourceLoader {
    private static final ClassLoader CLASS_LOADER = ResourceLoader.class.getClassLoader();

    public static URL getResourceURL(String resourcePath){
        URL url = CLASS_LOADER.getResource(resourcePath);
        return url;
    }
    public static URI getResourceURI(String resourcePath){
        URI uri = null;
        try {
            uri = getResourceURL(resourcePath).toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri;
    }
}
