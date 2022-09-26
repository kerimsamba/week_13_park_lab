package attractions;

import behaviours.ITicketed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;



    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(13, 146, 10);
        visitor2 = new Visitor(12, 145, 20);
        visitor3 = new Visitor(25, 201, 20);



    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canAcceptVisitor() {assertEquals(true, rollerCoaster.security(visitor1));}

    @Test
    public void canRefuseVisitor() {assertEquals(false, rollerCoaster.security(visitor2));}

    @Test
    public void hasBeenReviewed() {assertEquals(true, rollerCoaster.reviewed(rollerCoaster.getRating()));}

    @Test
    public void defaultPrice() {assertEquals(8.40, rollerCoaster.ticketed(visitor1), 0);}

    @Test
    public void doublePrice() {assertEquals(16.80, rollerCoaster.ticketed(visitor3), 0);}

//    ITicketed promises double defaultPrice() and double priceFor(Visitor)

}
