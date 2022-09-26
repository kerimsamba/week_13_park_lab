package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor1 = new Visitor(16, 120, 10);
        visitor2 = new Visitor(14, 160, 20);

    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canRefuseVisitor() {assertEquals(false, playground.security(visitor1));}

    @Test
    public void canAcceptVisitor() {assertEquals(true, playground.security(visitor2));}

    @Test
    public void hasBeenReviewed() {assertEquals(true, playground.reviewed(playground.getRating()));}
}
