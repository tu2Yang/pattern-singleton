package main.java.com.pattern.singleton.lazySingleton;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 4:18
 * @Version 1.0
 */
public class LazySingleton3 {

    private LazySingleton3() {
        if(null != LazyHolder.LAZY) {
            throw new RuntimeException("已初始化");
        }
    }

    // 静态内部类，效率最高
    public static LazySingleton3 getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazySingleton3 LAZY = new LazySingleton3();
    }

}
