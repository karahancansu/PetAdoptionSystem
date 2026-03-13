public class PuppyTemplate extends Pet implements PetPrototype {

    public PuppyTemplate(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    @Override
    public void showInfo() {
        System.out.println("Puppy -> Name: " + name + ", Age: " + age);
    }

    @Override
    public PetPrototype clonePet() {
        return new PuppyTemplate(this.name, this.age);
    }
}