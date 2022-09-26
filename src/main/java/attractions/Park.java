package attractions;

public class Park extends Attraction {

    public Park(String name, int rating) {
        super(name, rating);
    }


    public boolean reviewed(int data) {
        if (data > 0) {
            return true;
        } else {
            return false;
        }
    }
}
