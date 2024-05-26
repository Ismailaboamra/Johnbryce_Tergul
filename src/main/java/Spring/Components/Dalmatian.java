package Spring.Components;

import Spring.Dog;
import org.springframework.stereotype.Component;

@Component
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
