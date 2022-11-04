import java.util.Random;

public class IdGenerator {
    Integer id = 1;

    public IdGenerator() {
        super();
    }

    Integer setId() {
        return id++;
    }
}