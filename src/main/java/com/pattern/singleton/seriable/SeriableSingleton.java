package main.java.com.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @Description 可以防止反序列化破坏单例
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 4:46
 * @Version 1.0
 */
public class SeriableSingleton implements Serializable {

    private SeriableSingleton(){}

    private static final SeriableSingleton SERIABLE_SINGLETON = new SeriableSingleton();

    public static SeriableSingleton getInstance() {
        return SERIABLE_SINGLETON;
    }

    // 该方法是在调用反序列化过程中会调用的方法
    // 判断类是否有readResolve，如果有，则返回类本身readResolve方法返回的对象
    private Object readResolve() {
        return SERIABLE_SINGLETON;
    }

}
