import java.time.LocalDate;
import java.util.ArrayList;
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