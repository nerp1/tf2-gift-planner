import java.util.ArrayList;
import java.util.Comparator;

public class SortUtil {
    public static ArrayList<Item> SortByPrice(ArrayList<Item> itemListToSort) {
        ArrayList<Item> list = new ArrayList<>(itemListToSort);
        list.sort(Comparator.comparingDouble(Item::getPrice));
        return list;
    }
}
