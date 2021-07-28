import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FromConsole implements Source {

    private FromConsole() {
    }

    ;  // создаем приватный конструктор, чтобы никто не смог его более вызывать

    private static FromConsole instance; // приватная статическая переменная класса, для хранения его экземпляра в будущем.

    public static FromConsole getInstance() {        // способ для создания единственного экземпляра класса и хранится будет в instance
        if (instance == null) {
            instance = new FromConsole();
        }
        return instance;
    }

    Scanner in = new Scanner(System.in);

    @Override
    public List<User> createUsers() {

        User user1 = User.builder()
                .setName(in.next())
                .setBirthDate(LocalDate.of(in.nextInt(), Month.valueOf(in.next()), in.nextInt()))
                .setPhoneList(Arrays.asList(in.next(), in.next()))
                .build();

        User user2 = User.builder()
                .setName(in.next())
                .setBirthDate(LocalDate.of(in.nextInt(), Month.valueOf(in.next()), in.nextInt()))
                .setPhoneList(Arrays.asList(in.next(), in.next()))
                .build();

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);


        return userList;
    }
}
