
import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Becky", "5B", 50000.0);
    }

    @Test
    public void hasName() {
        assertEquals("Becky", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("5B", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.0, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(0.1);
        assertEquals(55000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canGiveBonus() {
        assertEquals(500, databaseAdmin.payBonus(), 0.1);
    }
}
