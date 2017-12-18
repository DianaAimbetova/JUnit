import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.Assert.*;
public class TestCalc {
    Calc c = null;
@Before
    public void setUp(){
        c= new Calc();
    }

@Test
    public void TestAdd(){
        int rez = c.add(2,5);
        if(7!=rez){
            fail("Haha");
        }

        assertTrue(rez==7);
    }
@Test
    public void TestDiv() {
        assertEquals(2, c.div(10, 5));

}
@Test(expected = ArithmeticException.class)
    public void TestDivToZero(){
        c.div(2,0);
    }
}
