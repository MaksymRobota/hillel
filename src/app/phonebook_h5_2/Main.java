package app.phonebook_h5_2;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new Record("Max", "123456"));
        phoneBook.add(new Record("Jane", "654321"));
        phoneBook.add(new Record("Max", "987654"));

        System.out.println("Find Max: " + phoneBook.find("Max"));
        System.out.println("Find all Max: " + phoneBook.findAll("Max"));
    }
}