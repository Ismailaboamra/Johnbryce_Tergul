package Spring.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class MyCompiste {
    @Autowired
    private MyPrototype myPrototype;
    @Autowired
    private MySingleton mySingleton;

    public MyPrototype getMyPrototype() {
        return myPrototype;
    }


    public MySingleton getMySingleton() {
        return mySingleton;
    }

    @Bean
    public MyBean myBean(){
        MyBean myBean = new MyBean();
        myBean.setName("AAA");
        return myBean;
    }


}
