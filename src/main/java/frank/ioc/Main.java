package frank.ioc;

import frank.scan.LoginController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 加载Spring的配置文件，初始化上下文：生成Bean对象。。。
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");
//        // 通过名字获取Bean对象
//        Object o = context.getBean("myName");
//        System.out.println(o.getClass());
//        System.out.println(o);

//        Object duck1 = context.getBean("duck1");
//        System.out.println(duck1.getClass());
//        System.out.println(duck1);
//        Object duck2 = context.getBean("duck2");
//        System.out.println(duck2.getClass());
//        System.out.println(duck2);
//        Object duckShop = context.getBean("duckShop");
//        System.out.println(duckShop.getClass());
//        System.out.println(duckShop);

        // 通过类型来获取对象：容器中只能有一个该类型的对象
//        Object duckShop2 = context.getBean(DuckShop.class);
//        System.out.println(duckShop2.getClass());
//        System.out.println(duckShop2);
//
//        System.out.println(duckShop == duckShop2);

        // 存在两只鸭子，通过类型获取Bean，直接抛出异常
//        Object duck1 = context.getBean(Duck.class);
//        System.out.println(duck1.getClass());
//        System.out.println(duck1);

        Object duck6 = context.getBean("duck6");
        System.out.println(duck6.getClass());
        System.out.println(duck6);

        LoginController loginController = (LoginController)context.getBean("loginController");
        System.out.println(loginController.getLoginService());
        System.out.println(loginController.getDuck3());
    }
}
