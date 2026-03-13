public class Main {
    public static void main(String[] args) {

        System.out.println("----- FACTORY PATTERN  -----");
        PetFactory factory = new PetFactory();

        Pet pet1 = factory.createPet("dog", "Buddy", 3);
        Pet pet2 = factory.createPet("cat", "Luna", 2);
        Pet pet3 = factory.createPet("bird", "Coco", 1);

        if (pet1 != null) {
            pet1.showInfo();
            pet1.makeSound();
            System.out.println();
        }

        if (pet2 != null) {
            pet2.showInfo();
            pet2.makeSound();
            System.out.println();
        }

        if (pet3 != null) {
            pet3.showInfo();
            pet3.makeSound();
            System.out.println();
        }

        System.out.println("----- SINGLETON PATTERN  -----");

        ShelterSettings settings1 = ShelterSettings.getInstance();
        ShelterSettings settings2 = ShelterSettings.getInstance();

        settings1.setShelterName("Lovely Tails Shelter");
        settings1.setOpen(false);

        AdoptionDesk desk = new AdoptionDesk();
        CareSystem care = new CareSystem();

        settings1.showSettings();
        System.out.println();

        desk.showDeskInfo();
        desk.checkIfOpen();
        care.showCareInfo();
        care.checkIfOpen();
        System.out.println();

        if (settings1 == settings2) {
            System.out.println("settings1 and settings2 are the SAME object.");
        } else {
            System.out.println("settings1 and settings2 are DIFFERENT objects.");
        }

        System.out.println("----- OBJECT TYPE PATTERN  -----");

        PetTypeRegistry registry = new PetTypeRegistry();

        PetType dogType1 = registry.getPetType("dog");
        PetType dogType2 = registry.getPetType("dog");
        PetType catType = registry.getPetType("cat");

        PetProfile petA = new PetProfile("Buddy", 3, dogType1);
        PetProfile petB = new PetProfile("Max", 5, dogType2);
        PetProfile petC = new PetProfile("Luna", 2, catType);

        petA.showProfile();
        petB.showProfile();
        petC.showProfile();

        if (dogType1 == dogType2) {
            System.out.println("dogType1 and dogType2 are the SAME shared object.");
        } else {
            System.out.println("dogType1 and dogType2 are DIFFERENT objects.");
        }

        System.out.println("----- PROTOTYPE PATTERN  -----");

        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();

        PuppyTemplate originalPuppy = new PuppyTemplate("Milo", 1);
        KittenTemplate originalKitten = new KittenTemplate("Lily", 1);

        prototypeRegistry.addPrototype("puppy", originalPuppy);
        prototypeRegistry.addPrototype("kitten", originalKitten);

        PuppyTemplate clonedPuppy = (PuppyTemplate) prototypeRegistry.getClonedPrototype("puppy");
        KittenTemplate clonedKitten = (KittenTemplate) prototypeRegistry.getClonedPrototype("kitten");

        if (clonedPuppy != null) {
            clonedPuppy.showInfo();
            clonedPuppy.makeSound();
            System.out.println();
        }

        if (clonedKitten != null) {
            clonedKitten.showInfo();
            clonedKitten.makeSound();
            System.out.println();
        }

        if (originalPuppy != clonedPuppy) {
            System.out.println("Original puppy and cloned puppy are different objects.");
        }

        if (originalKitten != clonedKitten) {
            System.out.println("Original kitten and cloned kitten are different objects.");
        }
    }
}