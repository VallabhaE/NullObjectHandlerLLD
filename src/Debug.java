public class Debug extends LogProcesser {
    Debug(LogProcesser logger) {
        super(logger);
    }

    public void log(int level, String message) {
        if (level == DEBUG) {
            System.out.println("DEBUG : " + message);
        } else {
            super.log(level, message);
        }
    }

}
