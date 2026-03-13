public class PetType {
    private String typeName;
    private String food;
    private String vaccine;

    public PetType(String typeName, String food, String vaccine) {
        this.typeName = typeName;
        this.food = food;
        this.vaccine = vaccine;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getFood() {
        return food;
    }

    public String getVaccine() {
        return vaccine;
    }
}