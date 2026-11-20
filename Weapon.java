

public class Weapon extends Item {

    private int slotIndex;

    public Weapon (String name, double price, int[] classIds, String quality, int itemId, int slotIndex) {
        this.slotIndex = slotIndex;
        super(name, price,classIds, itemId, quality);
    }

    public int getSlotIndex() {
        return slotIndex;
    }







}