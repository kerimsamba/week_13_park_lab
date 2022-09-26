package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
    }


    Visitor visitor;
    Playground playground;

    @Override
    public boolean security(Visitor visitor) {
        if(visitor.getAge() < 16){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean reviewed(int data) {
        if (data > 0) {
            return true;
        } else {
            return false;
        }
    }

}
