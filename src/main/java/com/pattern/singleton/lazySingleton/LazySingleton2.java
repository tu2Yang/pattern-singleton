package main.java.com.pattern.singleton.lazySingleton;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 3:48
 * @Version 1.0
 */
public class LazySingleton2 {

    private LazySingleton2() {}

    private static LazySingleton2 lazySingleton2 = null;

    // 双重检查，锁的粒度小了，效率更高
    public static LazySingleton2 getInstance() {
        if(null == lazySingleton2) {
            synchronized (LazySingleton2.class) {
                if(null == lazySingleton2) {
                    lazySingleton2 = new LazySingleton2();
                }
            }
        }
        return lazySingleton2;
    }
}
