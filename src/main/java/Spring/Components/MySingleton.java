package Spring.Components;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Lazy
public class MySingleton {
    private int x = (int)(Math.random()*100);

    @PostConstruct
    public void init(){
        System.out.println("(Post conts) SingleTone x = "+x);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "MySingleton{" +
                "x=" + x +
                '}';
    }

    @PreDestroy
    public void destroy(){
        System.out.println("SingletTone is going done !!.");
    }
}
