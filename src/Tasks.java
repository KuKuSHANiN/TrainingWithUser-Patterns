import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tasks {

    public static Source source = ByHand.getInstance();
    public static List<User> userList = source.createUsers();


    public static void task1() {
        List<User> resultUserList = userList.stream()              // обработали
                .filter(u -> u.getBirthDate().getYear() > 1990)
                .collect(Collectors.toList());
        System.out.println(resultUserList);
        // съебались
    }


    public static void task2() {

        Map<String, User> resultUserListToMap = userList.stream()
                .collect(Collectors.toMap(User::getName, ???????));
        System.out.println(resultUserListToMap.containsKey("Misha"));
    }

    public static void task3() {
        double yearFromBirthDate = userList.stream()
                .mapToInt(u -> u.getBirthDate().getYear())
                .average().orElse(0);
        System.out.println(yearFromBirthDate);
    }
}

//  Optional.empty() - возвращает пустой объект;
//  Optional.of() - возвращает опш обьект;
//  Optional.ofNullable() - возвращает опш объект, если нет дженерик-объекта то возвращает пустой объект;
//  Optional.of().ifPresent(); - если объект выбранный - не путой, то позволяет сделать что то.
// Optional.of().isPresent() - сообщает существует ли вообще обьект или нет, тип Булеан)
//Optional <User> optionalUser = userList.get(1);
//User user = optionalUser.orElseGet(User::new); (вместо OrElseGEt  было IsPresent().? optionalUser.get():new User())
// orElse - возвращает объект в любом случа  .orElse (new User)
// orElseGet - если все таки объект не найден , вызывает другой метод  OrElseGet.(()-> findAnotherPlace(userID))
// orElseThrow - если объекта нет, можем ебануть исключение)
// способы преобразования полученного объекта
// get() -  тупо возвращает объект если он есть, запакованный в опш, но пздец в том что можно либо словть НПЭ либо объект, он минует проверку на налл
//  ........  .get();
// map() - полная аналоги со стримАПИ,, но проводит преобразовани в случае если объект есть, а не налл.
// .map(user -> user.getName()).orElseThrow (() -> new Exception());
// filter() - все как в стримАПИ, все фильтрует по выбранному условию
//.filter(user -> user.age >=18).orElseThrow (()-> new Exception());
//flatmap() - так же как и в стримАПИ, только если зачение не налл.


