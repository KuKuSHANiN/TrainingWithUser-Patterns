import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromConsole implements Source {
    Scanner in = new Scanner(System.in);

    @Override
    public List<User> createUsers() {

        User user1 = new User();
        System.out.println("Name");
        user1.setName(in.next());
        System.out.println("BirthDate");
        user1.setBirthDate(LocalDate.of(in.nextInt(), in.nextInt(), in.nextInt()));
        List<String> phones = new ArrayList<>();
        System.out.println("Phone");
        phones.add(in.next());
        user1.setPhoneList(phones);

        User user2 = new User();
        System.out.println("Name 2");
        user2.setName(in.next());
        System.out.println("BirthDate 2");
        user2.setBirthDate(LocalDate.of(in.nextInt(), in.nextInt(), in.nextInt()));
        phones = new ArrayList<>();
        System.out.println("Phone 2");
        phones.add(in.next());
        user2.setPhoneList(phones);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}
