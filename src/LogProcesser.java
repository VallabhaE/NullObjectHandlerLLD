public abstract class LogProcesser {
    LogProcesser logger;
    public static int INFO = 1;
    public static int ERROR = 2;
    public static int DEBUG = 3;

    LogProcesser(LogProcesser logger){
        this.logger = logger;
    }

    public void log(int level,String message){
        if(logger!=null){
            logger.log(level,message);
        }
    }
}
