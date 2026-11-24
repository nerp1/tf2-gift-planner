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
        base.addWeapon("Force-a-Nature", b.keysToRef(1) + 1.44, new int[]{0}, "strange", 45, 0);
        base.addWeapon("Force-a-Nature", 11, new int[]{0}, "vintage", 45, 0);
        base.addWeapon("Force-a-Nature", b.keysToRef(15) + 65, new int[]{0}, "strange australium", 45, 0);

        base.addWeapon("Shortstop", .11, new int[]{0}, "unique", 220, 0);
        base.addWeapon("Shortstop", 33.44, new int[]{0}, "strange", 220, 0);

        base.addWeapon("Soda Popper", .11, new int[]{0}, "unique",448 , 0);
        base.addWeapon("Soda Popper", b.keysToRef(3) + 5, new int[]{0}, "strange",448 , 0);

        base.addWeapon("Baby Face's Blaster", .11, new int[]{0}, "unique",772 , 0);
        base.addWeapon("Baby Face's Blaster", 23.55, new int[]{0}, "strange",772 , 0);

        base.addWeapon("Back Scatter", .11, new int[]{0}, "unique",1103 , 0);
        base.addWeapon("Back Scatter", 3.11, new int[]{0}, "strange",1103 , 0);

        base.addWeapon("Silver Botkiller Scattergun Mk.I", 8.55, new int[]{0}, "strange",799 , 0);
        base.addWeapon("Gold Botkiller Scattergun Mk.I",b.keysToRef(3) + 15 , new int[]{0}, "strange",808 , 0);
        base.addWeapon("Rust Botkiller Scattergun Mk.I",10.77, new int[]{0}, "strange",888 , 0);
        base.addWeapon("Blood Botkiller Scattergun Mk.I",b.keysToRef(5) + 16, new int[]{0}, "strange",897 , 0);
        base.addWeapon("Carbonado Botkiller Scattergun Mk.I",3.55, new int[]{0}, "strange",906 , 0);
        base.addWeapon("Diamond Botkiller Scattergun Mk.I",14.22, new int[]{0}, "strange",915, 0);
        base.addWeapon("Silver Botkiller Scattergun Mk.II",3.88, new int[]{0}, "strange",964 , 0);
        base.addWeapon("Gold Botkiller Scattergun Mk.II",39, new int[]{0}, "strange",973 , 0);

        base.addWeapon("Festive Force-A-Nature", b.keysToRef(2) + 1, new int[]{0}, "unique", 1078, 0);
        base.addWeapon("Festive Force-A-Nature", b.keysToRef(11) , new int[]{0}, "strange", 1078, 0);

        base.addWeapon("Scattergun",38, new int[]{0}, "strange",200, 0);
        base.addWeapon("Scattergun",b.keysToRef(41), new int[]{0}, "strange australium",200, 0);

        //Secondary scout weapons
        base.addWeapon("Bonk! Atomic Punch", .11, new int[]{0}, "unique", 46, 1);
        base.addWeapon("Bonk! Atomic Punch", 15.66, new int[]{0}, "strange", 46, 1);
        base.addWeapon("Bonk! Atomic Punch", 5.33, new int[]{0}, "vintage", 46, 1);

        base.addWeapon("Crit-a-Cola", .11, new int[]{0}, "unique", 163, 1);
        base.addWeapon("Crit-a-Cola", 16.33, new int[]{0}, "strange", 163, 1);
        base.addWeapon("Crit-a-Cola", 18.11, new int[]{0}, "vintage", 163, 1);

        base.addWeapon("Mad Milk", .11, new int[]{0}, "unique", 222, 1);
        base.addWeapon("Mad Milk", b.keysToRef(2) + 13, new int[]{0}, "strange", 222, 1);

        base.addWeapon("Winger", .11, new int[]{0}, "unique", 449, 1);
        base.addWeapon("Winger", 3, new int[]{0}, "strange", 449, 1);

        base.addWeapon("Pretty Boy's Pocket Pistol", .11, new int[]{0}, "unique", 773, 1);
        base.addWeapon("Pretty Boy's Pocket Pistol", 9.55, new int[]{0}, "strange", 773, 1);

        base.addWeapon("The Flying Guillotine", .11, new int[]{0}, "unique", 812, 1);
        base.addWeapon("The Flying Guillotine", 36, new int[]{0}, "strange", 812, 1);
        base.addWeapon("The Flying Guillotine", 45, new int[]{0}, "genuine", 833, 1);

        base.addWeapon("Mutated Milk", b.keysToRef(5) + 13, new int[]{0}, "unique", 1121, 1);
        base.addWeapon("Mutated Milk", b.keysToRef(33), new int[]{0}, "strange", 1121, 1);

        base.addWeapon("Festive Bonk! Atomic Punch ", 35.55, new int[]{0}, "unique", 1145, 1);
        base.addWeapon("Festive Bonk! Atomic Punch ", b.keysToRef(5) + 12, new int[]{0}, "strange", 1145, 1);



        //Melee Scout Weapons
        base.addWeapon("Sandman", .11, new int[]{0},"unique", 44, 2);
        base.addWeapon("Sandman", 4, new int[]{0},"vintage", 44, 2);
        base.addWeapon("Sandman", 11.11, new int[]{0},"strange", 44, 2);

        base.addWeapon("Holy Mackerel", .11, new int[]{0},"unique", 221, 2);
        base.addWeapon("Holy Mackerel", b.keysToRef(18) + .11, new int[]{0},"strange", 221, 2);

        base.addWeapon("Candy Cane", .11, new int[]{0},"unique", 317, 2);
        base.addWeapon("Candy Cane", 3.11, new int[]{0},"strange", 317, 2);

        base.addWeapon("Boston Basher", .11, new int[]{0},"unique", 325, 2);
        base.addWeapon("Boston Basher", 22, new int[]{0},"strange", 325, 2);

        base.addWeapon("Sun-on-a-Stick", .11, new int[]{0},"unique", 349, 2);
        base.addWeapon("Sun-on-a-Stick", b.keysToRef(1) + 52.55, new int[]{0},"vintage", 349, 2);
        base.addWeapon("Sun-on-a-Stick", 28, new int[]{0},"genuine", 349, 2);


        base.addWeapon("Fan O'War", .11, new int[]{0},"unique", 355, 2);
        base.addWeapon("Fan O'War", b.keysToRef(1) + 54.55, new int[]{0},"genuine", 355, 2);
        base.addWeapon("Fan O'War", b.keysToRef(1) + 24, new int[]{0},"strange", 355, 2);

        base.addWeapon("Atomizer", .11, new int[]{0},"unique", 450, 2);
        base.addWeapon("Atomizer", b.keysToRef(1) + 9, new int[]{0},"strange", 450, 2);

        base.addWeapon("Wrap Assassin", .11, new int[]{0},"unique", 648, 2);
        base.addWeapon("Wrap Assassin", b.keysToRef(1) + 29.33, new int[]{0},"strange", 648, 2);

        base.addWeapon("Three-Rune Blade", 3.33, new int[]{0},"unique", 452, 2);
        base.addWeapon("Three-Rune Blade", b.keysToRef(6) + 21.11, new int[]{0},"genuine", 452, 2);

        base.addWeapon("Bat", b.keysToRef(42), new int[]{0},"strange", 660, 2);

        base.addWeapon("Festive Bat", b.keysToRef(42), new int[]{0},"strange", 660, 2);

        base.addWeapon("Bat", 5.77, new int[]{0},"strange", 190, 2);


        //Primary Soldier Weapons
        base.addWeapon("Direct Hit", .11, new int[]{1}, "unique", 127, 0);
        base.addWeapon("Direct Hit", b.keysToRef(1) + 50.22, new int[]{1}, "strange", 127, 0);
        base.addWeapon("Direct Hit", 9.88, new int[]{1}, "vintage", 127, 0);

        base.addWeapon("Black Box", .11, new int[]{1}, "unique", 228, 0);
        base.addWeapon("Black Box", b.keysToRef(1) + 5.66, new int[]{1}, "strange", 228, 0);
        base.addWeapon("Black Box", b.keysToRef(17), new int[]{1}, "strange australium", 228, 0);

        base.addWeapon("Liberty Launcher", .11, new int[]{1}, "unique", 414, 0);
        base.addWeapon("Liberty Launcher", 41.66, new int[]{1}, "strange", 414, 0);

        base.addWeapon("Cow Mangler 5000", .11, new int[]{1}, "unique", 441, 0);
        base.addWeapon("Cow Mangler 5000",4.33, new int[]{1}, "strange", 441, 0);

        base.addWeapon("Beggar's Bazooka", .11, new int[]{1}, "unique", 730, 0);
        base.addWeapon("Beggar's Bazooka", b.keysToRef(1) + 3, new int[]{1}, "strange", 730, 0);

        base.addWeapon("Air Strike", .11, new int[]{1}, "unique", 1104, 0);
        base.addWeapon("Air Strike", 30.22, new int[]{1}, "strange", 1104, 0);

        base.addWeapon("Silver Botkiller Rocket Launcher Mk.I", 8, new int[]{1}, "strange", 800, 0);
        base.addWeapon("Gold Botkiller Rocket Launcher Mk.I", b.keysToRef(4) + 45, new int[]{1}, "strange", 809, 0);
        base.addWeapon("Rust Botkiller Rocket Launcher Mk.I", 8.33, new int[]{1}, "strange", 889, 0);
        base.addWeapon("Blood Botkiller Rocket Launcher Mk.I", b.keysToRef(5), new int[]{1}, "strange", 898, 0);
        base.addWeapon("Carbonado Botkiller Rocket Launcher Mk.I", 3.33, new int[]{1}, "strange", 907, 0);
        base.addWeapon("Diamond Botkiller Rocket Launcher Mk.I", 9.66, new int[]{1}, "strange", 916, 0);
        base.addWeapon("Silver Botkiller Rocket Launcher Mk.II", 3.55, new int[]{1}, "strange", 965, 0);
        base.addWeapon("Gold Botkiller Rocket Launcher Mk.II", 30.88, new int[]{1}, "strange", 974, 0);

        base.addWeapon("Festive Black Box", b.keysToRef(1) + 1, new int[]{1}, "unique", 1085, 0);
        base.addWeapon("Festive Black Box", b.keysToRef(8) + 22, new int[]{1}, "strange", 1085, 0);

        base.addWeapon("Rocket Launcher", 61.55, new int[]{1}, "strange", 205, 0);
        base.addWeapon("Rocket Launcher", b.keysToRef(45), new int[]{1}, "strange australium", 205, 0);

        base.addWeapon("Festive Rocket Launcher", b.keysToRef(2), new int[]{1}, "unique", 658, 0);
        base.addWeapon("Festive Rocket Launcher", b.keysToRef(35), new int[]{1}, "strange", 658, 0);

        base.addWeapon("Original", .11, new int[]{1}, "unique", 513, 0);
        base.addWeapon("Original", b.keysToRef(9) + 10, new int[]{1}, "genuine", 513, 0);
        base.addWeapon("Original", b.keysToRef(191), new int[]{1}, "strange", 513, 0);

        //Secondary Soldier Weapons
        base.addWeapon("Buff Banner", .11, new int[]{1}, "unique", 129, 1);
        base.addWeapon("Buff Banner", 4, new int[]{1}, "vintage", 129, 1);
        base.addWeapon("Buff Banner", 15.33, new int[]{1}, "strange", 129, 1);

        base.addWeapon("Gunboats", .11, new int[]{1}, "unique", 133, 1);
        base.addWeapon("Gunboats", 48.22, new int[]{1}, "vintage", 133, 1);

        base.addWeapon("Battalion's Backup", .11, new int[]{1}, "unique", 226, 1);
        base.addWeapon("Battalion's Backup", b.keysToRef(1) + 3, new int[]{1}, "strange", 226, 1);

        base.addWeapon("Concheror", .11, new int[]{1}, "unique", 354, 1);
        base.addWeapon("Concheror", 16.88, new int[]{1}, "strange", 354, 1);
        base.addWeapon("Concheror", 46.55, new int[]{1}, "genuine", 354, 1);

        base.addWeapon("Righteous Bison", .11, new int[]{1}, "unique", 442, 1);
        base.addWeapon("Righteous Bison", 45, new int[]{1}, "strange", 442, 1);

        base.addWeapon("Mantreads", .11, new int[]{1}, "unique", 444, 1);
        base.addWeapon("Mantreads", b.keysToRef(9) + 5.66, new int[]{1}, "strange", 444, 1);

        base.addWeapon("Festive Buff Banner", 40.11, new int[]{1}, "unique", 1001, 1);
        base.addWeapon("Festive Buff Banner", b.keysToRef(13) + 35.22, new int[]{1}, "strange", 1001, 1);

        //Melee Soldier Weapons
        base.addWeapon("Equalizer", .11, new int[]{1}, "unique", 128, 2);
        base.addWeapon("Equalizer", 4.77, new int[]{1}, "strange", 128, 2);
        base.addWeapon("Equalizer", 3, new int[]{1}, "vintage", 128, 2);

        base.addWeapon("Market Gardener", .11, new int[]{1}, "unique", 416, 2);
        base.addWeapon("Market Gardener", b.keysToRef(1) + 30, new int[]{1}, "strange", 416, 2);


        base.addWeapon("Disciplinary Action", .11, new int[]{1}, "unique", 447, 2);
        base.addWeapon("Disciplinary Action", b.keysToRef(17) + 52.22, new int[]{1}, "strange", 447, 2);

        base.addWeapon("Escape Plan", .11, new int[]{1}, "unique", 775, 2);
        base.addWeapon("Escape Plan", 5.88, new int[]{1}, "vintage", 775, 2);
        base.addWeapon("Escape Plan", b.keysToRef(2) + 15.44, new int[]{1}, "strange", 775, 2);

        base.addWeapon("Shovel", 4, new int[]{1}, "strange", 196, 2);

        //Pyro Primary
        base.addWeapon("Backburner", .11, new int[]{2}, "unique",40, 0);
        base.addWeapon("Backburner", 3.88, new int[]{2}, "vintage",40, 0);
        base.addWeapon("Backburner", b.keysToRef(1) + 33.33, new int[]{2}, "strange",40, 0);

        base.addWeapon("Degreaser", .11, new int[]{2}, "unique",215, 0);
        base.addWeapon("Degreaser", 8.33, new int[]{2}, "strange",215, 0);

        base.addWeapon("Phlogistinator", .11, new int[]{2}, "unique",594, 0);
        base.addWeapon("Phlogistinator", 28.77, new int[]{2}, "strange",594, 0);

        base.addWeapon("Dragon's Fury", .11, new int[]{2}, "unique",1178, 0);

        base.addWeapon("Silver Botkiller Flame Thrower Mk.I", 6, new int[]{2}, "strange",798, 0);
        base.addWeapon("Gold Botkiller Flame Thrower Mk.I", b.keysToRef(1) + 16.88, new int[]{2}, "strange",807, 0);
        base.addWeapon("Blood Botkiller Flame Thrower Mk.I", b.keysToRef(2) + 14, new int[]{2}, "strange",896, 0);
        base.addWeapon("Rust Botkiller Flame Thrower Mk.I", 6.66, new int[]{2}, "strange",887, 0);
        base.addWeapon("Carbonado Botkiller Flame Thrower Mk.I", 2.88, new int[]{2}, "strange",905, 0);
        base.addWeapon("Diamond Botkiller Flame Thrower Mk.I", 4.44, new int[]{2}, "strange",914, 0);
        base.addWeapon("Silver Botkiller Flame Thrower Mk.II", 3, new int[]{2}, "strange",963, 0);
        base.addWeapon("Gold Botkiller Flame Thrower Mk.II", 19.88, new int[]{2}, "strange",972, 0);

        base.addWeapon("Flame Thrower", 16.55, new int[]{2}, "strange",208, 0);
        base.addWeapon("Flame Thrower", b.keysToRef(22) + 45, new int[]{2}, "strange australium",208, 0);

        base.addWeapon("Festive Flame Thrower", b.keysToRef(1) + 27.66, new int[]{2}, "unique",659, 0);
        base.addWeapon("Festive Flame Thrower", b.keysToRef(22), new int[]{2}, "strange",659, 0);

        base.addWeapon("Festive Backburner", 55.88, new int[]{2}, "unique",1146, 0);
        base.addWeapon("Festive Backburner", b.keysToRef(17) + 3.44, new int[]{2}, "strange",1146, 0);

        //Pyro Secondary
        base.addWeapon("Flare Gun", .11, new int[]{2}, "unique", 39, 1);
        base.addWeapon("Flare Gun", 3.44, new int[]{2}, "vintage", 39, 1);
        base.addWeapon("Flare Gun", b.keysToRef(3) + 15, new int[]{2}, "strange", 39, 1);

        base.addWeapon("Detonator", .11, new int[]{2}, "unique", 351, 1);
        base.addWeapon("Detonator", 34, new int[]{2}, "strange", 351, 1);

        base.addWeapon("Manmelter", .11, new int[]{2}, "unique", 595, 1);
        base.addWeapon("Manmelter", 9.33, new int[]{2}, "strange", 595, 1);

        base.addWeapon("Scorch Shot", .11, new int[]{2}, "unique", 740, 1);
        base.addWeapon("Scorch Shot", 35.55, new int[]{2}, "strange", 740, 1);

        base.addWeapon("Thermal Thruster", .11, new int[]{2}, "unique", 1179, 1);

        base.addWeapon("Gas Passer", .11, new int[]{2}, "unique", 1180, 1);

        base.addWeapon("Festive Flare Gun", b.keysToRef(2), new int[]{2}, "unique", 1081, 1);
        base.addWeapon("Festive Flare Gun", b.keysToRef(17) + 52.44, new int[]{2}, "strange", 1081, 1);

        //Pyro Melee
        base.addWeapon("Axtinguisher", .11, new int[]{2}, "unique", 38, 2);
        base.addWeapon("Axtinguisher", 32, new int[]{2}, "strange", 38, 2);
        base.addWeapon("Axtinguisher", 3.22, new int[]{2}, "vintage", 38, 2);
        base.addWeapon("Axtinguisher", b.keysToRef(7) + 45.55, new int[]{2}, "strange australium", 38, 2);

        base.addWeapon("Homewrecker", .11, new int[]{2}, "unique", 153, 2);
        base.addWeapon("Homewrecker", 3.55, new int[]{2}, "strange", 153, 2);
        base.addWeapon("Homewrecker", 4.11, new int[]{2}, "vintage", 153, 2);

        base.addWeapon("Powerjack", .11, new int[]{2}, "unique", 214, 2);
        base.addWeapon("Powerjack", 4, new int[]{2}, "strange", 214, 2);

        base.addWeapon("Back Scratcher", .11, new int[]{2}, "unique", 326, 2);
        base.addWeapon("Back Scratcher", 6.44, new int[]{2}, "strange", 326, 2);

        base.addWeapon("Third Degree", .11, new int[]{2}, "unique", 593, 2);
        base.addWeapon("Third Degree", 3.22, new int[]{2}, "strange", 593, 2);

        base.addWeapon("Neon Annihilator", .11, new int[]{2}, "unique", 813, 2);
        base.addWeapon("Neon Annihilator", 10.11, new int[]{2}, "strange", 813, 2);
        base.addWeapon("Neon Annihilator", 23, new int[]{2}, "genuine", 834, 2);

        base.addWeapon("Sharpened Volcano Fragment", .11, new int[]{2}, "unique", 348, 2);
        base.addWeapon("Sharpened Volcano Fragment", b.keysToRef(2), new int[]{2}, "vintage", 348, 2);
        base.addWeapon("Sharpened Volcano Fragment", 41.22, new int[]{2}, "genuine", 348, 2);

        base.addWeapon("Postal Pummeler", .11, new int[]{2}, "unique", 457, 2);

        base.addWeapon("Maul", 3.33, new int[]{2}, "unique", 466, 2);
        base.addWeapon("Maul", b.keysToRef(14) + 53.22, new int[]{2}, "genuine", 466, 2);

        base.addWeapon("Hot Hand", .11, new int[]{2}, "unique", 1181, 2);

        base.addWeapon("Festive Axtinguisher", 40.11, new int[]{2}, "unique", 1000, 2);
        base.addWeapon("Festive Axtinguisher", b.keysToRef(9) , new int[]{2}, "strange", 1000, 2);

        base.addWeapon("Fire Axe", 3.44, new int[]{2}, "strange", 192, 2);



        //Demoman Primary
        //base.addWeapon("", .11, new int[]{3}, "unique", , );
        base.addWeapon("Loch-n-Load", .11, new int[]{3}, "unique", 308, 0);
        base.addWeapon("Loch-n-Load", b.keysToRef(1) + 28, new int[]{3}, "strange", 308, 0);

        base.addWeapon("Ali Baba's Wee Booties", .11, new int[]{3}, "unique", 405, 0);

        base.addWeapon("Loose Cannon", .11, new int[]{3}, "unique", 996, 0);
        base.addWeapon("Loose Cannon", b.keysToRef(16) + 26.11, new int[]{3}, "unique", 996, 0);

        base.addWeapon("Iron Bomber", .11, new int[]{3}, "unique", 1151, 0);
        base.addWeapon("Iron Bomber", 17.55, new int[]{3}, "strange", 1151, 0);

        base.addWeapon("Grenade Launcher", 32.88, new int[]{3}, "strange", 206, 0);
        base.addWeapon("Grenade Launcher", b.keysToRef(18) + 46, new int[]{3}, "strange australium", 206, 0);

        base.addWeapon("Festive Grenade Launcher", 33.33, new int[]{3}, "unique", 1007, 0);
        base.addWeapon("Festive Grenade Launcher", b.keysToRef(9) + 6, new int[]{3}, "strange", 1007, 0);



        //Demoman Secondary
        base.addWeapon("Scottish Resistance", .11, new int[]{3}, "unique", 130, 1);
        base.addWeapon("Scottish Resistance", 5.44, new int[]{3}, "vintage", 130, 1);
        base.addWeapon("Scottish Resistance", b.keysToRef(1) + 46, new int[]{3}, "strange", 130, 1);

        base.addWeapon("Chargin' Targe", .11, new int[]{3}, "unique", 131, 1);
        base.addWeapon("Chargin' Targe", 45.88, new int[]{3}, "strange", 131, 1);
        base.addWeapon("Chargin' Targe", 9.44, new int[]{3}, "vintage", 131, 1);

        base.addWeapon("Festive Chargin' Targe", 34.77, new int[]{3}, "unique", 1144, 1);
        base.addWeapon("Festive Chargin' Targe", b.keysToRef(8), new int[]{3}, "strange", 1144, 1);

        base.addWeapon("Sticky Jumper", .11, new int[]{3}, "unique", 265, 1);

        base.addWeapon("Splendid Screen", .11, new int[]{3}, "unique", 406, 1);
        base.addWeapon("Splendid Screen", b.keysToRef(18) + 17.44, new int[]{3}, "strange", 406, 1);

        base.addWeapon("Tide Turner", .11, new int[]{3}, "unique", 1099, 1);

        base.addWeapon("Quickiebomb Launcher", .11, new int[]{3}, "unique", 1150, 1);
        base.addWeapon("Quickiebomb Launcher", 5.77, new int[]{3}, "strange", 1150, 1);

        base.addWeapon("Silver Botkiller Stickybomb Launcher Mk.I", 5, new int[]{3}, "strange", 797, 1);
        base.addWeapon("Gold Botkiller Stickybomb Launcher Mk.I", b.keysToRef(2) + 0.0, new int[]{3}, "strange", 806, 1);
        base.addWeapon("Rust Botkiller Stickybomb Launcher Mk.I", 5.11, new int[]{3}, "strange", 886, 1);
        base.addWeapon("Blood Botkiller Stickybomb Launcher Mk.I", b.keysToRef(2) + 7, new int[]{3}, "strange", 895, 1);
        base.addWeapon("Carbonado Botkiller Stickybomb Launcher Mk.I", 3.11, new int[]{3}, "strange", 904, 1);
        base.addWeapon("Diamond Botkiller Stickybomb Launcher Mk.I", 4.88, new int[]{3}, "strange", 913, 1);
        base.addWeapon("Silver Botkiller Stickybomb Launcher Mk.II", 3.11, new int[]{3}, "strange", 962, 1);
        base.addWeapon("Gold Botkiller Stickybomb Launcher Mk.II", 22.66, new int[]{3}, "strange", 971, 1);

        base.addWeapon("Stickybomb Launcher", 11, new int[]{3}, "strange", 207, 1);
        base.addWeapon("Stickybomb Launcher", b.keysToRef(22), new int[]{3}, "strange australium", 207, 1);

        base.addWeapon("Festive Stickybomb Launcher", b.keysToRef(1) + 48.33, new int[]{3}, "unique", 661, 1);
        base.addWeapon("Festive Stickybomb Launcher", b.keysToRef(52), new int[]{3}, "strange", 661, 1);





        //Demoman Melee
        base.addWeapon("Eyelander", .11, new int[]{3}, "unique", 132, 2);
        base.addWeapon("Eyelander", 14.88, new int[]{3}, "vintage", 132, 2);
        base.addWeapon("Eyelander", b.keysToRef(1) + 58.33, new int[]{3}, "strange", 132, 2);
        base.addWeapon("Eyelander", b.keysToRef(55) + 18.88, new int[]{3}, "strange australium", 132, 2);

        base.addWeapon("Scotsman's Skullcutter", .11, new int[]{3}, "unique", 172, 2);
        base.addWeapon("Scotsman's Skullcutter", 7.77, new int[]{3}, "strange", 172, 2);
        base.addWeapon("Scotsman's Skullcutter", 5.88, new int[]{3}, "vintage", 172, 2);

        base.addWeapon("Ullapool Caber", .11, new int[]{3}, "unique", 307, 2);
        base.addWeapon("Ullapool Caber", b.keysToRef(2) + 55.44, new int[]{3}, "vintage", 307, 2);
        base.addWeapon("Ullapool Caber", b.keysToRef(13) + 62.11, new int[]{3}, "strange", 307, 2);

        base.addWeapon("Claidheamh Mòr", .11, new int[]{3}, "unique", 327, 2);
        base.addWeapon("Claidheamh Mòr", 4.22, new int[]{3}, "strange", 327, 2);

        base.addWeapon("Persian Persuader", .11, new int[]{3}, "unique", 404, 2);
        base.addWeapon("Persian Persuader", 3.22, new int[]{3}, "strange", 404, 2);

        base.addWeapon("Nessie's Nine Iron", .11, new int[]{3}, "unique", 482, 2);
        base.addWeapon("Scottish Handshake", .11, new int[]{3}, "unique", 482, 2);

        base.addWeapon("Bottle", 58, new int[]{3}, "strange", 191, 2);



        //Heavy Primary
        base.addWeapon("Natascha", .11, new int[]{4}, "unique", 41, 0);
        base.addWeapon("Natascha", 3.22, new int[]{4}, "vintage", 41, 0);
        base.addWeapon("Natascha", 4.22, new int[]{4}, "strange", 41, 0);

        base.addWeapon("Brass Beast", .11, new int[]{4}, "unique", 312, 0);
        base.addWeapon("Brass Beast", 45.77, new int[]{4}, "vintage", 312, 0);
        base.addWeapon("Brass Beast", 45, new int[]{4}, "strange", 312, 0);

        base.addWeapon("Tomislav", .11, new int[]{4}, "unique", 424, 0);
        base.addWeapon("Tomislav", b.keysToRef(1) + 19.88, new int[]{4}, "strange", 424, 0);
        base.addWeapon("Tomislav", b.keysToRef(21) + 9.88, new int[]{4}, "strange australium", 424, 0);

        base.addWeapon("Huo-Long Heater", .11, new int[]{4}, "unique", 811, 0);
        base.addWeapon("Huo-Long Heater", 14.66, new int[]{4}, "strange", 811, 0);
        base.addWeapon("Huo-Long Heater", 34.66, new int[]{4}, "genuine", 832, 0);

        base.addWeapon("Silver Botkiller Minigun Mk.I", 6.44, new int[]{4}, "strange", 793, 0);
        base.addWeapon("Gold Botkiller Minigun Mk.I", b.keysToRef(2) + 7.0, new int[]{4}, "strange", 802, 0);
        base.addWeapon("Rust Botkiller Minigun Mk.I", 6.22, new int[]{4}, "strange",882 , 0);
        base.addWeapon("Blood Botkiller Minigun Mk.I", b.keysToRef(3) + 35.0, new int[]{4}, "strange",891, 0);
        base.addWeapon("Carbonado Botkiller Minigun Mk.I", 3.11, new int[]{4}, "strange",900 , 0);
        base.addWeapon("Diamond Botkiller Minigun Mk.I", 7.33, new int[]{4}, "strange",909, 0);
        base.addWeapon("Silver Botkiller Minigun Mk.II", 3.11, new int[]{4}, "strange",958, 0);
        base.addWeapon("Gold Botkiller Minigun Mk.II", 19.44, new int[]{4}, "strange",967 , 0);

        base.addWeapon("Minigun", b.keysToRef(2) + 34.33, new int[]{4}, "strange", 202, 0);
        base.addWeapon("Minigun", b.keysToRef(19) + 20.11, new int[]{4}, "strange australium", 202, 0);

        //Heavy Secondary
        base.addWeapon("Sandvich", .11, new int[]{4}, "unique", 42, 1);
        base.addWeapon("Sandvich", b.keysToRef(8), new int[]{4}, "strange", 42, 1);
        base.addWeapon("Sandvich", 6.77, new int[]{4}, "vintage", 42, 1);

        base.addWeapon("Dalokohs Bar", .11, new int[]{4}, "unique", 159, 1);
        base.addWeapon("Dalokohs Bar", 3, new int[]{4}, "strange", 159, 1);
        base.addWeapon("Dalokohs Bar", 3.44, new int[]{4}, "vintage", 159, 1);

        base.addWeapon("Buffalo Steak Sandvich", .11, new int[]{4}, "unique", 311, 1);
        base.addWeapon("Buffalo Steak Sandvich", b.keysToRef(1) + 30 , new int[]{4}, "vintage", 311, 1);

        base.addWeapon("Family Business", .11, new int[]{4}, "unique", 425, 1);
        base.addWeapon("Family Business", b.keysToRef(1) + 22.77, new int[]{4}, "strange", 425, 1);

        base.addWeapon("Second Banana", .11, new int[]{4}, "unique", 1190, 1);

        base.addWeapon("Fishcake", 34, new int[]{4}, "unique", 433, 1);

        base.addWeapon("Festive Sandvich", b.keysToRef(2) + 35, new int[]{4}, "unique", 1002, 1);
        base.addWeapon("Festive Sandvich", b.keysToRef(27), new int[]{4}, "strange", 1002, 1);

        //Heavy Melee
        base.addWeapon("Killing Gloves of Boxing", .11, new int[]{4}, "unique", 43, 2);
        base.addWeapon("Killing Gloves of Boxing",3.66 , new int[]{4}, "vintage", 43, 2);
        base.addWeapon("Killing Gloves of Boxing", 24.66, new int[]{4}, "strange", 43, 2);

        base.addWeapon("Gloves of Running Urgently", .11, new int[]{4}, "unique", 239, 2);
        base.addWeapon("Gloves of Running Urgently", 62.66, new int[]{4}, "strange", 239, 2);

        base.addWeapon("Warrior's Spirit", .11, new int[]{4}, "unique", 310, 2);
        base.addWeapon("Warrior's Spirit", 3, new int[]{4}, "strange", 310, 2);
        base.addWeapon("Warrior's Spirit", 24.33, new int[]{4}, "vintage", 310, 2);

        base.addWeapon("Fists of Steel", .11, new int[]{4}, "unique", 331, 2);
        base.addWeapon("Fists of Steel", 7.44, new int[]{4}, "strange", 331, 2);

        base.addWeapon("Eviction Notice", .11, new int[]{4}, "unique", 426, 2);
        base.addWeapon("Eviction Notice", 3.22, new int[]{4}, "strange", 426, 2);

        base.addWeapon("Apoco-Fists", .11, new int[]{4}, "unique", 587, 2);
        base.addWeapon("Apoco-Fists", 3, new int[]{4}, "strange", 587, 2);
        base.addWeapon("Apoco-Fists", 53, new int[]{4}, "genuine", 587, 2);

        base.addWeapon("Holiday Punch", .11, new int[]{4}, "unique", 656, 2);
        base.addWeapon("Holiday Punch", b.keysToRef(11) + 20, new int[]{4}, "strange", 656, 2);

        base.addWeapon("Bread Bite", b.keysToRef(5), new int[]{4}, "unique", 1100, 2);
        base.addWeapon("Bread Bite", b.keysToRef(21) + 7.55, new int[]{4}, "strange", 1100, 2);

        base.addWeapon("Festive Gloves of Running Urgently", b.keysToRef(1) + 32.88, new int[]{4}, "unique", 1084, 2);
        base.addWeapon("Festive Gloves of Running Urgently", b.keysToRef(7) + 3.66, new int[]{4}, "strange", 1084, 2);

        base.addWeapon("Fists", 28.33, new int[]{4}, "strange", 195, 2);

        //Engi Primary
        base.addWeapon("Frontier Justice", .11, new int[]{5}, "unique", 141, 0);
        base.addWeapon("Frontier Justice", 7.77, new int[]{5}, "vintage", 141, 0);
        base.addWeapon("Frontier Justice", b.keysToRef(2) + 0.0, new int[]{5}, "strange", 141, 0);
        base.addWeapon("Frontier Justice", b.keysToRef(16) + 40.0, new int[]{5}, "strange australium", 141, 0);

        base.addWeapon("Widowmaker", .11, new int[]{5}, "unique", 527, 0);
        base.addWeapon("Widowmaker", b.keysToRef(1) + 16.44, new int[]{5}, "genuine", 527, 0);
        base.addWeapon("Widowmaker", b.keysToRef(17) + 21, new int[]{5}, "strange", 527, 0);

        base.addWeapon("Pomson 6000", .11, new int[]{5}, "unique", 588, 0);
        base.addWeapon("Pomson 6000", b.keysToRef(10) + 7.66, new int[]{5}, "strange", 588, 0);

        base.addWeapon("Rescue Ranger", .11, new int[]{5}, "unique", 997, 0);
        base.addWeapon("Rescue Ranger", 14.22, new int[]{5}, "strange", 997, 0);

        base.addWeapon("Festive Frontier Justice", b.keysToRef(1) + 8.55, new int[]{5}, "unique", 1004, 0);
        base.addWeapon("Festive Frontier Justice", b.keysToRef(10) + 45.88, new int[]{5}, "strange", 1004, 0);

        //Engi Secondary
        base.addWeapon("Wrangler", .11, new int[]{5}, "unique", 140, 1);
        base.addWeapon("Wrangler", 12.44, new int[]{5}, "vintage", 140, 1);
        base.addWeapon("Wrangler", 17.22, new int[]{5}, "strange", 140, 1);

        base.addWeapon("Short Circuit", .11, new int[]{5}, "unique", 528, 1);
        base.addWeapon("Short Circuit", 48.11, new int[]{5}, "genuine", 528, 1);

        base.addWeapon("Festive Wrangler", b.keysToRef(2), new int[]{5}, "unique", 1086, 1);
        base.addWeapon("Festive Wrangler", b.keysToRef(8) + 12.44, new int[]{5}, "strange", 1086, 1);

        base.addWeapon("Giger Counter", b.keysToRef(18), new int[]{5}, "unique", 30668, 1);
        base.addWeapon("Giger Counter", b.keysToRef(87) + 19.55, new int[]{5}, "strange", 30668, 1);

        //Engi Melee
        base.addWeapon("Gunslinger", .11, new int[]{5}, "unique", 142, 2);
        base.addWeapon("Gunslinger", 35.22, new int[]{5}, "vintage", 142, 2);
        base.addWeapon("Gunslinger", b.keysToRef(198), new int[]{5}, "strange", 142, 2);

        base.addWeapon("Southern Hospitality", .11, new int[]{5}, "unique", 155, 2);
        base.addWeapon("Southern Hospitality", 4.11, new int[]{5}, "vintage", 155, 2);
        base.addWeapon("Southern Hospitality", 21.55, new int[]{5}, "strange", 155, 2);

        base.addWeapon("Jag", .11, new int[]{5}, "unique", 329, 2);
        base.addWeapon("Jag", b.keysToRef(2) + 1, new int[]{5}, "strange", 329, 2);

        base.addWeapon("Eureka Effect", .11, new int[]{5}, "unique", 589, 2);

        base.addWeapon("Silver Botkiller Wrench Mk.I", 10.11, new int[]{5}, "strange", 795, 2);
        base.addWeapon("Gold Botkiller Wrench Mk.I", b.keysToRef(6), new int[]{5}, "strange", 804, 2);
        base.addWeapon("Rust Botkiller Wrench Mk.I", 9.55, new int[]{5}, "strange",884 , 2);
        base.addWeapon("Blood Botkiller Wrench Mk.I", b.keysToRef(3) + 14.33, new int[]{5}, "strange",893 , 2);
        base.addWeapon("Carbonado Botkiller Wrench Mk.I", 3.22, new int[]{5}, "strange",902 , 2);
        base.addWeapon("Diamond Botkiller Wrench Mk.I", 9.22, new int[]{5}, "strange",911 , 2);
        base.addWeapon("Silver Botkiller Wrench Mk.II", 3.66, new int[]{5}, "strange",960 , 2);
        base.addWeapon("Gold Botkiller Wrench Mk.II", b.keysToRef(1) + 8.11, new int[]{5}, "strange",969 , 2);

        base.addWeapon("Wrench", 62.44, new int[]{5}, "strange", 197, 2);
        base.addWeapon("Wrench", b.keysToRef(26) + 21.11, new int[]{5}, "strange australium", 197, 2);

        base.addWeapon("Festive Wrench", b.keysToRef(1) + 45.11, new int[]{5}, "strange", 662, 2);
        base.addWeapon("Festive Wrench", b.keysToRef(29) + 9.55, new int[]{5}, "strange", 662, 2);

        //Engi Special
        base.addWeapon("Construction PDA", b.keysToRef(105), new int[]{5}, "strange", 737, 100);

        //Medic Primary
        base.addWeapon("Blutsauger", .11, new int[]{6}, "unique", 36, 0);
        base.addWeapon("Blutsauger",3.33, new int[]{6}, "vintage", 36, 0);
        base.addWeapon("Blutsauger", 11.11, new int[]{6}, "strange", 36, 0);
        base.addWeapon("Blutsauger", b.keysToRef(6) + 2.55, new int[]{6}, "strange australium", 36, 0);

        base.addWeapon("Crusader's Crossbow", .11, new int[]{6}, "unique", 305, 0);
        base.addWeapon("Crusader's Crossbow", b.keysToRef(1) + 1.88, new int[]{6}, "vintage", 305, 0);
        base.addWeapon("Crusader's Crossbow", b.keysToRef(2) + 5.88, new int[]{6}, "strange", 305, 0);

        base.addWeapon("Overdose", .11, new int[]{6}, "unique", 412, 0);
        base.addWeapon("Overdose", 12.33, new int[]{6}, "strange", 412, 0);

        base.addWeapon("Festive Crusader's Crossbow", b.keysToRef(3) + 15, new int[]{6}, "unique", 1079, 0);
        base.addWeapon("Festive Crusader's Crossbow", b.keysToRef(36) + 15, new int[]{6}, "strange", 1079, 0);

        base.addWeapon("Syringe Gun", 5.77, new int[]{6}, "strange", 204, 0);

        //Medic Secondary
        base.addWeapon("Kritzkrieg", .11, new int[]{6}, "unique", 35, 1);
        base.addWeapon("Kritzkrieg", 9.77, new int[]{6}, "vintage", 35, 1);
        base.addWeapon("Kritzkrieg", b.keysToRef(81) + 3.11, new int[]{6}, "strange", 35, 1);

        base.addWeapon("Quick-Fix", .11, new int[]{6}, "unique", 411, 1);
        base.addWeapon("Quick-Fix", b.keysToRef(3) + 55.22, new int[]{6}, "strange", 411, 1);

        base.addWeapon("Vaccinator", .11, new int[]{6}, "unique", 998, 1);
        base.addWeapon("Vaccinator", b.keysToRef(1) + 11.88, new int[]{6}, "strange", 998, 1);

        base.addWeapon("Silver Botkiller Medi Gun Mk.I", 7, new int[]{6}, "strange", 796, 1);
        base.addWeapon("Gold Botkiller Medi Gun Mk.I", b.keysToRef(2) + 45, new int[]{6}, "strange", 805, 1);
        base.addWeapon("Rust Botkiller Medi Gun Mk.I", 6.7, new int[]{6}, "strange",885 , 1);
        base.addWeapon("Blood Botkiller Medi Gun Mk.I", b.keysToRef(3) + 3.55, new int[]{6}, "strange",894 , 1);
        base.addWeapon("Carbonado Botkiller Medi Gun Mk.I", 3.22, new int[]{6}, "strange",903 , 1);
        base.addWeapon("Diamond Botkiller Medi Gun Mk.I", 8, new int[]{6}, "strange",912 , 1);
        base.addWeapon("Silver Botkiller Medi Gun Mk.II", 3.11, new int[]{6}, "strange",961 , 1);
        base.addWeapon("Gold Botkiller Medi Gun Mk.II", 27.77, new int[]{6}, "strange",970 , 1);

        base.addWeapon("Medi Gun", 34.55, new int[]{6}, "strange", 211, 1);
        base.addWeapon("Medi Gun", b.keysToRef(40), new int[]{6}, "strange australium", 211, 1);

        //Medic Melee
        base.addWeapon("Ubersaw", .11, new int[]{6}, "unique", 37, 2);
        base.addWeapon("Ubersaw", 3.88, new int[]{6}, "vintage", 37, 2);
        base.addWeapon("Ubersaw",  b.keysToRef(1) + 19.55, new int[]{6}, "strange", 37, 2);

        base.addWeapon("Vita-Saw", .11, new int[]{6}, "unique", 173, 2);

        base.addWeapon("Amputator", .11, new int[]{6}, "unique", 304, 2);
        base.addWeapon("Amputator", 33.55, new int[]{6}, "vintage", 304, 2);
        base.addWeapon("Amputator",37.11 , new int[]{6}, "strange", 304, 2);

        base.addWeapon("Solemn Vow", .11, new int[]{6}, "unique", 413, 2);
        base.addWeapon("Solemn Vow", 18.22, new int[]{6}, "strange", 413, 2);

        base.addWeapon("Festive Ubersaw", 56, new int[]{6}, "unique", 1003, 2);
        base.addWeapon("Festive Ubersaw", b.keysToRef(20) + 33.44, new int[]{6}, "strange", 1003, 2);

        base.addWeapon("Festive Bonesaw", 11.33, new int[]{6}, "unique", 1143, 2);
        base.addWeapon("Festive Bonesaw", b.keysToRef(1) + 57.11, new int[]{6}, "strange", 1143, 2);

        base.addWeapon("Bonesaw", 4.44, new int[]{6}, "strange", 198, 2);


        //Sniper Primary
        base.addWeapon("Huntsman", .11,  new int[]{7}, "unique", 56, 0);
        base.addWeapon("Huntsman", 7.33,  new int[]{7}, "vintage", 56, 0);
        base.addWeapon("Huntsman", b.keysToRef(49),  new int[]{7}, "strange", 56, 0);

        base.addWeapon("Sydney Sleeper", .11,  new int[]{7}, "unique", 230, 0);
        base.addWeapon("Sydney Sleeper", 15.66,  new int[]{7}, "strange", 230, 0);

        base.addWeapon("Bazaar Bargain", .11,  new int[]{7}, "unique", 402, 0);
        base.addWeapon("Bazaar Bargain", b.keysToRef(1) + 22.33,  new int[]{7}, "strange", 402, 0);

        base.addWeapon("Machina", .11,  new int[]{7}, "unique", 526, 0);
        base.addWeapon("Machina", b.keysToRef(80),  new int[]{7}, "strange", 526, 0);
        base.addWeapon("Machina", b.keysToRef(1),  new int[]{7}, "genuine", 526, 0);

        base.addWeapon("Festive Sniper Rifle", b.keysToRef(2),  new int[]{7}, "unique", 664, 0);
        base.addWeapon("Festive Sniper Rifle", b.keysToRef(41),  new int[]{7}, "strange", 664, 0);

        base.addWeapon("Hitman's Heatmaker", .11,  new int[]{7}, "unique", 752, 0);
        base.addWeapon("Hitman's Heatmaker", b.keysToRef(1) + 16,  new int[]{7}, "strange", 752, 0);

        base.addWeapon("AWPer Hand", 4,  new int[]{7}, "unique", 851, 0);
        base.addWeapon("AWPer Hand", b.keysToRef(1) + 15.33,  new int[]{7}, "genuine", 851, 0);
        base.addWeapon("AWPer Hand", b.keysToRef(37),  new int[]{7}, "strange", 851, 0);

        base.addWeapon("Festive Huntsman", b.keysToRef(2) + 53,  new int[]{7}, "unique", 1005, 0);
        base.addWeapon("Festive Huntsman", b.keysToRef(72),  new int[]{7}, "strange", 1005, 0);

        base.addWeapon("Fortified Compound", .11,  new int[]{7}, "unique", 1092, 0);
        base.addWeapon("Fortified Compound", b.keysToRef(2) + 2,  new int[]{7}, "genuine", 1092, 0);

        base.addWeapon("Classic", .11,  new int[]{7}, "unique", 1098, 0);
        base.addWeapon("Classic", 35.33,  new int[]{7}, "strange", 1098, 0);

        base.addWeapon("Silver Botkiller Sniper Rifle Mk.I", 6,  new int[]{7}, "strange", 792, 0);
        base.addWeapon("Gold Botkiller Sniper Rifle Mk.I", b.keysToRef(2) + 21.22,  new int[]{7}, "strange", 801, 0);
        base.addWeapon("Rust Botkiller Sniper Rifle Mk.I", 7.77,  new int[]{7}, "strange", 881, 0);
        base.addWeapon("Blood Botkiller Sniper Rifle Mk.I", b.keysToRef(5) + 61,  new int[]{7}, "strange", 890, 0);
        base.addWeapon("Carbonado Botkiller Sniper Rifle Mk.I", 3.33,  new int[]{7}, "strange", 899, 0);
        base.addWeapon("Diamond Botkiller Sniper Rifle Mk.I", 8.88,  new int[]{7}, "strange", 908, 0);
        base.addWeapon("Silver Botkiller Sniper Rifle Mk.II", 3.11,  new int[]{7}, "strange", 957, 0);
        base.addWeapon("Gold Botkiller Sniper Rifle Mk.II", 29.44,  new int[]{7}, "strange", 966, 0);

        base.addWeapon("Sniper Rifle", 36.66,  new int[]{7}, "strange", 201, 0);
        base.addWeapon("Sniper Rifle", b.keysToRef(29) + 8.88,  new int[]{7}, "strange australium", 201, 0);

        //Sniper Secondary
        base.addWeapon("Razorback", .11,  new int[]{7}, "unique", 57, 1);
        base.addWeapon("Razorback", 4.11,  new int[]{7}, "vintage", 57, 1);
        base.addWeapon("Razorback", 16.11,  new int[]{7}, "strange", 57, 1);

        base.addWeapon("Jarate", .11,  new int[]{7}, "unique", 58, 1);
        base.addWeapon("Jarate", 14.11,  new int[]{7}, "strange", 58, 1);
        base.addWeapon("Jarate", 10.11,  new int[]{7}, "unique", 58, 1);

        base.addWeapon("Darwin's Danger Shield", .11,  new int[]{7}, "unique", 231, 1);

        base.addWeapon("Cozy Camper", .11,  new int[]{7}, "unique", 642, 1);

        base.addWeapon("Cleaner's Carbine", .11,  new int[]{7}, "unique", 751, 1);
        base.addWeapon("Cleaner's Carbine", 4.44,  new int[]{7}, "strange", 751, 1);

        base.addWeapon("Festive Jarate", b.keysToRef(1) + 32,  new int[]{7}, "unique", 1083, 1);
        base.addWeapon("Festive Jarate", b.keysToRef(10),  new int[]{7}, "strange", 1083, 1);

        base.addWeapon("Self-Aware Beauty Mark", b.keysToRef(2) + 62,  new int[]{7}, "unique", 1105, 1);
        base.addWeapon("Self-Aware Beauty Mark", b.keysToRef(22),  new int[]{7}, "strange", 1105, 1);

        base.addWeapon("Festive SMG", 15,  new int[]{7}, "unique", 1149, 1);
        base.addWeapon("Festive SMG", b.keysToRef(3) + 6.11,  new int[]{7}, "strange", 1149, 1);

        base.addWeapon("SMG", b.keysToRef(3) + 6.11,  new int[]{7}, "strange", 203, 1);
        base.addWeapon("SMG", b.keysToRef(9) + 15.22,  new int[]{7}, "strange australium", 203, 1);

        //Sniper Melee
        base.addWeapon("Tribalman's Shiv", .11,  new int[]{7}, "unique", 171, 2);
        base.addWeapon("Tribalman's Shiv", 3.33,  new int[]{7}, "vintage", 171, 2);
        base.addWeapon("Tribalman's Shiv", 6.66,  new int[]{7}, "strange", 171, 2);

        base.addWeapon("Bushwacka", .11,  new int[]{7}, "unique", 232, 2);
        base.addWeapon("Bushwacka", 44.44,  new int[]{7}, "strange", 232, 2);

        base.addWeapon("Shahanshah", .11,  new int[]{7}, "unique", 401, 2);
        base.addWeapon("Shahanshah", 3.33,  new int[]{7}, "strange", 401, 2);

        base.addWeapon("Kukri", 14.33, new int[]{7}, "strange", 193, 2);


        //Spy Slot 0 (gun)
        base.addWeapon("Ambassador", .11,  new int[]{8}, "unique", 61, 0);
        base.addWeapon("Ambassador", 3.66,  new int[]{8}, "vintage", 61, 0);
        base.addWeapon("Ambassador", 5.22,  new int[]{8}, "strange", 61, 0);
        base.addWeapon("Ambassador", b.keysToRef(11) + 60,  new int[]{8}, "strange australium", 61, 0);

        base.addWeapon("Big Kill", b.keysToRef(13),  new int[]{8}, "unique", 161, 0);


        base.addWeapon("L'Etranger", .11,  new int[]{8}, "unique", 224, 0);
        base.addWeapon("L'Etranger", b.keysToRef(2) + 31,  new int[]{8}, "strange", 224, 0);

        base.addWeapon("Enforcer", .11,  new int[]{8}, "unique", 460, 0);
        base.addWeapon("Enforcer", 10.88,  new int[]{8}, "strange", 460, 0);

        base.addWeapon("Diamondback", .11,  new int[]{8}, "unique", 525, 0);
        base.addWeapon("Diamondback", 26.33,  new int[]{8}, "genuine", 525, 0);
        base.addWeapon("Diamondback", 41.88,  new int[]{8}, "strange", 525, 0);

        base.addWeapon("Festive Ambassador", b.keysToRef(2) + 32,  new int[]{8}, "unique", 1006, 0);
        base.addWeapon("Festive Ambassador", b.keysToRef(29) + 24.11,  new int[]{8}, "strange", 1006, 0);

        base.addWeapon("Festive Revolver", 41,  new int[]{8}, "unique", 1142, 0);
        base.addWeapon("Festive Revolver", b.keysToRef(9) + 43.77,  new int[]{8}, "strange", 1142, 0);

        base.addWeapon("Revolver", 7.66,  new int[]{8}, "strange", 210, 0);

        //Spy Slot 1 (sapper)
        base.addWeapon("Red-Tape Recorder", .11,  new int[]{8}, "unique", 810, 1);
        base.addWeapon("Red-Tape Recorder", 3,  new int[]{8}, "strange", 810, 1);
        base.addWeapon("Red-Tape Recorder", 25,  new int[]{8}, "genuine", 831, 1);

        base.addWeapon("Ap-Sap ", b.keysToRef(15),  new int[]{8}, "genuine", 933, 1);
        base.addWeapon("Ap-Sap ", b.keysToRef(3),  new int[]{8}, "unique", 933, 1);


        base.addWeapon("Festive Sapper", b.keysToRef(1) + 58,  new int[]{8}, "unique", 1080, 1);
        base.addWeapon("Festive Sapper", b.keysToRef(10) + 42,  new int[]{8}, "strange", 1080, 1);

        base.addWeapon("Snack Attack", b.keysToRef(4) + 40,  new int[]{8}, "unique", 1102, 1);
        base.addWeapon("Snack Attack", b.keysToRef(34),  new int[]{8}, "strange", 1102, 1);

        base.addWeapon("Snapper", b.keysToRef(8) + 22.44,  new int[]{8}, "strange", 736, 1);

        //Spy Slot 2 (knife)
        base.addWeapon("Your Eternal Reward", .11,  new int[]{8}, "unique", 225, 2);
        base.addWeapon("Your Eternal Reward", b.keysToRef(5) + 47.11,  new int[]{8}, "strange", 225, 2);

        base.addWeapon("Conniver's Kunai", .11,  new int[]{8}, "unique", 356, 2);
        base.addWeapon("Conniver's Kunai", b.keysToRef(5) + 58,  new int[]{8}, "vintage", 356, 2);
        base.addWeapon("Conniver's Kunai", b.keysToRef(2) + 2.22,  new int[]{8}, "genuine", 356, 2);
        base.addWeapon("Conniver's Kunai", b.keysToRef(6) + 34.55,  new int[]{8}, "strange", 356, 2);

        base.addWeapon("Big Earner", .11,  new int[]{8}, "unique", 461, 2);
        base.addWeapon("Big Earner", b.keysToRef(2) + 10.88,  new int[]{8}, "strange", 461, 2);

        base.addWeapon("Wanga Prick", .33,  new int[]{8}, "unique", 574, 2);

        base.addWeapon("Sharp Dresser", 3,  new int[]{8}, "unique", 638, 2);
        base.addWeapon("Sharp Dresser", b.keysToRef(9) + 48.44,  new int[]{8}, "genuine", 638, 2);

        base.addWeapon("Spy-cicle", .11,  new int[]{8}, "unique", 649, 2);
        base.addWeapon("Spy-cicle", 53,  new int[]{8}, "strange", 649, 2);

        base.addWeapon("Festive Knife", b.keysToRef(1) + 30,  new int[]{8}, "unique", 665, 2);
        base.addWeapon("Festive Knife", b.keysToRef(14) + 54,  new int[]{8}, "strange", 665, 2);

        base.addWeapon("Knife", 26,  new int[]{8}, "strange", 194, 2);

        //Spy Slot 4 (watch)
        base.addWeapon("Dead Ringer", .11,  new int[]{8}, "unique", 59, 100);
        base.addWeapon("Dead Ringer", 15.66,  new int[]{8}, "vintage", 59, 100);
        base.addWeapon("Dead Ringer", b.keysToRef(1) + 54.44,  new int[]{8}, "strange", 59, 100);

        base.addWeapon("Cloak and Dagger", .11,  new int[]{8}, "unique", 60, 100);
        base.addWeapon("Cloak and Dagger", 6.22,  new int[]{8}, "vintage", 60, 100);
        base.addWeapon("Cloak and Dagger", 17.22,  new int[]{8}, "strange", 60, 100);

        base.addWeapon("Invis Watch", b.keysToRef(22) + 36,  new int[]{8}, "strange", 212, 100);






        //Multiclass Weapons
        base.addWeapon("Lugermorph", b.keysToRef(9) + 25, new int[]{0,5}, "vintage", 160, 1);
        base.addWeapon("C.A.P.P.E.R", b.keysToRef(12) + 40, new int[]{0,5}, "unique", 30666, 1);
        base.addWeapon("Pistol", 25.55, new int[]{0,5}, "strange", 209, 1);
        base.addWeapon("Shotgun", b.keysToRef(1) + 55.77, new int[]{1,2,4,5}, "strange", 199, 1);
        base.addWeapon("Festive Shotgun", 37.22, new int[]{1,2,4,5}, "unique", 1141, 1);
        base.addWeapon("Festive Shotgun", b.keysToRef(10) + 35.66, new int[]{1,2,4,5}, "strange", 1141, 1);
        base.addWeapon("Reserve Shooter", 3.22, new int[]{1,2}, "strange", 415, 1);
        base.addWeapon("Reserve Shooter", .11, new int[]{1,2}, "unique", 415, 1);
        base.addWeapon("Panic Attack", 9.55, new int[]{1,2,4,5}, "strange", 1153, 1);
        base.addWeapon("Panic Attack", .11, new int[]{1,2,4,5}, "unique", 1153, 1);
        base.addWeapon("Panic Attack", 9.55, new int[]{5}, "strange", 1153, 0);
        base.addWeapon("Panic Attack", .11, new int[]{5}, "unique", 1153, 0);
        base.addWeapon("Festive Shotgun", 37.22, new int[]{5}, "unique", 1141, 0);
        base.addWeapon("Festive Shotgun", b.keysToRef(10) + 35.66, new int[]{5}, "strange", 1141, 0);
        base.addWeapon("Frying Pan", 2.77, new int[]{0,1,2,3,4,7}, "unique", 1141, 2);
        base.addWeapon("Frying Pan", b.keysToRef(70), new int[]{0,1,2,3,4,7}, "unique", 1141, 2);
        base.addWeapon("Conscientious Objector", 3.44, new int[]{0,1,2,3,4,7}, "unique", 474, 2);
        base.addWeapon("Freedom Staff", 3.44, new int[]{0,1,2,3,4,7}, "unique", 474, 2);
        base.addWeapon("Freedom Staff", 49.44, new int[]{0,1,2,3,4,7}, "unique", 474, 2);

    }








    public ArrayList<Item> load(int classId, String ItemType, int slotIndex, ItemBase base) {

        ArrayList<Item> list = new ArrayList<>();

        if (ItemType.equals("Weapon")) {
            for (Weapon e : base.getWeapons()) {
                if (e.containsClass(classId)) {
                    if (e.getSlotIndex() == slotIndex) {
                        list.add(e);
                    }
                }
            }
        } else if (ItemType.equals("Hat")) {
            for (Hat g: base.getHats()) {
                if (g.containsClass(classId)) {
                    list.add(g);
                }
            }
        }


        return list;
    }
}
