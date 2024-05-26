package Spring;

import Spring.Components.MySingleton;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "Spring.Components")
public class MyConfiguration {
    @Bean
    @Primary
    public MySingleton single6(){
        MySingleton s = new MySingleton();
        s.setX(6);
        return s;
    }
}
