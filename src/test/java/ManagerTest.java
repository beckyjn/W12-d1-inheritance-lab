import Staff.Employee;
import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Becky", "5B", 50000.0, "Cool Stuff");
    }

    @Test
    public void hasName() {
        assertEquals("Becky", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("5B", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.0, manager.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(0.1);
        assertEquals(55000, manager.getSalary(), 0.1);
    }

    @Test
    public void canGiveBonus() {
        assertEquals(500, manager.payBonus(), 0.1);
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("Cool Stuff", manager.getDeptName());
    }

    @Test
    public void cannotRaiseSalaryByNegative() {
        manager.raiseSalary(-0.1);
        assertEquals(55000, manager.getSalary(), 0.1);
    }

    @Test
    public void canChangeName() {
        manager.setName("Jenn");
        assertEquals("Jenn", manager.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        manager.setName(null);
        assertEquals("Becky", manager.getName());
    }

    @Test
    public void cannotChangeNameToEmptyString() {
        manager.setName("");
        assertEquals("Becky", manager.getName());
    }
}
