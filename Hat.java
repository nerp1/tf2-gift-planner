import java.util.ArrayList;

public class Hat extends Item {
    private String type;

    public Hat (String name, double price, int[] classIds, String type, int itemId, String quality) {
        super(name, price, classIds, itemId, quality);
        this.type = type;
    }




}