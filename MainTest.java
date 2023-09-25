import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testStudent1() {
        assertEquals(-1, Main.kiemtrahocphi(true, 6));
    }

    @Test
    public void testStudent2() {
        assertEquals(10000000, Main.kiemtrahocphi(true, 5));
        
    }

    @Test
    public void testStudent3() {
        assertEquals(8000000, Main.kiemtrahocphi(true, 4));
    }

    @Test
    public void testStudent4() {
        assertEquals(5000000, Main.kiemtrahocphi(true, 3));
    }

    @Test
    public void testStudent5() {
        assertEquals(0, Main.kiemtrahocphi(true, 2));
    }

    @Test
    public void testStudent6() {
        assertEquals(-1, Main.kiemtrahocphi(true, 1));
    }

    @Test
    public void testOther1() {
        assertEquals(-1, Main.kiemtrahocphi(false, 6));
    }

    @Test
    public void testOther2() {
        assertEquals(15000000, Main.kiemtrahocphi(false, 5));
    }

    @Test
    public void testOther3() {
        assertEquals(10000000, Main.kiemtrahocphi(false, 4));
        
    }

    @Test
    public void testOther4() {
        assertEquals(8000000, Main.kiemtrahocphi(false, 3));
    }

    @Test
    public void testOther5() {
        assertEquals(0, Main.kiemtrahocphi(false, 2));
    }

    @Test
    public void testOther6() {
        assertEquals(-1, Main.kiemtrahocphi(false, 1));
    }
}
