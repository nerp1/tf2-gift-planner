import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import com.google.gson.Gson;

public class Hat extends Item {
    private String type;
    private String url;

    public Hat (String name, double price, int[] classIds, String type, int itemId, String quality) {
        super(name, price, classIds, itemId, quality);
        this.type = type;
        this.url = null;

    }

    public Hat (String name, double price, int[] classIds, String type, int itemId, String quality, String url) {
        super(name, price, classIds, itemId, quality);
        this.type = type;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getWikiURLImage () {
        String url = "https://wiki.teamfortress.com/w/api.php"
                + "?action=query&titles=Hat&format=json";

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );
            System.out.println(response.statusCode());
            System.out.println(response.body());

        } catch (IOException e) {
            e.printStackTrace();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }



        return null;
    }
}

