public class RefactoredShelterDemo {
    public static void main(String[] args) {
        PetManager petManager = new PetManager();
        AdoptionManager adoptionManager = new AdoptionManager(petManager);
        CareManager careManager = new CareManager(petManager);

        petManager.addPet(new Dog("Buddy", 3));
        petManager.addPet(new Cat("Luna", 2));
        petManager.addPet(new Bird("Coco", 1));

        System.out.println();

        petManager.listPets();

        System.out.println();

        careManager.feedPet("Buddy");
        adoptionManager.adoptPet("Luna", "Ayse");

        System.out.println();

        adoptionManager.listAdoptions();
        careManager.listCareRecords();
    }
}