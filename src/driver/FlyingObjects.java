package driver;

/**
 * FlyingObjects class encompassing Airplane and UAV.
 * @author Artur Gubaidullin
 * @see <P>COMP249
 * <P>Assignment #2
 * <P>Due Date 04/03/2022
 */
public class FlyingObjects {

    public FlyingObjects() {}

    public FlyingObjects(FlyingObjects flyingObjects) {}

    public FlyingObjects copy() {
        return new FlyingObjects(this);
    }

}
