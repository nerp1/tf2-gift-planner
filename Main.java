import java.util.Scanner;

void main() {
        int userClassId;
        int budget;     //in keys
        String hatPref;

        Scanner input = new Scanner(System.in);
        System.out.println("TF2 Gift Planner :D");




        do {
            System.out.println("What class are you planning a gift for?");
            String classtype = input.next();
            String classtypelower = classtype.toLowerCase();
            input.nextLine();

            switch (classtypelower) {
                case "scout" -> userClassId = 0;
                case "soldier" -> userClassId = 1;
                case "pyro"  -> userClassId = 2;
                case "demoman", "demo" -> userClassId = 3;
                case "heavy" -> userClassId = 4;
                case "engineer", "engi" -> userClassId = 5;
                case "medic"  -> userClassId = 6;
                case "sniper"  -> userClassId = 7;
                case "spy" -> userClassId = 8;
                default -> {
                    userClassId = -1;
                    System.out.println("Invalid class. Please enter a valid TF2 class.");
                }
            }
        } while (userClassId == -1);


        while (true) {
            System.out.println("What is the budget for this gift? (min. 1 key)");

            if (input.hasNextInt()) {
                budget = input.nextInt();

                if (budget >= 1) {
                    break;
                }
            } else {
                input.next();
            }
            System.out.println("Invalid budget. Please enter an integer of at least 1.");
        }

    do {
        System.out.println("What type of hat do you want for this gift? Cute, cool or both?");
        String hatPreftemp = input.next();
        String hatPreftemplower = hatPreftemp.toLowerCase();
        input.nextLine();

        switch (hatPreftemplower) {
            case "cute" -> hatPref = "cute";
            case "cool" -> hatPref = "cool";
            case "both"  -> hatPref = "both";

            default -> {
                hatPref = "invalid";
                System.out.println("Invalid preference. Please enter a valid preference.");
            }
        }
    } while (hatPref.equals("invalid"));

    // Variables all set: first part: check for weapons. Which means CREATE weapons.

    ItemList testlist = new ItemList();
    ItemBase testbase = new ItemBase();
    testlist.CreateTestItemBase(testbase);
    System.out.println("Pick a primary weapon.");

    ArrayList<Item> PrimaryWeaponList = testlist.load(userClassId, "Weapon", 0, testbase);

    Item PrimaryWeaponChoice;

    PrimaryWeaponChoice = Choose(PrimaryWeaponList);

    System.out.print("Choice: " + PrimaryWeaponChoice);


}

public Item Choose(ArrayList<Item> itemlist) {
    Scanner input = new Scanner(System.in);
    int choicenum;
    int indexPlusOne;
    while (true) {
        for (int i = 0; i < itemlist.size(); i++) {
            indexPlusOne = i + 1;
            System.out.printf("(%d) %s%n",indexPlusOne , itemlist.get(i));
        }
        if (input.hasNextInt()) {
            choicenum = input.nextInt();
            break;
        } else {
            System.out.println("Invalid input. Please enter a valid input.");
            input.next();
        }
    }

    return itemlist.get(choicenum - 1);

}