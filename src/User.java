import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Создали модель со СТАНДАРТНЫМИ геттерами и сеттерами и все блять больше ее не трогаем!!!!

public class User {

    private static List<String> phoneList;
    private static String name;
    private static LocalDate birthDate;

    private User() {
    }

    ;

    public static List<String> getPhoneList() {
        return phoneList;
    }

    public String getName() {
        return name;
    }

    public static LocalDate getBirthDate() {
        return birthDate;
    }


    @Override
    public String toString() {
        return "User{" +
                "phoneList=" + phoneList +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate + '}';
    }

    public static Builder builder() {
        return new User().new Builder();
    }

    public class Builder {

        public Builder() {
        }

        public Builder setName(String name) {
            User.name = name;
            return this;

        }

        public Builder setPhoneList(List<String > phoneList) {
            User.phoneList = phoneList;
            return this;
        }

        public Builder setBirthDate(LocalDate birthDate) {
            User.birthDate = birthDate;
            return this;

        }

        public User build() {
            return User.this;
        }
    }

}
