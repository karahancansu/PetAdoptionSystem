import java.util.ArrayList;

public class AdoptionManager {
    private ArrayList<String> adoptionRecords;
    private PetManager petManager;

    public AdoptionManager(PetManager petManager) {
        this.petManager = petManager;
        adoptionRecords = new ArrayList<>();
    }

    public void adoptPet(String petName, String adopterName) {
        Pet pet = petManager.findPetByName(petName);

        if (pet != null) {
            adoptionRecords.add(adopterName + " adopted " + pet.getName());
            petManager.removePetObject(pet);
            System.out.println(adopterName + " adopted " + pet.getName());
        } else {
            System.out.println("Pet not found.");
        }
    }

    public void listAdoptions() {
        if (adoptionRecords.isEmpty()) {
            System.out.println("No adoption records.");
            return;
        }

        for (String record : adoptionRecords) {
            System.out.println(record);
        }
    }
}