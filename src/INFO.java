public class INFO extends LogProcesser{
    INFO(LogProcesser logger) {
        super(logger);
    }

    public void log(int level, String message) {
        if (level == INFO) {
            System.out.println("INFO : " + message);
        } else {
            super.log(level, message);
        }
    }
}
