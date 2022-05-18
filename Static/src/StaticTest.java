public class StaticTest {
    private static int numInstaces = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstaces++;
    }

    public static int getNumInstaces() {
        return numInstaces;
    }

    public String getName() {
        return name;
    }
}
