package jms.tictactoe.ui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaris
 */
public class GameSizeTest {
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("\nTESTING GAMESIZE CLASS");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.print("    - ");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class GameSize.
     */
    @Test
    public void testValuesReturnsValues() {
        System.out.println("testValuesReturnsValues");
        GameSize.SIZE.setGameSize(3);
        GameSize[] expResult = {GameSize.SIZE};
        GameSize[] result = GameSize.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class GameSize.
     */
    @Test
    public void testValueOfGameSizeReturnsValueOfGameSize() {
        System.out.println("testValueOfGameSizeReturnsValueOfGameSize");
        GameSize.SIZE.setGameSize(3);
        int result = GameSize.valueOf(GameSize.SIZE.toString()).getGameSize();
        assertEquals(3, result);
    }

    /**
     * Test of getGameSize method, of class GameSize.
     */
    @Test
    public void testSetAndGetGameSizeReturnsGameSize() {
        System.out.println("testSetAndGetGameSizeReturnsGameSize");
        GameSize.SIZE.setGameSize(3);
        int result = GameSize.SIZE.getGameSize();
        assertEquals(3, result);
    }
    
}
