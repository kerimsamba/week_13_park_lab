package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    Visitor visitor;


    @Override
    public boolean security(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 144) {
            return true;
        } else {
            return false;
        }
    }

    public boolean reviewed(int data) {
        if (data > 0) {
            return true;
        } else {
            return false;
        }
    }

    public double ticketed(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return 16.80;
        } else {
            return 8.40;
        }
    }

}
