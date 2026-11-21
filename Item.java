
public class Item {
    private String name;
    private double price;
    private int[] classIds; //0 = scout, 1 = soldier, etc
    private int itemId;
    private String quality;
    private String url;

    public Item(String name, double price, int[] classIds, int itemId, String quality) {
        this.name = name;
        this.price = price;
        this.classIds = classIds;
        this.itemId = itemId;
        this.quality = quality;
        this.url = ImageHandler.getWikiURLImage(name); // Don't use main, database unfinished.
    }


    public Item(String name, double price, int[] classIds, int itemId, String quality, String url) {
        this.name = name;
        this.price = price;
        this.classIds = classIds;
        this.itemId = itemId;
        this.quality = quality;
        this.url = url;
    }

    public Item(String name) {
        this.name = name;
        this.price = 0.00;
        this.classIds = null;
        this.itemId = 0;
        this.quality = "empty";
        this.url = "empty";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int[] getClassIds() {
        return classIds;
    }

    public int getItemId() {
        return itemId;
    }

    public String getQuality() {
        String trimmed = quality.trim();
        if (!trimmed.contains(" ")) {
            return trimmed.substring(0, 1).toUpperCase() + trimmed.substring(1);
        } else {
            String[] words = trimmed.split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }
            return String.join(" ", words);
        }
    }

    public boolean containsClass(int classId) {
        for (int id : this.getClassIds()) {
            if (id == classId) {
                return true;
            }
        }
        return false;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public String toString() {
        return String.format("%s %s - Price: %.2f ref",this.getQuality(), this.getName(), this.getPrice());
    }

}



