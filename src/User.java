import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Создали модель со СТАНДАРТНЫМИ геттерами и сеттерами и все блять больше ее не трогаем!!!!

public class User {
    private List<String> phoneList = new ArrayList<>();
    private String name;
    private LocalDate birthDate;

    public boolean isBetray() {
        return phoneList.size() > 1;
    }


    public List<String> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneList=" + phoneList +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate + '}';
    }
}
