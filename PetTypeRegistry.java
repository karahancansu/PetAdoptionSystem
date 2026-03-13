import java.util.HashMap;
import java.util.Map;

public class PetTypeRegistry {
    private Map<String, PetType> types;

    public PetTypeRegistry() {
        types = new HashMap<>();
    }

    public PetType getPetType(String typeName) {
        if (types.containsKey(typeName)) {
            return types.get(typeName);
        }

        PetType newType = null;

        if (typeName.equalsIgnoreCase("dog")) {
            newType = new PetType("Dog", "Dry Food", "Rabies");
        } else if (typeName.equalsIgnoreCase("cat")) {
            newType = new PetType("Cat", "Wet Food", "Feline Vaccine");
        } else if (typeName.equalsIgnoreCase("bird")) {
            newType = new PetType("Bird", "Seeds", "Bird Flu Vaccine");
        }

        if (newType != null) {
            types.put(typeName, newType);
        }

        return newType;
    }
}