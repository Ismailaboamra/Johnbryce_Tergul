package Springs.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"Springs.Controller"})

public class MyApplication {
    public static void main(String[] args) {

        SpringApplication.run(MyApplication.class,args);

    }
}
