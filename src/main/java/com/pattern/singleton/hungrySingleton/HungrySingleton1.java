package main.java.com.pattern.singleton.hungrySingleton;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 3:28
 * @Version 1.0
 */
public class HungrySingleton1 {

    // 构造方法私有化，用户不能new对象
    private HungrySingleton1() {

    }

    // final: 用户不能通过反射赋值
    private static final HungrySingleton1 HUNGRY_SINGLETON_1 = new HungrySingleton1();

    public HungrySingleton1 getInstance() {
        return HUNGRY_SINGLETON_1;
    }

}
