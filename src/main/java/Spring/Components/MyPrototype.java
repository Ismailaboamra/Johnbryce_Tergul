package Spring.Components;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Scope("prototype")
@Component
public class MyPrototype {
    private int x = (int) (Math.random()*100);


    @PostConstruct
    public void init(){
        System.out.println("(Post conts) proto x = "+x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "MyPrototype{" +
                "x=" + x +
                '}';
    }
}
