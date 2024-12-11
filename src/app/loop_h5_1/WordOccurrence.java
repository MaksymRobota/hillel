package app.loop_h5_1;

public class WordOccurrence {
    String name;
    private Integer occurrence;

    public WordOccurrence(String name, Integer occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "{name: \"" + name + "\", occurrence: " + occurrence + "}";
    }
}
