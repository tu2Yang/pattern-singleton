package test.java.com.pattern.singleton;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 3:53
 * @Version 1.0
 */
public class LazySingleton1Test {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.run();
        t2.run();
    }

}
