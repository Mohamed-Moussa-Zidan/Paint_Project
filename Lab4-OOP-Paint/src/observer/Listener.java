package observer;

import model.MyShape;

public abstract class Listener {

    protected MyShape shape;
    abstract void update();

}
