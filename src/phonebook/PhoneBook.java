package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    private List<Record> records;

    public PhoneBook() {
        this.records = new ArrayList<>();
    }

    public void add(Record record) {
        Objects.requireNonNull(record);
        records.add(record);
    }

    public Record find(String name) {
        Objects.requireNonNull(name);
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> recordsRes = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                recordsRes.add(record);
            }
        }
        return records.isEmpty() ? null : recordsRes;
    }
}
