import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void before() {
        this.waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void hadDrink() {
        assertEquals(90, waterBottle.drink());
    }

    @Test public void hadEmptied() {
        assertEquals(0, waterBottle.empty());
    }

    @Test public void hadFilled() {
        assertEquals(100, waterBottle.fill());
    }
}
