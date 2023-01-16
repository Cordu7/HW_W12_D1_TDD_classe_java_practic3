import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle1;
    @Before
    public void before(){
        waterBottle1 = new WaterBottle();
    }
    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle1.getVolume(), 0.0);
    }
    @Test
    public void goesDown10WhenDrink(){
        waterBottle1.drink();
        assertEquals(90, waterBottle1.getVolume(), 0.0);
    }
    @Test
    public void canEmpty(){
        waterBottle1.empty();
        assertEquals(0, waterBottle1.getVolume(), 0.0);
    }
    @Test
    public void canFill(){
        waterBottle1.fill();
        assertEquals(100, waterBottle1.getVolume(), 0.0);
    }


}
