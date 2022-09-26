package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    Visitor visitor;

    @Override
    public boolean security(Visitor visitor) {
        if(visitor.getAge() > 17){
            return true;
        }else{
            return false;
        }
    }
}
