import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        this.printer = new Printer(10, 0);
    }

    @Test
    public void hasPages() {
        assertEquals(10, printer.getPages());
    }

    @Test
    public void hasCopies() {
        assertEquals(0, printer.getCopies());
    }

}
