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

    public void createFullItemBase(ItemBase base) {
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

        base.addWeapon("Festive Shotgun", 37.22, new int[]{1,2,4}, "unique", 1141, 1);
        base.addWeapon("Festive Shotgun", b.keysToRef(10) + 35.66, new int[]{1,2,4}, "strange", 1141, 1);
        base.addWeapon("Festive Shotgun", 37.22, new int[]{5}, "unique", 1141, 0);
        base.addWeapon("Festive Shotgun", b.keysToRef(10) + 35.66, new int[]{5}, "strange", 1141, 0);

        base.addWeapon("Reserve Shooter", 3.22, new int[]{1,2}, "strange", 415, 1);
        base.addWeapon("Reserve Shooter", .11, new int[]{1,2}, "unique", 415, 1);

        base.addWeapon("Panic Attack", 9.55, new int[]{1,2,4}, "strange", 1153, 1);
        base.addWeapon("Panic Attack", .11, new int[]{1,2,4}, "unique", 1153, 1);
        base.addWeapon("Panic Attack", 9.55, new int[]{5}, "strange", 1153, 0);
        base.addWeapon("Panic Attack", .11, new int[]{5}, "unique", 1153, 0);



        base.addWeapon("Frying Pan", 2.77, new int[]{0,1,2,3,4,7}, "unique", 1141, 2);
        base.addWeapon("Frying Pan", b.keysToRef(70), new int[]{0,1,2,3,4,7}, "strange", 1141, 2);
        base.addWeapon("Conscientious Objector", 3.44, new int[]{0,1,2,3,4,7}, "unique", 474, 2);
        base.addWeapon("Freedom Staff", 3.44, new int[]{0,1,2,3,4,7}, "unique", 474, 2);
        base.addWeapon("Freedom Staff", 49.44, new int[]{0,1,2,3,4,7}, "unique", 474, 2);


        //HATS
        base.addHat("Batter's Helmet", 1.66, new int[]{0}, "unique", "cool", 52);
        base.addHat("Bonk Helm", 1.66, new int[]{0}, "unique", "cool", 106);
        base.addHat("Ye Olde Baker Boy", 1.66, new int[]{0}, "unique", "cute", 107);
        base.addHat("Baseball Bill's Sports Shine", 1.66, new int[]{0}, "unique", "cool", 111);
        base.addHat("Troublemaker's Tossle Cap", 1.66, new int[]{0}, "unique", "both", 150);
        base.addHat("Whoopee Cap", 1.66, new int[]{0}, "unique", "both", 174);
        base.addHat("Milkman", 1.66, new int[]{0}, "unique", "both", 219);
        base.addHat("Bombing Run", 1.66, new int[]{0}, "unique", "both", 249);
        base.addHat("Flipped Trilby", 1.66, new int[]{0}, "unique", "both", 324);
        base.addHat("Superfan", 1.66, new int[]{0}, "unique", "both", 346);
        base.addHat("Hero's Tail", 7.55, new int[]{0}, "unique", "both", 453);
        base.addHat("El Jefe", 1.66, new int[]{0}, "unique", "both", 539);
        base.addHat("Backwards Ballcap", 1.66, new int[]{0}, "unique", "both", 617);
        base.addHat("Hermes", 1.66, new int[]{0}, "unique", "both", 617);
        base.addHat("Big Elfin Deal", 1.66, new int[]{0}, "unique", "cute", 652);
        base.addHat("Front Runner", 2, new int[]{0}, "unique", "cool", 760);
        base.addHat("Cross-Comm Express", 2, new int[]{0}, "unique", "cool", 765);
        base.addHat("Fed-Fightin' Fedora", 1.66, new int[]{0}, "unique", "both", 780);
        base.addHat("Void Monk Hair", 22, new int[]{0}, "unique", "cute", 788);
        base.addHat("Robot Running Man", 1.66, new int[]{0}, "unique", "cool", 846);
        base.addHat("Bacteria Blocker", 1.88, new int[]{0}, "unique", "cool", 1040);

        base.addHat("Ye Oiled Baker Boy", 1.66, new int[]{0}, "unique", "cute", 30019);
        base.addHat("Bonk Leadwear", 1.88, new int[]{0}, "unique", "both", 30030);
        base.addHat("Greased Lightning", 1.66, new int[]{0}, "unique", "cool", 30078);
        base.addHat("Scout Shako", 1.66, new int[]{0}, "unique", "cute", 30326);
        base.addHat("Runner's Warm-Up", 1.66, new int[]{0}, "unique", "both", 30332);
        base.addHat("Thirst Blood", b.keysToRef(2), new int[]{0}, "unique", "cool", 30479);
        base.addHat("Mountebank's Masque",b.keysToRef(1) + 45.55 , new int[]{0}, "unique", "cute", 30573);
        base.addHat("Co-Pilot",b.keysToRef(2) + 45.22 , new int[]{0}, "unique", "both", 30576);
        base.addHat("Fortunate Son",b.keysToRef(2) + 50 , new int[]{0}, "unique", "cool;", 30636);

        base.addHat("Soldier's Stash",b.keysToRef(4) + 44, new int[]{1}, "unique", "cool", 54);
        base.addHat("Stainless Pot",1.66 , new int[]{1}, "unique", "cute", 98);
        base.addHat("Tyrant's Helm",1.66 , new int[]{1}, "unique", "cool", 99);
        base.addHat("Killer's Kabuto",1.66 , new int[]{1}, "unique", "cool", 152);
        base.addHat("Sergeant's Drill Hat",1.66 , new int[]{1}, "unique", "cool", 183);
        base.addHat("Grenadier's Softcap",1.55 , new int[]{1}, "unique", "cool", 227);
        base.addHat("Lumbricus Lid",b.keysToRef(1) + 36 , new int[]{1}, "unique", "both", 240);
        base.addHat("Chieftain's Challenge",1.66 , new int[]{1}, "unique", "cool", 250);
        base.addHat("Stout Shako",1.66 , new int[]{1}, "unique", "both", 251);
        base.addHat("Dr's Dapper Topper",1.66 , new int[]{1}, "unique", "cute", 252);
        base.addHat("Exquisite Rack",1.66 , new int[]{1}, "unique", "both", 339);
        base.addHat("Defiant Spartan",1.66 , new int[]{1}, "unique", "cool", 340);
        base.addHat("Hero's Hachimaki",1.88 , new int[]{1}, "unique", "both", 360);
        base.addHat("Honcho's Headgear",1.66 , new int[]{1}, "unique", "cool", 391);
        base.addHat("Furious Fukaamigasa",1.66 , new int[]{1}, "unique", "both", 395);
        base.addHat("Jumper's Jeepcap",1.66 , new int[]{1}, "unique", "cool", 417);
        base.addHat("Brain Bucket",1.77 , new int[]{1}, "unique", "both", 434);
        base.addHat("Lord Cockswain's Pith Helmet",1.66 , new int[]{1}, "unique", "cute", 439);
        base.addHat("Armored Authority",1.66 , new int[]{1}, "unique", "cool", 445);
        base.addHat("Stahlhelm",2 , new int[]{1}, "unique", "both", 516);
        base.addHat("Infernal Impaler",1.66 , new int[]{1}, "unique", "cool", 575);
        base.addHat("Battle Bob",2.33 , new int[]{1}, "unique", "cute", 719);
        base.addHat("Conquistador",1.66 , new int[]{1}, "unique", "cool", 721);
        base.addHat("Cross-Comm Crash Helmet",1.88 , new int[]{1}, "unique", "cool", 764);
        base.addHat("Helmet Without a Home",1.66 , new int[]{1}, "unique", "both", 732);
        base.addHat("War Pig",2 , new int[]{1}, "unique", "cool", 829);
        base.addHat("Tin Pot",1.66 , new int[]{1}, "unique", "cool", 844);
        base.addHat("Chief Constable",1.77 , new int[]{1}, "unique", "cool", 945);
        base.addHat("Soldier's Slope Scopers",1.66 , new int[]{1}, "unique", "both", 980);
        base.addHat("Doe-Boy",1.66 , new int[]{1}, "unique", "cute", 1021);
        base.addHat("War on Smissmas Battle Hood",28.33 , new int[]{1}, "unique", "cool", 1073);
        base.addHat("Gilded Guard",1.66 , new int[]{1}, "unique", "cool", 1093);
        base.addHat("Tyrantium Helmet",1.77 , new int[]{1}, "unique", "cool", 30014);
        base.addHat("Steel Shako",1.88 , new int[]{1}, "unique", "cool", 30017);
        base.addHat("Full Metal Drill Hat",1.66 , new int[]{1}, "unique", "cool", 30026);
        base.addHat("Cloud Crasher",1.66 , new int[]{1}, "unique", "cool", 30071);
        base.addHat("Valley Forge",1.66 , new int[]{1}, "unique", "both", 30114);
        base.addHat("Caribbean Conqueror",1.66 , new int[]{1}, "unique", "cool", 30116);
        base.addHat("Rebel Rouser",1.66 , new int[]{1}, "unique", "cool", 30120);
        base.addHat("Slo-Poke",1.66 , new int[]{1}, "unique", "cool", 30314);
        base.addHat("Spook Specs",1.66 , new int[]{1}, "unique", "cool", 30390);
        base.addHat("Screamin' Eagle",1.66 , new int[]{1}, "unique", "cool", 30548);
        base.addHat("Condor Cap",1.66 , new int[]{1}, "unique", "cool", 30553);
        base.addHat("Skullcap",b.keysToRef(2) + 11 , new int[]{1}, "unique", "cool", 30578);

        base.addHat("Pyro's Beanie",b.keysToRef(2) + 12 , new int[]{2}, "unique", "cute", 51);
        base.addHat("Respectless Rubber Glove",1.66, new int[]{2}, "unique", "cute", 102);
        base.addHat("Brigade Helm",1.77, new int[]{2}, "unique", "both", 105);
        base.addHat("Triboniophorus Tyrannus",1.66, new int[]{2}, "unique", "cute", 151);
        base.addHat("Vintage Merryweather",1.66, new int[]{2}, "unique", "both", 182);
        base.addHat("Attendant",1.66, new int[]{2}, "unique", "cool", 213);
        base.addHat("Old Guadalajara",1.66, new int[]{2}, "unique", "both", 247);
        base.addHat("Napper's Respite",1.66, new int[]{2}, "unique", "cute", 248);
        base.addHat("Handyman's Handle",1.66, new int[]{2}, "unique", "cute", 253);
        base.addHat("Pyromancer's Mask",2.88, new int[]{2}, "unique", "cool", 316);
        base.addHat("Prancer's Pride",1.66, new int[]{2}, "unique", "cute", 318);
        base.addHat("Madame Dixie",1.66, new int[]{2}, "unique", "cute", 321);
        base.addHat("Hottie's Hoodie",1.66, new int[]{2}, "unique", "both", 377);
        base.addHat("Connoisseur's Cap",1.66, new int[]{2}, "unique", "cute", 394);
        base.addHat("Dead Cone",1.66, new int[]{2}, "unique", "both", 435);
        base.addHat("Stately Steel Toe",1.66, new int[]{2}, "unique", "both", 481);
        base.addHat("Bubble Pipe",1.66, new int[]{2}, "unique", "both", 597);
        base.addHat("Little Buddy",1.66, new int[]{2}, "unique", "cute", 612);
        base.addHat("Birdcage",1.66, new int[]{2}, "unique", "cute", 615);
        base.addHat("Flamboyant Flamenco",1.66, new int[]{2}, "unique", "cool", 627);
        base.addHat("Head Warmer",1.77, new int[]{2}, "unique", "both", 644);
        base.addHat("Waxy Wayfinder",1.66, new int[]{2}, "unique", "cute", 753);
        base.addHat("Area 451",2, new int[]{2}, "unique", "both", 854);
        base.addHat("Wraith Wrap",1.66, new int[]{2}, "unique", "cool", 937);
        base.addHat("DethKapp",2.77, new int[]{2}, "unique", "cute", 949);
        base.addHat("Centurion",2, new int[]{2}, "unique", "cool", 30063);
        base.addHat("Burning Bandana",1.66, new int[]{2}, "unique", "both", 30091);
        base.addHat("Hive Minder",1.66, new int[]{2}, "unique", "both", 30093);
        base.addHat("Pampered Pyro",1.66, new int[]{2}, "unique", "cute", 30139);
        base.addHat("Bone Dome",1.66, new int[]{2}, "unique", "cool", 30162);
        base.addHat("Toy Tailor",1.66, new int[]{2}, "unique", "cute", 30327);
        base.addHat("Sole Mate",3, new int[]{2}, "unique", "cute", 30355);
        base.addHat("Smoking Skid Lid",1.66, new int[]{2}, "unique", "cool", 30399);
        base.addHat("Employee of the Mmmph",1.66, new int[]{2}, "unique", "cute", 30416);
        base.addHat("Combustible Kabuto",1.66, new int[]{2}, "unique", "cool", 30418);
        base.addHat("Pyromancer's Hood",b.keysToRef(4) + 3, new int[]{2}, "unique", "cool", 30580);
        base.addHat("A Head Full of Hot Air",37.88, new int[]{2}, "unique", "both", 30662);

        base.addHat("Demoman's Fro",62.55, new int[]{3}, "unique", "both", 47);
        base.addHat("Glengarry Bonnet",1.66, new int[]{3}, "unique", "both", 100);
        base.addHat("Scotsman's Stove Pipe",1.66, new int[]{3}, "unique", "both", 120);
        base.addHat("Hustler's Hallmark",1.66, new int[]{3}, "unique", "cool", 146);
        base.addHat("Tippler's Tricorne",1.66, new int[]{3}, "unique", "both", 179);
        base.addHat("Rimmed Raincatcher",1.66, new int[]{3}, "unique", "both", 216);
        base.addHat("Sober Stuntman",1.66, new int[]{3}, "unique", "both", 255);
        base.addHat("Carouser's Capotain",1.66, new int[]{3}, "unique", "cute", 259);
        base.addHat("Scotch Bonnet",1.66, new int[]{3}, "unique", "cool", 306);
        base.addHat("Prince Tavish's Crown",2, new int[]{3}, "unique", "cool", 342);
        base.addHat("Samur-Eye",1.66, new int[]{3}, "unique", "cool", 359);
        base.addHat("Private Eye",1.66, new int[]{3}, "unique", "cute", 388);
        base.addHat("Reggaelator",1.66, new int[]{3}, "unique", "both", 390);
        base.addHat("Sultan's Ceremonial",1.66, new int[]{3}, "unique", "cute", 403);
        base.addHat("Conjurer's Cowl",1.66, new int[]{3}, "unique", "cool", 465);
        base.addHat("Tam O' Shanter",1.66, new int[]{3}, "unique", "both", 480);
        base.addHat("Tavish DeGroot Experience",1.66, new int[]{3}, "unique", "cool", 605);
        base.addHat("Buccaneer's Bicorne",1.66, new int[]{3}, "unique", "cute", 607);
        base.addHat("Bolgan",1.66, new int[]{3}, "unique", "cool", 703);
        base.addHat("Grenadier Helm",14.44, new int[]{3}, "unique", "cool", 786);
        base.addHat("Voodoo JuJu (Slight Return)",1.66, new int[]{3}, "unique", "cool", 935);
        base.addHat("FR-0",4.11, new int[]{3}, "unique", "cool", 30016);
        base.addHat("Pure Tin Capotain",1.66, new int[]{3}, "unique", "cute", 30021);
        base.addHat("Cyborg Stunt Helmet",1.66, new int[]{3}, "unique", "both", 30024);
        base.addHat("Broadband Bonnet",1.66, new int[]{3}, "unique", "both", 30029);
        base.addHat("Bolted Bicorne",1.66, new int[]{3}, "unique", "cute", 30034);
        base.addHat("Strontium Stove Pipe",2, new int[]{3}, "unique", "both", 30037);
        base.addHat("Glasgow Great Helm",2, new int[]{3}, "unique", "cool", 30082);
        base.addHat("Black Watch",1.66, new int[]{3}, "unique", "both", 30105);
        base.addHat("Tartan Spartan",1.66, new int[]{3}, "unique", "cool", 30106);
        base.addHat("Stormin' Norman",1.66, new int[]{3}, "unique", "cool", 30112);
        base.addHat("Pirate Bandana",1.66, new int[]{3}, "unique", "cool", 30180);
        base.addHat("Tartan Tyrolean",1.66, new int[]{3}, "unique", "cool", 30334);
        base.addHat("Razor Cut",1.66, new int[]{3}, "unique", "both", 30393);
        base.addHat("Frontier Djustice",1.66, new int[]{3}, "unique", "both", 30421);
        base.addHat("Allbrero",1.66, new int[]{3}, "unique", "cool", 30429);
        base.addHat("Bomber's Bucket Hat",1.66, new int[]{3}, "unique", "cool", 30547);
        base.addHat("Valhalla Helm",39.44, new int[]{3}, "unique", "cool", 30586);
        base.addHat("Scot Bonnet",b.keysToRef(2) + 27.55, new int[]{3}, "unique", "both", 30604);
        base.addHat("Bruce's Bonnet",b.keysToRef(4), new int[]{3}, "unique", "cool", 30627);
        base.addHat("Outta Sight",31.77, new int[]{3}, "unique", "both", 30628);

        base.addHat("Football Helmet",11.11, new int[]{4}, "unique", "both", 49);
        base.addHat("Officer's Ushanka",4, new int[]{4}, "unique", "both", 96);
        base.addHat("Tough Guy's Toque",2.22, new int[]{4}, "unique", "cute", 97);
        base.addHat("Hound Dog",1.66, new int[]{4}, "unique", "both", 145);
        base.addHat("Heavy Duty Rag",1.66, new int[]{4}, "unique", "cool", 185);
        base.addHat("Pugilist's Protector",1.66, new int[]{4}, "unique", "both", 246);
        base.addHat("Hard Counter",1.66, new int[]{4}, "unique", "cute", 254);
        base.addHat("Cadaver's Cranium",1.66, new int[]{4}, "unique", "cute", 290);
        base.addHat("Dealer's Visor",2.77, new int[]{4}, "unique", "both", 292);
        base.addHat("Big Chief",1.66, new int[]{4}, "unique", "cool", 309);
        base.addHat("Magnificent Mongolian",1.66, new int[]{4}, "unique", "both", 313);
        base.addHat("Coupe D'isaster",1.66, new int[]{4}, "unique", "both", 330);
        base.addHat("Dread Knot",1.66, new int[]{4}, "unique", "both", 358);
        base.addHat("Capo's Capper",1.66, new int[]{4}, "unique", "cool", 427);
        base.addHat("Copper's Hard Top",1.66, new int[]{4}, "unique", "cool", 478);
        base.addHat("Pilotka",1.77, new int[]{4}, "unique", "cool", 515);
        base.addHat("One-Man Army",1.66, new int[]{4}, "unique", "cool", 601);
        base.addHat("Outdoorsman",1.66, new int[]{4}, "unique", "both", 603);
        base.addHat("Gym Rat",1.66, new int[]{4}, "unique", "cool", 613);
        base.addHat("Heavy Artillery Officer's Cap",1.88, new int[]{4}, "unique", "both", 866);
        base.addHat("Brock's Locks",2.11, new int[]{4}, "unique", "cool", 952);
        base.addHat("Carl",5, new int[]{4}, "unique", "both", 989);
        base.addHat("Pounding Father",1.66, new int[]{4}, "unique", "cute", 1018);
        base.addHat("Gridiron Guardian",1.66, new int[]{4}, "unique", "both", 30013);
        base.addHat("Tungsten Toque",1.77, new int[]{4}, "unique", "cute", 30049);
        base.addHat("Bunsen Brave",2.11, new int[]{4}, "unique", "cool", 30054);
        base.addHat("Tsarboosh",1.66, new int[]{4}, "unique", "cute", 30081);
        base.addHat("Katyusha",1.66, new int[]{4}, "unique", "cool", 30094);
        base.addHat("Bear Necessities",1.66, new int[]{4}, "unique", "both", 30122);
        base.addHat("Minnesota Slick",1.66, new int[]{4}, "unique", "cool", 30315);
        base.addHat("Bullet Buzz",2.11, new int[]{4}, "unique", "cool", 30344);
        base.addHat("Trash Man",1.66, new int[]{4}, "unique", "both", 30346);
        base.addHat("Eliminator's Safeguard",6.22, new int[]{4}, "unique", "cool", 30369);
        base.addHat("Fur-lined Fighter",1.66, new int[]{4}, "unique", "cute", 30545);
        base.addHat("Siberian Facehugger",1.66, new int[]{4}, "unique", "both", 30588);
        base.addHat("Old Man Frost",1.66, new int[]{4}, "unique", "cute", 30589);
        base.addHat("White Russian",b.keysToRef(1) + 9.44, new int[]{4}, "unique", "both", 30644);
        base.addHat("Sucker Slug",b.keysToRef(4) + 27, new int[]{4}, "unique", "cute", 30653);

        base.addHat("Mining Light",b.keysToRef(1) + 24, new int[]{5}, "unique", "both", 48);
        base.addHat("Texas Ten Gallon",2.55, new int[]{5}, "unique", "cool", 94);
        base.addHat("Engineer's Cap",1.66, new int[]{5}, "unique", "both", 95);
        base.addHat("Texas Slim's Dome Shine",2.11, new int[]{5}, "unique", "both", 118);
        base.addHat("Hotrod",1.66, new int[]{5}, "unique", "cool", 148);
        base.addHat("Safe'n'Sound",1.66, new int[]{5}, "unique", "both", 178);
        base.addHat("Buckaroo's Hat",1.66, new int[]{5}, "unique", "both", 322);
        base.addHat("Industrial Festivizer",3.11, new int[]{5}, "unique", "both", 338);
        base.addHat("Western Wear",1.66, new int[]{5}, "unique", "cute", 379);
        base.addHat("Big Country",1.66, new int[]{5}, "unique", "both", 382);
        base.addHat("Ol' Geezer",1.66, new int[]{5}, "unique", "cool", 399);
        base.addHat("Hetman's Headpiece",1.66, new int[]{5}, "unique", "cute", 436);
        base.addHat("Pencil Pusher",1.66, new int[]{5}, "unique", "cool", 605);
        base.addHat("Virtual Reality Headset",1.66, new int[]{5}, "unique", "cool", 628);
        base.addHat("Tin-1000",1.66, new int[]{5}, "unique", "cool", 848);
        base.addHat("Barnstormer",1.66, new int[]{5}, "unique", "cute", 988);
        base.addHat("Last Straw",1.88, new int[]{5}, "unique", "both", 1010);
        base.addHat("Vox Diabolus",1.88, new int[]{5}, "unique", "cute", 1017);
        base.addHat("Plug-In Prospector",1.88, new int[]{5}, "unique", "cool", 30031);
        base.addHat("Timeless Topper",1.66, new int[]{5}, "unique", "both", 30035);
        base.addHat("Texas Tin-Gallon",1.66, new int[]{5}, "unique", "cool", 30044);
        base.addHat("Data Mining Light",1.66, new int[]{5}, "unique", "cool", 30044);
        base.addHat("Pardner's Pompadour",1.66, new int[]{5}, "unique", "cool", 30051);
        base.addHat("Trencher's Topper",1.66, new int[]{5}, "unique", "cool", 30336);
        base.addHat("Peacenik's Ponytail",1.66, new int[]{5}, "unique", "both", 30406);
        base.addHat("Conagher's Combover",b.keysToRef(2) + 32, new int[]{5}, "unique", "both", 30592);
        base.addHat("Sheriff's Stetson",b.keysToRef(3) + 50, new int[]{5}, "unique", "both", 30634);

        base.addHat("Prussian Pickelhaube",32, new int[]{6}, "unique", "cute", 50);
        base.addHat("Vintage Tyrolean",1.66, new int[]{6}, "unique", "both", 101);
        base.addHat("Otolaryngologist's Mirror",1.66, new int[]{6}, "unique", "cute", 104);
        base.addHat("Ze Goggles",1.66, new int[]{6}, "unique", "both", 177);
        base.addHat("Gentleman's Gatsby",1.66, new int[]{6}, "unique", "both", 184);
        base.addHat("German Gonzila",1.66, new int[]{6}, "unique", "both", 323);
        base.addHat("Geisha Boy",1.66, new int[]{6}, "unique", "cute", 363);
        base.addHat("Medic's Mountain Cap",1.66, new int[]{6}, "unique", "both", 381);
        base.addHat("Grimm Hatte",1.66, new int[]{6}, "unique", "cool", 383);
        base.addHat("Doctor's Sack",1.66, new int[]{6}, "unique", "cute", 398);
        base.addHat("Planeswalker Helm",1.66, new int[]{6}, "unique", "cool", 467);
        base.addHat("Surgeon's Stahlhelm",1.66, new int[]{6}, "unique", "cool", 616);
        base.addHat("Gentleman's Ushanka",1.66, new int[]{6}, "unique", "cute", 778);
        base.addHat("Combat Medic's Crusher Cap",5.77, new int[]{6}, "unique", "both", 867);
        base.addHat("Weather Master",1.88, new int[]{6}, "unique", "cute", 1039);
        base.addHat("Halogen Head Lamp",1.66, new int[]{6}, "unique", "cute", 30041);
        base.addHat("Platinum Pickelhaube",1.77, new int[]{6}, "unique", "both", 30042);
        base.addHat("Virus Doctor",1.66, new int[]{6}, "unique", "cool", 30043);
        base.addHat("Titanium Tyrolean",1.66, new int[]{6}, "unique", "both", 30045);
        base.addHat("Powdered Practitioner",1.66, new int[]{6}, "unique", "cool", 30069);
        base.addHat("Das Ubersternmann",1.66, new int[]{6}, "unique", "cool", 30097);
        base.addHat("Das Naggenvatcher",1.66, new int[]{6}, "unique", "cool", 30109);
        base.addHat("Das Maddendoktor",1.66, new int[]{6}, "unique", "both", 30121);
        base.addHat("Das Gutenkutteharen",1.66, new int[]{6}, "unique", "both", 30127);
        base.addHat("Baron von Havenaplane",1.66, new int[]{6}, "unique", "cool", 30136);
        base.addHat("Slick Cut",1.66, new int[]{6}, "unique", "cool", 30187);
        base.addHat("Nunhood",5.44, new int[]{6}, "unique", "both", 30311);
        base.addHat("Mann of Reason",1.66, new int[]{6}, "unique", "cute", 30318);
        base.addHat("Teutonic Toque",1.66, new int[]{6}, "unique", "cute", 30351);
        base.addHat("Heer's Helmet",1.66, new int[]{6}, "unique", "cool", 30378);
        base.addHat("Surgeon's Shako",b.keysToRef(1) + 2, new int[]{6}, "unique", "cute", 30596);

        base.addHat("Physician's Protector",30.22, new int[]{6}, "unique", "cool", 30625);
        base.addHat("Trophy Belt",48.44, new int[]{7}, "unique", "cool", 53);
        base.addHat("Professional's Panama",1.66, new int[]{7}, "unique", "both", 109);
        base.addHat("Ritzy Rick's Hair Fixative",1.66, new int[]{7}, "unique", "cool", 117);
        base.addHat("Shooter's Sola Topi",1.66, new int[]{7}, "unique", "both", 158);
        base.addHat("Bloke's Bucket Hat",1.66, new int[]{7}, "unique", "cool", 181);
        base.addHat("Ol' Snaggletooth",1.66, new int[]{7}, "unique", "cool", 229);
        base.addHat("Larrikin Robin",1.66, new int[]{7}, "unique", "cute", 314);
        base.addHat("Crocleather Slouch",1.66, new int[]{7}, "unique", "both", 344);
        base.addHat("Desert Marauder",1.66, new int[]{7}, "unique", "cool", 400);
        base.addHat("Your Worst Nightmare",2.22, new int[]{7}, "unique", "cool", 600);
        base.addHat("Swagman's Swatter",1.66, new int[]{7}, "unique", "cool", 626);
        base.addHat("Bushman's Boonie",1.88, new int[]{7}, "unique", "both", 720);
        base.addHat("Fruit Shoot",1.66, new int[]{7}, "unique", "cute", 759);
        base.addHat("Liquidator's Lid",1.66, new int[]{7}, "unique", "cool", 779);
        base.addHat("Lone Star",1.88, new int[]{7}, "unique", "cool", 819);
        base.addHat("Bolted Bushman",1.66, new int[]{7}, "unique", "both", 847);
        base.addHat("Stovepipe Sniper Shako",2, new int[]{7}, "unique", "cute", 877);
        base.addHat("Cold Killer",1.66, new int[]{7}, "unique", "cool", 981);
        base.addHat("Sydney Straw Boat",1.66, new int[]{7}, "unique", "cute", 1022);
        base.addHat("Smissmas Caribou",b.keysToRef(435), new int[]{7}, "unique", "both", 1076);
        base.addHat("Letch's LED",1.77, new int[]{7}, "unique", "both", 30002);
        base.addHat("Soldered Sensei",1.66, new int[]{7}, "unique", "both", 30004);
        base.addHat("Shooter's Tin Topi",1.66, new int[]{7}, "unique", "both", 30005);
        base.addHat("Wet Works",1.66, new int[]{7}, "unique", "both", 30135);
        base.addHat("Brim-Full of Bullets",1.66, new int[]{7}, "unique", "cool", 30173);
        base.addHat("Deep Cover Operator",1.88, new int[]{7,8}, "unique", "cool", 30375);
        base.addHat("Professional's Ushanka",b.keysToRef(1) + 51.44, new int[]{7}, "unique", "both", 30598);

        base.addHat("Fancy Fedora",41.44, new int[]{8}, "unique", "cool", 55);
        base.addHat("Backbiter's Billycock",1.66, new int[]{8}, "unique", "both", 108);
        base.addHat("Magistrate's Mullet",1.66, new int[]{8}, "unique", "cute", 147);
        base.addHat("Frenchman's Beret",1.66, new int[]{8}, "unique", "cool", 180);
        base.addHat("Detective Noir",1.66, new int[]{8}, "unique", "both", 319);
        base.addHat("Noh Mercy",2.22, new int[]{8}, "unique", "cool", 361);
        base.addHat("Charmer's Chapeau",1.66, new int[]{8}, "unique", "both", 397);
        base.addHat("Janissary Ketche",1.66, new int[]{8}, "unique", "cute", 437);
        base.addHat("Cosa Nostra Cap",2.33, new int[]{8}, "unique", "cool", 459);
        base.addHat("Nanobalaclava",1.66, new int[]{8}, "unique", "both", 521);
        base.addHat("Counterfeit Billycock",1.66, new int[]{8}, "unique", "cute", 602);
        base.addHat("L'Inspecteur",1.66, new int[]{8}, "unique", "both", 622);
        base.addHat("Ninja Cowl",57.77, new int[]{8}, "unique", "both", 789);
        base.addHat("Stealth Steeler",1.66, new int[]{8}, "unique", "cool", 841);
        base.addHat("Lacking Moral Fiber Mask",2.44, new int[]{8}, "unique", "cool", 872);
        base.addHat("Base Metal Billycock",1.66, new int[]{8}, "unique", "both", 30007);
        base.addHat("Bootleg Base Metal Billycock",1.77, new int[]{8}, "unique", "cute", 30047);
        base.addHat("Pom-Pommed Provocateur",1.66, new int[]{8}, "unique", "cute", 30072);
        base.addHat("Harmburg",1.66, new int[]{8}, "unique", "both", 30123);
        base.addHat("Belgian Detective",1.66, new int[]{8}, "unique", "cute", 30128);
        base.addHat("L'homme Burglerre",1.66, new int[]{8}, "unique", "cute", 30182);
        base.addHat("Napoleon Complex",1.66, new int[]{8}, "unique", "cool", 30360);
        base.addHat("Aviator Assassin",1.66, new int[]{8}, "unique", "both", 30404);

        base.addHat("Frickin' Sweet Ninja Hood",2, new int[]{0}, "unique", "cool", 30394);
        base.addHat("Anger",3.22, new int[]{7}, "unique", "cool", 518);
        base.addHat("Dread Hiding Hood",1.77, new int[]{7}, "unique", "cool", 1095);
        base.addHat("War Head",1.77, new int[]{4}, "unique", "cool", 635);
        base.addHat("Dragonborn Helmet",1.66, new int[]{4}, "unique", "both", 517);
        base.addHat("Berliner's Bucket Helm",1.66, new int[]{6}, "unique", "cool", 303);
        base.addHat("Professor's Peculiarity",1.66, new int[]{8}, "unique", "both", 384);
        base.addHat("Danger",2.22, new int[]{5}, "unique", "both", 30420);
        base.addHat("Familiar Fez",1.88, new int[]{8}, "unique", "both", 223);
        base.addHat("Pomade Prince",1.66, new int[]{0}, "unique", "cool", 30428);
        base.addHat("Dashin' Hashshashin",3.22, new int[]{8}, "unique", "cool", 637);





        base.addHat("Hot Dogger", 1.55, new int[]{0,1,2,3,4,5,6,7,8}, "unique", "cute", 539);
        base.addHat("Bot Dogger", 1.55, new int[]{0,1,2,3,4,5,6,7,8}, "unique", "cute", 30018);
        base.addHat("Crafty Hair", 1.88, new int[]{0,1,4,5,6}, "unique", "cute", 853);
        base.addHat("Wilson Weave", 1.88, new int[]{0,3,4,5,6}, "unique", "cute", 1012);
        base.addHat("Team Captain",9.11 , new int[]{1,4,6}, "unique", "cool", 378);
        base.addHat("Salty Dog",1.66 , new int[]{0,1,2,3,4,5,6,7,8}, "unique", "both", 611);
        base.addHat("Hat With No Name",1.66 , new int[]{1,3,5,7}, "unique", "cool", 631);
        base.addHat("Lucky Shot",1.66 , new int[]{1}, "unique", "cute", 701);
        base.addHat("Federal Casemaker",1.77 , new int[]{0,1,2,3,4,5,6,7,8}, "unique", "both", 30119);
        base.addHat("Cotton Head",1.66, new int[]{0,1,2,3,4,5,6,7,8}, "unique", "cute", 30175);
        base.addHat("K-9 Mane",2, new int[]{3,4}, "unique", "both", 876);
        base.addHat("Dark Falkirk Helm",3.11, new int[]{0,1,2,3,4,5,6,7,8}, "unique", "cool", 30357);
        base.addHat("Universal Translator",30.44, new int[]{0,1,2,3,4,5,6,7,8}, "unique", "cool", 30658);
        base.addHat("Merc's Mohawk",1.66, new int[]{0,1,2,3,4,5,6,7,8}, "unique", "cute", 30413);
        base.addHat("Well-Rounded Rifleman",1.66, new int[]{0,1,2,3,4,5,6,7,8}, "unique", "both", 30067);
        base.addHat("Toy Soldier",1.66, new int[]{1,7}, "unique", "cool", 30316);
    }








    public ArrayList<Item> load(int classId, String ItemType, int slotIndex, ItemBase base, String HatPref) {

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
                    if (g.getType().equals("both") || HatPref.equals("both") || HatPref.equals(g.getType())) {
                        list.add(g);
                    }
                }
            }
        }


        return list;
    }
}
