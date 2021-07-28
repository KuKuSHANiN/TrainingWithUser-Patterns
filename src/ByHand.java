import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ByHand implements Source{

    private ByHand(){};  // создаем приватный конструктор, чтобы никто не смог его более вызывать

    private static ByHand instance; // приватная статическая переменная класса, для хранения его экземпляра в будущем.

    public static ByHand getInstance(){        // способ для создания единственного экземпляра класса и хранится будет в instance
        if (instance==null){
            instance=new ByHand();
        }
        return instance;
    }


    @Override
    public List<User> createUsers() {
        User user1 = User.builder()
                .setName("Vasya")
                .setBirthDate(LocalDate.of(1993, Month.JULY,10))
                .setPhoneList(Arrays.asList("1828999", "141516"))
                .build();

        User user2 = User.builder()
                .setName("Alesha")
                .setBirthDate(LocalDate.of(1995, Month.JUNE, 10))
                .setPhoneList(Arrays.asList("88005555656"))
                .build();

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}

/*
public class ByHand implements Source {
    private ByHand() {                                          // приватный конструктор - то есть я хер создам через new!!!!
    }

    private static ByHand instance;                     // создаем статическое свойство , которое будет хранить в себе единственный экземпляр данного класса

    public static ByHand getInstance() {                // метод получения единственного экземпляра данного класса
        if (instance == null) {
            instance = new ByHand();
        }
        return instance;

    }

 */