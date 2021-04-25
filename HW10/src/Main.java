import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] Sur = new String[]{"иван", "коля", "слава", "коля", "андрей", "святослав", "игорь", "кола", "слава", "иван", "кола", "игорь"};
        String[] Phones = new String[]{"51519259", "87345014", "48106907", "33197771", "59533182", "25969136", "24685975", "01578946", "84575985", "35642875", "95867532", "12000547"};
        PhoneBook phoneBook = new PhoneBook(Sur, Phones);

        phoneBook.setList("15647825", "иван");

        phoneBook.getList("иван");
        phoneBook.getList("коля");
        phoneBook.getList("андрей");

    }

}

