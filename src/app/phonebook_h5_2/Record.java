package app.phonebook_h5_2;

public class Record {
    private final String name;
    private final String phone;

    public Record(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Record{name='" + name + '\'' + ", phone='" + phone + '\'' + '}';
    }
}
