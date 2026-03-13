public class PetProfile {
    private String name;
    private int age;
    private PetType petType;

    public PetProfile(String name, int age, PetType petType) {
        this.name = name;
        this.age = age;
        this.petType = petType;
    }

    public void showProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + petType.getTypeName());
        System.out.println("Food: " + petType.getFood());
        System.out.println("Vaccine: " + petType.getVaccine());
        System.out.println();
    }

    public PetType getPetType() {
        return petType;
    }
}