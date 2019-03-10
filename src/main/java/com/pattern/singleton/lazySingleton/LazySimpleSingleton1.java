package main.java.com.pattern.singleton.lazySingleton;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 3:35
 * @Version 1.0
 */
public class LazySimpleSingleton1 {

    private LazySimpleSingleton1() {}

    private static LazySimpleSingleton1 lazySimpleSingleton1 = null;

    // 线程不安全
    public static LazySimpleSingleton1 getInstance() {
        if(null == lazySimpleSingleton1) {
            lazySimpleSingleton1 = new LazySimpleSingleton1();
        }
        return lazySimpleSingleton1;
    }

}
