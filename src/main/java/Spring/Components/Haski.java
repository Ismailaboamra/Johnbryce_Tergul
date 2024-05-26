package Spring.Components;

import Spring.Dog;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Haski implements Dog {
    private int dogID;
    @Override
    public String bark() {
        return "Haski";
    }

    @Override
    public int getDogID() {
        return dogID;
    }

    @Override
    public void setDogID(int dogID) {
        this.dogID = dogID;
    }
}
