package com.example.helloworld.config;

import ch.qos.logback.core.db.DBHelper;
import com.example.helloworld.bean.Car;
import com.example.helloworld.bean.Pet;
import com.example.helloworld.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

// proxyBeanMethods默认是true，此时调用方法，返回的Bean都是单例
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true)
//@ConditionalOnBean(name = "tom")
@ConditionalOnMissingBean(name = "tom")
@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties(Car.class)
public class MyConfig {

    @Bean
    public User user01() {
        User user = new User("张三", 18);
        user.setPet(tomcatPet());
        return user;
    }

    @Bean(name = "tom22")
    public Pet tomcatPet() {
        return new Pet("tomcat", 0.0);
    }
}
