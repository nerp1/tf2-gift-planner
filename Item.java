
public class Item {
    private String name;
    private double price;
    private int[] classIds; //0 = scout, 1 = soldier, etc
    private int itemId;
    private String quality;

    public Item(String name, double price, int[] classIds, int itemId, String quality) {
        this.name = name;
        this.price = price;
        this.classIds = classIds;
        this.itemId = itemId;
        this.quality = quality;
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
        return quality;
    }

    public boolean containsClass(int[] classIds, int classId) {
        for (int i = 0; i < classIds.length; i++) {
            if (classIds[i] == classId) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return String.format("%s %s - Price: %.2f",this.getQuality(), this.getName(), this.getPrice());
    }

}



