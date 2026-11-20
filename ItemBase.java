import java.util.ArrayList;
import java.util.Comparator;
public class ItemBase {

    private ArrayList<Hat> hats;
    private ArrayList<Weapon> weapons;

    public ItemBase() {
        this.hats = new ArrayList<>();
        this.weapons = new ArrayList<>();
    }

    public void addHat(String name, double price, int[] classIds,  String quality, String type, int itemId) {
        Hat x = new Hat(name, price, classIds, type, itemId, quality);
        hats.add(x);
    }

    public void addWeapon(String name, double price, int[] classIds, String quality, int itemId, int slotIndex) {
        Weapon z = new Weapon(name, price, classIds, quality, itemId, slotIndex);
        weapons.add(z);
    }

    public ArrayList<Hat> getHats() {
        return hats;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }


}
