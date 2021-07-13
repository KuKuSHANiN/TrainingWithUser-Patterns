import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserGeneratorService {
    public static List<User> generate() {
        User user1 = new User();
        user1.setName("Misha");
        user1.setBirthDate(LocalDate.of(1999, 5, 10));
        List<String> phones = new ArrayList<>();
        phones.add("88005553535");
        user1.setPhoneList(phones);

        User user2 = new User();
        user2.setName("Alesha");
        user2.setBirthDate(LocalDate.of(1995, 6, 10));
        phones = new ArrayList<>();
        phones.add("88005555656");
        phones.add("8900908089");
        user1.setPhoneList(phones);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}
