import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class PhoneBook {
    HashMap<String, String> list = new HashMap<>();
    private List<String> phone = new LinkedList<>();

    PhoneBook() {
    }

    PhoneBook(String[] Surnames, String[] Phones) {
        for (int x = 0; x < Surnames.length; x++) {
            if (!list.containsKey(Phones[x])) {

                setList(Phones[x], Surnames[x]);

                for (int y = 0; y < Phones.length; y++) {
                    if (Phones[x] == Phones[y]) {
                        setList(Phones[y], Surnames[x]);
                    }
                }
            }
        }
    }

    public void setList(String ph, String sur) {
        if (!phone.contains(ph)) {
            phone.add(ph);
        }
        if (!list.containsKey(sur)) {
            list.put(ph, sur);
        }
    }


    public void getList(String sur) {
        int count=0;
        System.out.println("------" + sur + "------");
        for (int y = 0; y < list.size(); y++) {

            if (list.get(phone.get(y)) == sur) {
                System.out.println(sur + ":" + phone.get(y));
                count++;
            }

        }
        System.out.println("В книге "+count+" человек с такой фамилией");
    }
}



