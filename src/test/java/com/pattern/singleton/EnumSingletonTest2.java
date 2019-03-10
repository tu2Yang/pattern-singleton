package test.java.com.pattern.singleton;

import main.java.com.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 4:49
 * @Version 1.0
 */
public class EnumSingletonTest2 {

    public static void main(String[] args) {
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            c.newInstance("test", 1);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
