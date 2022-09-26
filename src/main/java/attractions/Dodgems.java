package attractions;

import people.Visitor;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }


    public boolean reviewed(int data) {
        if (data > 0) {
            return true;
        } else {
            return false;
        }
    }

    public double ticketed(Visitor visitor) {
        if (visitor.getAge() >= 12) {
            return 4.50;
        } else {
            return 2.25;
        }
    }
}
