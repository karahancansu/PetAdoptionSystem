public class CareSystem {
    private ShelterSettings settings;

    public CareSystem() {
        settings = ShelterSettings.getInstance();
    }

    public void showCareInfo() {
        System.out.println("Care System uses shelter: " + settings.getShelterName());
    }

    public void checkIfOpen() {
        if (settings.isOpen()) {
            System.out.println("Care system is active.");
        } else {
            System.out.println("Care system is inactive because the shelter is closed.");
        }
    }
}