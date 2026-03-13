import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, PetPrototype> prototypes;

    public PrototypeRegistry() {
        prototypes = new HashMap<>();
    }

    public void addPrototype(String key, PetPrototype prototype) {
        prototypes.put(key, prototype);
    }

    public PetPrototype getClonedPrototype(String key) {
        PetPrototype prototype = prototypes.get(key);

        if (prototype != null) {
            return prototype.clonePet();
        }

        return null;
    }
}