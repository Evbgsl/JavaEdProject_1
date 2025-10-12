class Knight {
    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;
    private static String horseName = "Великан";


    public static void goAndSaveThePrincess() {
        sharpenBlade();
        getFood();
        getHorse(horseName);
        assembleTeam();
        System.out.println("Da idu uzhe...");
    }

    private static void getHorse(String s) {
        System.out.println("Седлаем коня по имени: " + s);
    }

    private static void sharpenBlade() {
        System.out.println("Tochim mech");
    }

    private static void getFood() {
        System.out.println("Sobirayem konservy");
    }

    private static void assembleTeam() {
        System.out.println("Budim oruzhenostsa");
    }

}
