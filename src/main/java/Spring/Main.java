package Spring;

import Spring.Components.Dalmatian;
import Spring.Components.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.sayHello();

        Dog rexi = context.getBean(Dalmatian.class);
        rexi.setDogID(112);
        Dog max = context.getBean(Dalmatian.class);

        System.out.println(rexi.bark());
        System.out.println(max.bark());

        System.out.println("rexi ID :"+rexi.getDogID());
        System.out.println("max ID :"+max.getDogID());
    }

}
