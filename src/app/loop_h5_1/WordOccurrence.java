package app.loop_h5_1;

public class WordOccurrence {
    String name;
    Integer count;

    public WordOccurrence(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "{name: \"" + name + "\", occurrence: " + count + "}";
    }
}
