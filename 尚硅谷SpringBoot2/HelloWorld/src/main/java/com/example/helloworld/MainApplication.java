package com.example.helloworld;

import ch.qos.logback.core.db.DBHelper;
import com.example.helloworld.bean.Pet;
import com.example.helloworld.bean.User;
import com.example.helloworld.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
//        Pet pet1 = run.getBean("tom", Pet.class);
//        Pet pet2 = run.getBean("tom", Pet.class);
//        System.out.println("pet1 == pet2:" + (pet1 == pet2));
//
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//        User user1 = bean.user01();
//        User user2 = bean.user01();
//        System.out.println("user1 == user2:" + (user1 == user2));
//
//        User user01 = run.getBean("user01", User.class);
//        Pet tom = run.getBean("tom", Pet.class);
//        System.out.println("user01.pet == pet:" + (user1.getPet() == tom));
//
//        String[] beanNames = run.getBeanNamesForType(User.class);
//        System.out.println("=====================");
//        for (String s : beanNames) {
//            System.out.println(s);
//        }
//
//        DBHelper bean1 = run.getBean(DBHelper.class);
//        System.out.println(bean1);

        boolean hasTom = run.containsBean("tom");
        System.out.println("是否有tom组件：" + hasTom);

        boolean hasUser01 = run.containsBean("user01");
        System.out.println("是否有user01组件：" + hasUser01);

        boolean hasTom22 = run.containsBean("tom22");
        System.out.println("是否有tom22组件：" + hasTom22);

        boolean hasHaha = run.containsBean("haha");
        System.out.println("是否有haha组件：" + hasHaha);

        boolean hasHehe = run.containsBean("hehe");
        System.out.println("是否有hehe组件：" + hasHehe);
    }
}
