package singleton_pattern;
class Logger {
    private static Logger obj;

    private Logger() {}

    public static Logger getInstance() {
        if (obj == null) {
            obj = new Logger();
        }
        return obj;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

public class singleton_pattern {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("Application Started");

        System.out.println(l1 == l2);
    }
}