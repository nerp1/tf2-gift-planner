import java.util.ArrayList;

public class ItemList {

    public void CreateTestItemBase(ItemBase testbase) {
        testbase.addHat("ScoutHat", 50, new int[]{0},"unique", "cute", 67);
        testbase.addHat("SoldierHat", 100, new int[]{1}, "unique","cool", 67);
        testbase.addHat("PyroHat", 100, new int[]{2}, "unique","both", 67);
        testbase.addHat("AllHat", 100, new int[]{0,1,2,3,4,5,6,7,8}, "unique","cool", 67);

        testbase.addWeapon("ScoutPrimary", 2, new int[]{0}, "unique",67,0 );
        testbase.addWeapon("ScoutPrimary2", 4, new int[]{0}, "strange",80,0 );
        testbase.addWeapon("ScoutPrimary3", 50, new int[]{0}, "unique",440,0 );
        testbase.addWeapon("ScoutStrangeSecondary", 4, new int[]{0}, "strange",67,1 );
        testbase.addWeapon("SoldierPrimary", 3, new int[]{1}, "unique",67,0 );
        testbase.addWeapon("ScoutMelee", 20, new int[]{0}, "unique",67,2 );
        testbase.addWeapon("AllMelee", 9, new int[]{0,1,2,3,4,5,6,7,8}, "unique",67,2 );

    }









    public ArrayList<Item> load(int classId, String ItemType, int slotIndex, ItemBase base) {

        ArrayList<Item> list = new ArrayList<Item>();

        if (ItemType.equals("Weapon")) {

            for (Weapon e : base.getWeapons()) {
                if (e.containsClass(e.getClassIds(), classId)) {
                    if (e.getSlotIndex() == slotIndex) {
                        list.add(e);
                    }
                }
            }
        } else if (ItemType.equals("Hat")) {
            for (Hat g: base.getHats()) {
                if (g.containsClass(g.getClassIds(), classId)) {
                    list.add(g);
                }
            }
        }


        return list;
    }
}
