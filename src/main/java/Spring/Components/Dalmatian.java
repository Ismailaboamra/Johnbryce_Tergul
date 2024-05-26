package Spring.Components;

import Spring.Dog;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dalmatian implements Dog {
    private int dogID;
    @Override
    public String bark() {
        return "dalmatian";
    }

    public int getDogID() {
        return dogID;
    }

    public void setDogID(int dogID) {
        this.dogID = dogID;
    }
}
