public class ShelterSettings {
    private static ShelterSettings instance;

    private String shelterName;
    private boolean open;

    private ShelterSettings() {
        shelterName = "Happy Paws Shelter";
        open = true;
    }

    public static ShelterSettings getInstance() {
        if (instance == null) {
            instance = new ShelterSettings();
        }
        return instance;
    }

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void showSettings() {
        System.out.println("Shelter Name: " + shelterName);
        System.out.println("Open: " + open);
    }
}