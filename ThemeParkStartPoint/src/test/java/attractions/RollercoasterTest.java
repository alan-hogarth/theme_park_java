package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
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
    public void canRideRollerCoaster(){
        Visitor visitor = new Visitor(16, 146, 13.30);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));

    }

    @Test
    public void cannotRideRollerCoaster(){
        Visitor visitor = new Visitor(11, 142, 13.30);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));

    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.4, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void hasPriceFor(){
        Visitor visitor = new Visitor(11, 242, 13.30);
        assertEquals(16.8, rollerCoaster.priceFor(visitor), 0.0);
    }
}
