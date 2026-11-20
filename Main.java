import java.util.Scanner;

void main() {
        int userClassId;
        int budget;     //in keys

        String hatPref;

        Scanner input = new Scanner(System.in);
        System.out.println("TF2 Gift Planner :D");




        do {
            System.out.println("What class are you planning a gift for?");
            String classType = input.next();
            String classTypeLower = classType.toLowerCase();
            input.nextLine();

            switch (classTypeLower) {
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

    double keyPrice = 63.22; //Eventually add Key price override?
    double currentBudgetInRef = budget * keyPrice;

    do {
        System.out.println("What type of hat do you want for this gift? Cute, cool or both?");
        String hatPrefTemp = input.next();
        String hatPrefTempLowerCase = hatPrefTemp.toLowerCase();
        input.nextLine();

        switch (hatPrefTempLowerCase) {
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

    ItemList testList = new ItemList();
    ItemBase testBase = new ItemBase();
    testList.CreateTestItemBase(testBase);


    ArrayList<Item> PrimaryWeaponList = testList.load(userClassId, "Weapon", 0, testBase);
    ArrayList<Item> SecondaryWeaponList = testList.load(userClassId, "Weapon", 1, testBase);
    ArrayList<Item> MeleeWeaponList = testList.load(userClassId, "Weapon", 2, testBase);
    ArrayList<Item> HatList = testList.load(userClassId, "Hat", 0, testBase);
    Item PrimaryWeaponChoice;
    Item SecondaryWeaponChoice;
    Item MeleeWeaponChoice;
    Item HatChoice;

    System.out.println("Pick a primary weapon.");

    while (true) {
        PrimaryWeaponChoice = Choose(PrimaryWeaponList,currentBudgetInRef - 5.00);
        System.out.printf("Confirm: Is \"%s\" your choice? (Y/N)%n", PrimaryWeaponChoice);
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
            break;
        }
    }

    currentBudgetInRef -= PrimaryWeaponChoice.getPrice();

    System.out.println("Pick a secondary weapon.");

    while (true) {
        SecondaryWeaponChoice = Choose(SecondaryWeaponList,currentBudgetInRef - 4.77);
        System.out.printf("Confirm: Is \"%s\" your choice? (Y/N)%n", SecondaryWeaponChoice);
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
            break;
        }
    }
    currentBudgetInRef -= SecondaryWeaponChoice.getPrice();

    System.out.println("Pick a melee weapon.");

    while (true) {
        MeleeWeaponChoice = Choose(MeleeWeaponList,currentBudgetInRef - 4.44);
        System.out.printf("Confirm: Is \"%s\" your choice? (Y/N)%n", MeleeWeaponChoice);
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
            break;
        }
    }

    System.out.println("Pick a hat");

    currentBudgetInRef -= MeleeWeaponChoice.getPrice();

    while (true) {
        HatChoice = Choose(HatList,currentBudgetInRef - 3);
        System.out.printf("Confirm: Is \"%s\" your choice? (Y/N)%n", HatChoice);
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
            break;
        }
    }
    currentBudgetInRef -= HatChoice.getPrice();



}




public Item Choose(ArrayList<Item> itemList, double budget) {
    Scanner input = new Scanner(System.in);
    int choiceNum;

    ArrayList<Item> sortedList = SortUtil.SortByPrice(itemList);
    while (true) {
        int listNum = 0;
        for (Item item : sortedList) {
            if (item.getPrice() <= budget) {
                listNum++;
                System.out.printf("(%d) %s%n", listNum, item);
            } else {
                break;
            }

        }
        if (listNum == 0) {
            System.out.println("There are no items within your remaining budget. This error should not be seen.");
        }

        if (input.hasNextInt()) {
            int choice = input.nextInt();

            if (choice > 0 && choice <= listNum) {
                choiceNum = choice;
                break;
            } else {
                System.out.println("Invalid input. Please choose a valid option.");
            }
        } else {
            System.out.println("Invalid input. Please choose a valid option.");
            input.next();
        }
    }

    return sortedList.get(choiceNum - 1);

}