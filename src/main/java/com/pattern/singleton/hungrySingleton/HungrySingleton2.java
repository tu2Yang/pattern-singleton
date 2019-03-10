package main.java.com.pattern.singleton.hungrySingleton;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 3:31
 * @Version 1.0
 */
public class HungrySingleton2 {

    private HungrySingleton2(){}

    private static HungrySingleton2 hungrySinleton;

    static {
        hungrySinleton = new HungrySingleton2();
    }

    public HungrySingleton2 getInstance() {
        return hungrySinleton;
    }

}
