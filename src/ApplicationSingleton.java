import java.util.List;
import java.util.stream.Collectors;

public class ApplicationSingleton {

    private static ApplicationSingleton startInstance;

    private ApplicationSingleton() {
    }

    ;

    public static ApplicationSingleton getStartInstance() {
        if (startInstance == null) {
            startInstance = new ApplicationSingleton();
        }

        return startInstance;
    }
    public void runTask1(){
        Tasks.task1();
    }
    public void runTask2(){
        Tasks.task2();
    }
    public void runTask3(){
        Tasks.task3();
    }
}

