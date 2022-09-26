package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(12, 145, 20);
        visitor2 = new Visitor(11, 145, 20);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasBeenReviewed() {assertEquals(true, dodgems.reviewed(dodgems.getRating()));}

    @Test
    public void defaultPrice() {assertEquals(4.50, dodgems.ticketed(visitor1), 0);}

    @Test
    public void halfPrice() {assertEquals(2.25, dodgems.ticketed(visitor2), 0);}
}
