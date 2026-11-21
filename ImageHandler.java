import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import java.time.Duration;

public class ImageHandler {
    public static String getWikiURLImage (String name) {
        String newName = name.replace(" ", "_");



        String url = "https://wiki.teamfortress.com/w/api.php"
                + String.format("?action=query&titles=File:%s.png&prop=imageinfo&iiprop=url&format=json", newName);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofSeconds(10))
                .GET()
                .build();
        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );


            String json = response.body();
            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

            JsonObject query = jsonObject.getAsJsonObject("query");
            JsonObject pages = query.getAsJsonObject("pages");
            JsonObject page = pages.entrySet().iterator().next().getValue().getAsJsonObject();
            JsonArray imageInfo = page.getAsJsonArray("imageinfo");
            JsonObject image = imageInfo.get(0).getAsJsonObject();

            return image.get("url").getAsString();
            //System.out.println("Image URL: " + imageURL);








        } catch (IOException e) {
            System.out.println("Unable to connect to the TF2 Wiki.");
            return null;

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Image request was interrupted.");
            return null;
        }
    }
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
