public class ShelterSystemDemo {
    public static void main(String[] args) {
        ShelterSystem system = new ShelterSystem();

        system.addPet(new Dog("Buddy", 3));
        system.addPet(new Cat("Luna", 2));
        system.addPet(new Bird("Coco", 1));

        System.out.println();

        system.listPets();

        System.out.println();

        system.feedPet("Buddy");
        system.adoptPet("Luna", "Ayse");

        System.out.println();

        system.listAdoptions();
        system.listCareRecords();
    }
}