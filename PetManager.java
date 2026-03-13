import java.util.ArrayList;

public class PetManager {
    private ArrayList<Pet> pets;

    public PetManager() {
        pets = new ArrayList<>();
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

    public Pet findPetByName(String name) {
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }

    public void removePetObject(Pet pet) {
        pets.remove(pet);
    }
}