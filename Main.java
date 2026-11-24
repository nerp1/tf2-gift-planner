import java.util.Scanner;

void main() {
        int userClassId;
        int budget;     //in keys

        String hatPref;

        Scanner input = new Scanner(System.in);
        System.out.println("TF2 Gift Planner :D");
        System.out.print("Type \"faq\" if you are confused about what this project is about ");
        System.out.print("or the jargon surrounding TF2 and its items.\n");

        String faqChoice = input.nextLine();

        if (faqChoice.equalsIgnoreCase("faq")) {
            FAQ();
        }

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



    budgetCalculator b = new budgetCalculator(63.22);
    double currentBudgetInRef = b.keysToRef(budget);

    if (budget > 1) {
        System.out.printf("%d keys is %.2f ref.%n", budget, currentBudgetInRef);
    } else {
        System.out.printf("%d key is %.2f ref.%n", budget, currentBudgetInRef);
    }


    do {
        System.out.println("What type of hat do you want for this gift? Cute/Silly, Cool or Both?");
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


    ArrayList<Item> PrimaryWeaponList = testList.load(userClassId, "Weapon", 0, testBase, null);
    ArrayList<Item> SecondaryWeaponList = testList.load(userClassId, "Weapon", 1, testBase,null);
    ArrayList<Item> MeleeWeaponList = testList.load(userClassId, "Weapon", 2, testBase,null);
    ArrayList<Item> HatList = testList.load(userClassId, "Hat", 0, testBase,hatPref);
    Item PrimaryWeaponChoice;
    Item SecondaryWeaponChoice;
    Item MeleeWeaponChoice;
    Item HatChoice;

    System.out.println("Pick a primary weapon.");

    while (true) {
        PrimaryWeaponChoice = Choose(PrimaryWeaponList,currentBudgetInRef);
        if (PrimaryWeaponChoice.getName().equals("empty")) {
            break;
        }
        System.out.printf("Confirm: Is \"%s\" your choice? (Y/N)%n", PrimaryWeaponChoice);
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
            break;
        }
    }

    currentBudgetInRef -= PrimaryWeaponChoice.getPrice();

    System.out.println("Pick a secondary weapon.");

    while (true) {
        SecondaryWeaponChoice = Choose(SecondaryWeaponList,currentBudgetInRef);
        if (SecondaryWeaponChoice.getName().equals("empty")) {
            break;
        }
        System.out.printf("Confirm: Is \"%s\" your choice? (Y/N)%n", SecondaryWeaponChoice);
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
            break;
        }
    }
    currentBudgetInRef -= SecondaryWeaponChoice.getPrice();

    System.out.println("Pick a melee weapon.");

    while (true) {
        MeleeWeaponChoice = Choose(MeleeWeaponList,currentBudgetInRef);
        if (MeleeWeaponChoice.getName().equals("empty")) {
            break;
        }
        System.out.printf("Confirm: Is \"%s\" your choice? (Y/N)%n", MeleeWeaponChoice);
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
            break;
        }
    }

    System.out.println("Pick a hat");

    currentBudgetInRef -= MeleeWeaponChoice.getPrice();

    while (true) {
        HatChoice = Choose(HatList,currentBudgetInRef);
        if (HatChoice.getName().equals("empty")) {
            break;
        }
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

    System.out.printf("You have %.2f ref left in your budget.%n", budget);

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
            System.out.println("There are no items within your remaining budget.");
            return new Item("emptyItem");
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

public static void FAQ() {
    boolean exitTime = false;
    Scanner input = new Scanner(System.in);
    do {


        System.out.println("===== FAQ =====");
        System.out.println("(1) What is TF2?");
        System.out.println("(2) What are the TF2 classes?");
        System.out.println("(3) What are the different item types?");
        System.out.println("(4) What do item qualities mean?");
        System.out.println("(5) How does the budget system work?");
        System.out.println("(6) Exit");

        if (input.hasNextInt()) {
            int choice = input.nextInt();

            if (choice > 0 && choice <= 6) {
                switch (choice) {
                    case 1, 2, 3, 4, 5 -> System.out.println(faqAnswer(choice));
                    case 6 -> exitTime = true;
                }
                System.out.println("Press any button to continue.");
                input.nextLine();
                input.nextLine();
            } else {
                System.out.println("Invalid input. Please choose a valid option.");
            }
        } else {
            System.out.println("Invalid input. Please choose a valid option.");
            input.next();
        }
    } while (!exitTime);
}

public static String faqAnswer(int choice) {
    String answerOne = """
            Team Fortress 2, commonly abbreviated to TF2, is a multiplayer first-person shooter game developed and 
            published by Valve. It was originally released in October 2007 for Windows. Players compete on two opposing 
            teams, RED and BLU, and choose from nine character classes.
            """;


    String answerTwo = """
            The 9 character classaes are Scout, Soldier, Pyro, Demoman, Heavy, Engineer, Medic, Sniper and Spy.
            """;

    String answerThree = """
            TF2 has an item system including unique weapons and cosmetics. Different weapons have
            different properties, including different strengths, weaknesses, and gameplay effects. Some weapons are 
            only able to be used by a single class, while others are able to be used by some or every class.
            Cosmetics in TF2 are wearable items that appear on a player's model, such as hats, different clothes,
            or other accessories.
           """;

    String answerFour = """
            There are many different qualities an item could be.
            
            The Unique quality is the most common item quality, and has no special features. It is regarded as
            the default item quality.
            
            The Strange quality tracks events and records them under the description of the item, making it viewable to
            both the owner and other players. Generally, weapons will track kills using that weapon, and cosmetics will
            track points scored while wearing the item.
            
            The Vintage quality designates obtained items that were Unique quality before the 2010 "Mann-Conomy Update".
            They are functionally and visually identical to their Unique counterparts.
            
            The Genuine quality designates items obtained through cross-game promotions or in-game events,
            distinguishing them from the same items gained via other methods. They are also functionally and visually
            identical to their Unique counterparts.
            
            Item qualities play a factor in determining the worth of an item, but it is not the only factor.
            Rarity, demand, and other variable factors also matter too.
            """;

    String answerFive = """
            The real-world value of a TF2 item is usually measured by its worth in keys or ref.
            
            Items can be smelted into scrap metal, which eventually combines into refined metal. One refined metal, 
            commonly, abbreviated as ref, is generally worth around 0.02 - 0.04$ USD. 
            
            A key, an item needed to open crates, which when opened, give items, is able to be purchased 
            for 2.49$ in the in-game store. Usually, it is cheaper from third-party vendors. Keys can be converted to 
            refined, although the value fluctuates.
            """;

    return switch (choice) {
        case 1 -> answerOne;
        case 2 -> answerTwo;
        case 3 -> answerThree;
        case 4 -> answerFour;
        case 5 -> answerFive;
        default -> "Invalid choice.";
    };
}