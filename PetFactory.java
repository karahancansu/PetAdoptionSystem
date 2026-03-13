public class PetFactory {

    public Pet createPet(String type, String name, int age) {
        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("dog")) {
            return new Dog(name, age);
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat(name, age);
        } else if (type.equalsIgnoreCase("bird")) {
            return new Bird(name, age);
        } else {
            System.out.println("Invalid pet type.");
            return null;
        }
    }
}