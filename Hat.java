import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;

public class Hat extends Item {
    private String type;
    private String url;

    public Hat (String name, double price, int[] classIds, String type, int itemId, String quality) {
        super(name, price, classIds, itemId, quality);
        this.type = type;
        this.url = this.getWikiURLImage(name);

    }

    public Hat (String name, double price, int[] classIds, String type, int itemId, String quality, String url) {
        super(name, price, classIds, itemId, quality);
        this.type = type;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getWikiURLImage (String name) {
        String newName = name.replace(" ", "_");



        String url = "https://wiki.teamfortress.com/w/api.php"
                + String.format("?action=query&titles=File:%s.png&prop=imageinfo&iiprop=url&format=json", newName);

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
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
            e.printStackTrace();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }



        return null;
    }
}

