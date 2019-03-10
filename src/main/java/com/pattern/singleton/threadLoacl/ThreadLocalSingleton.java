package main.java.com.pattern.singleton.threadLoacl;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 5:30
 * @Version 1.0
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }

}
