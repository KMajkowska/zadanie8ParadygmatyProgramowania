import java.awt.*;

public abstract class Decorator implements Component{

    Item item;

    public Decorator(Item i)
    {
        this.item  = i;
    }


}
