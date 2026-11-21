import java.util.ArrayList;

public class ItemList {

    budgetCalculator b = new budgetCalculator(63.22);

    public void CreateTestItemBase(ItemBase testBase) {
        testBase.addHat("Scout Hat", 1.33, new int[]{0},"unique", "cute", 67);
        testBase.addHat("SoldierHat", 100, new int[]{1}, "unique","cool", 67);
        testBase.addHat("PyroHat", 100, new int[]{2}, "unique","both", 67);
        testBase.addHat("AllHat", 100, new int[]{0,1,2,3,4,5,6,7,8}, "unique","cool", 67);

        testBase.addWeapon("ScoutPrimary", 2, new int[]{0}, "unique",67,0 );
        testBase.addWeapon("ScoutPrimary2", 4, new int[]{0}, "strange",80,0 );
        testBase.addWeapon("ScoutPrimary3", 500, new int[]{0}, "unique",440,0 );
        testBase.addWeapon("ScoutStrangeSecondary", 4, new int[]{0}, "strange",67,1 );
        testBase.addWeapon("SoldierPrimary", 3, new int[]{1}, "unique",67,0 );
        testBase.addWeapon("ScoutMelee", 20, new int[]{0}, "unique",67,2 );
        testBase.addWeapon("AllMelee", 9, new int[]{0,1,2,3,4,5,6,7,8}, "unique",67,2 );

    }

    public void itemBaseOne(ItemBase base) {
        //Primary Weapons, scout
        base.addWeapon("Force-a-Nature", .11, new int[]{0}, "unique", 45, 0);
        base.addWeapon("Shortstop", .11, new int[]{0}, "unique", 220, 0);
        base.addWeapon("Soda Popper", .11, new int[]{0}, "unique",448 , 0);
        base.addWeapon("Baby Face's Blaster", .11, new int[]{0}, "unique",772 , 0);
        base.addWeapon("Back Scatter", .11, new int[]{0}, "unique",1103 , 0);
        base.addWeapon("Silver Botkiller Scattergun Mk.I", 8.55, new int[]{0}, "strange",799 , 0);
        base.addWeapon("Gold Botkiller Scattergun Mk.I",b.keysToRef(3) + 15 , new int[]{0}, "strange",808 , 0);
        base.addWeapon("Scattergun",b.keysToRef(41), new int[]{0}, "strange australium",200, 0);

        //Secondary scout weapons
        base.addWeapon("Bonk! Atomic Punch", .11, new int[]{0}, "unique", 46, 1);
        base.addWeapon("Crit-a-Cola", .11, new int[]{0}, "unique", 163, 1);
        base.addWeapon("Mad Milk", .11, new int[]{0}, "unique", 222, 1);
        base.addWeapon("Winger", .11, new int[]{0}, "unique", 449, 1);
        base.addWeapon("Pretty Boy's Pocket Pistol", .11, new int[]{0}, "unique", 773, 1);
        base.addWeapon("The Flying Guillotine", .11, new int[]{0}, "unique", 812, 1);
        base.addWeapon("Lugermorph", b.keysToRef(9) + 25, new int[]{0,5}, "vintage", 160, 1);
        base.addWeapon("C.A.P.P.E.R", b.keysToRef(12) + 40, new int[]{0,5}, "unique", 30666, 1);
        base.addWeapon("Pistol", 25.55, new int[]{0,5}, "strange", 209, 1);



    }








    public ArrayList<Item> load(int classId, String ItemType, int slotIndex, ItemBase base) {

        ArrayList<Item> list = new ArrayList<>();

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
