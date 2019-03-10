package test.java.com.pattern.singleton;

import main.java.com.pattern.singleton.lazySingleton.LazySingleton1;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 3:55
 * @Version 1.0
 */
public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        LazySingleton1 lazySingleton1 = LazySingleton1.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + lazySingleton1);
    }
}
