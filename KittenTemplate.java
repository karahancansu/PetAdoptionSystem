public class KittenTemplate extends Pet implements PetPrototype {

    public KittenTemplate(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public void showInfo() {
        System.out.println("Kitten -> Name: " + name + ", Age: " + age);
    }

    @Override
    public PetPrototype clonePet() {
        return new KittenTemplate(this.name, this.age);
    }
}