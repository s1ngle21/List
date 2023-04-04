package phoneBook;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.add(new Record("John", "+38 067 890 67 89"));
        phonebook.add(new Record("Sarah", "+38 097 670 56 98"));
        phonebook.add(new Record("John", "+38 099 843 45 34"));


        Record record = phonebook.find("John");
        if (record != null) {
            System.out.println("Phone number for John: " + record.getPhone());
        } else {
            System.out.println("Record not found.");
        }

        List<Record> records = phonebook.findAll("John");
        if (records != null) {
            for (Record r : records) {
                System.out.println(r.getName() + ": " + r.getPhone());
            }
        } else {
            System.out.println("No records found.");
        }

    }
}
