
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URI;

public class ImageOpener {
    public static void OpenImage(String url) {
        try {
            if (!Desktop.isDesktopSupported()) {
                System.out.println("Desktop not supported.");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (!desktop.isSupported(Desktop.Action.BROWSE)) {
                System.out.println("Browser opening not supported.");
                return;
            }
            URI imageURI = URI.create(url);
            desktop.browse(imageURI);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid image URL.");
        }
        catch (HeadlessException e) {
            System.out.println("No desktop environment available.");
        }
        catch (UnsupportedOperationException e) {
            System.out.println("Browser operation not supported.");
        }
        catch (IOException e) {
            System.out.println("Failed to launch browser.");
        }

    }
}
