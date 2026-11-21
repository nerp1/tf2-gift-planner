
public class Hat extends Item {
    private String type;
    private String url;

    public Hat(String name, double price, int[] classIds, String type, int itemId, String quality) {
        super(name, price, classIds, itemId, quality);
        this.type = type;
        // Don't use for now when running main, still using test items.
        this.url = ImageHandler.getWikiURLImageHat(name);

        //this.url = "empty";


    }

    public Hat(String name, double price, int[] classIds, String type, int itemId, String quality, String url) {
        super(name, price, classIds, itemId, quality);
        this.type = type;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}

