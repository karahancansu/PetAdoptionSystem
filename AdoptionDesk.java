public class AdoptionDesk {
    private ShelterSettings settings;

    public AdoptionDesk() {
        settings = ShelterSettings.getInstance();
    }

    public void showDeskInfo() {
        System.out.println("Adoption Desk uses shelter: " + settings.getShelterName());
    }

    public void checkIfOpen() {
        if (settings.isOpen()) {
            System.out.println("Adoption desk is open.");
        } else {
            System.out.println("Adoption desk is closed.");
        }
    }
}