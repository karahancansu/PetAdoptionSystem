import java.util.ArrayList;

public class ShelterSystem {
    private ArrayList<Pet> pets;
    private ArrayList<String> adoptionRecords;
    private ArrayList<String> careRecords;

    public ShelterSystem() {
        pets = new ArrayList<>();
        adoptionRecords = new ArrayList<>();
        careRecords = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println(pet.getName() + " was added.");
    }

    public void removePet(String name) {
        Pet pet = findPetByName(name);

        if (pet != null) {
            pets.remove(pet);
            System.out.println(name + " was removed.");
        } else {
            System.out.println("Pet not found.");
        }
    }

    public void listPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets in shelter.");
            return;
        }

        for (Pet pet : pets) {
            pet.showInfo();
        }
    }

    public void adoptPet(String name, String adopterName) {
        Pet pet = findPetByName(name);

        if (pet != null) {
            adoptionRecords.add(adopterName + " adopted " + pet.getName());
            pets.remove(pet);
            System.out.println(adopterName + " adopted " + pet.getName());
        } else {
            System.out.println("Pet not found.");
        }
    }

    public void feedPet(String name) {
        Pet pet = findPetByName(name);

        if (pet != null) {
            careRecords.add(pet.getName() + " was fed.");
            System.out.println(pet.getName() + " was fed.");
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

    public void listCareRecords() {
        if (careRecords.isEmpty()) {
            System.out.println("No care records.");
            return;
        }

        for (String record : careRecords) {
            System.out.println(record);
        }
    }

    private Pet findPetByName(String name) {
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }
}