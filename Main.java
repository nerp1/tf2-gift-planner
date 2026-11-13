import java.util.Scanner;

void main() {
        int classid;
        int budget;
        String hatPref = "invalid";

        Scanner input = new Scanner(System.in);
        System.out.println("TF2 Gift Planner :D");

        //Testing purposes
        Hat demofro = new Hat("Demoman's Fro", 2, 3, "cool");
        Weapon quick = new Weapon("Quickibomb Launhcer", 2, 3);


        do {
            System.out.println("What class are you planning a gift for?");
            String classtype = input.next();
            String classtypelower = classtype.toLowerCase();
            input.nextLine();

            switch (classtypelower) {
                case "scout" -> classid = 0;
                case "soldier" -> classid = 1;
                case "pyro"  -> classid = 2;
                case "demoman", "demo" -> classid = 3;
                case "heavy" -> classid = 4;
                case "engineer", "engi" -> classid = 5;
                case "medic"  -> classid = 6;
                case "sniper"  -> classid = 7;
                case "spy" -> classid = 8;
                default -> {
                    classid = -1;
                    System.out.println("Invalid class. Please enter a valid TF2 class.");
                }
            }
        } while (classid == -1);


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

    // Variables all set: first part,
}