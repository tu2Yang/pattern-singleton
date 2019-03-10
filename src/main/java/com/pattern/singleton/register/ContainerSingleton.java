package main.java.com.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/10 0010 下午 5:23
 * @Version 1.0
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String beanName) {
        // ioc是线程安全的，但是getBean方法不是
        synchronized (ioc) {
            if(!ioc.containsKey(beanName)) {
                Object obj = null;
                try{
                    obj = Class.forName(beanName).newInstance();
                    ioc.put(beanName, obj);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
        }
        return ioc.get(beanName);
    }
}
