public class Error extends LogProcesser{
    Error(LogProcesser logger) {
        super(logger);
    }

    public void log(int level, String message) {
        if (level == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(level, message);
        }
    }

}
