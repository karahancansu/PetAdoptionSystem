import java.util.ArrayList;

public class CareManager {
    private ArrayList<String> careRecords;
    private PetManager petManager;

    public CareManager(PetManager petManager) {
        this.petManager = petManager;
        careRecords = new ArrayList<>();
    }

    public void feedPet(String petName) {
        Pet pet = petManager.findPetByName(petName);

        if (pet != null) {
            careRecords.add(pet.getName() + " was fed.");
            System.out.println(pet.getName() + " was fed.");
        } else {
            System.out.println("Pet not found.");
        }
    }

    public void listCareRecords() {
        if (careRecords.isEmpty()) {
            System.out.println("No care records.");
            return;
        }

        for (String record : careRecords) {
            System.out.println(record);
        }
    }
}