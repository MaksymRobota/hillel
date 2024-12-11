package app.phonebook_h5_2;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Record> records = new ArrayList<>();

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        return records.stream().filter(record -> record.getName().equals(name)).findFirst().orElse(null);
    }

    public List<Record> findAll(String name) {
        List<Record> result = records.stream()
                .filter(record -> record.getName().equals(name))
                .toList();
        return result.isEmpty() ? null : result;
    }
}
