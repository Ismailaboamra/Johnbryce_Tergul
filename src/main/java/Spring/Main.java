package Spring;

import Spring.Components.MyPrototype;
import Spring.Components.MySingleton;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
//        HelloWorld helloWorld = context.getBean(HelloWorld.class);
//        helloWorld.sayHello();
//
//        Dog rexi = context.getBean(Dalmatian.class);
//        rexi.setDogID(112);
//        Dog max = context.getBean(Dalmatian.class);
//
//        System.out.println(rexi.bark());
//        System.out.println(max.bark());
//
//        System.out.println("rexi ID :"+rexi.getDogID());
//        System.out.println("max ID :"+max.getDogID());

        MyPrototype proto1 = context.getBean(MyPrototype.class);
        MyPrototype proto2 = context.getBean(MyPrototype.class);

        MySingleton single1 = context.getBean("MySingleton",MySingleton.class);
        MySingleton single2 = context.getBean("single6",MySingleton.class);

        System.out.println("proto1 : "+proto1.getX());
        System.out.println("proto2 : "+proto2.getX());
        System.out.println("single1 : "+single1.getX());
        System.out.println("single2 : "+single2.getX());
        context.close();




    }

}
