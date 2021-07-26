public class Singleton {
    private static Singleton instance;  // создем инстанс синглтона

    public static Singleton getInstance(){
        if (instance== null) {
            instance = new Singleton();
        }
        return instance;
        }
    }

