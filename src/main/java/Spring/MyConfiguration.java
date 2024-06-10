package Spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Spring.Components")
public class MyConfiguration {
//    @Bean
//    @Primary
//    public MySingleton single6(){
//        MySingleton s = new MySingleton();
//        s.setX(6);
//        return s;
//    }
//
//    public MySingleton mySingleton(){
//        return new MySingleton();
//    }

}
