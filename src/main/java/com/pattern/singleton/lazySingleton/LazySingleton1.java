package main.java.com.pattern.singleton.lazySingleton;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 3:44
 * @Version 1.0
 */
public class LazySingleton1 {

    private LazySingleton1(){}

    private static LazySingleton1 lazySingleton1 = null;

    // 线程安全，但是同步锁可能导致类死锁，可优化
    public static synchronized LazySingleton1 getInstance() {
        if(null == lazySingleton1) {
            lazySingleton1 = new LazySingleton1();
        }
        return lazySingleton1;
    }

}
