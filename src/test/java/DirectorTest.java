import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Becky", "5B", 50000.0, "Cool Stuff", 1000000.50);
    }

    @Test
    public void hasName() {
        assertEquals("Becky", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("5B", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.0, director.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(0.1);
        assertEquals(55000, director.getSalary(), 0.1);
    }

    @Test
    public void canGiveBonus() {
        assertEquals(500, director.payBonus(), 0.1);
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("Cool Stuff", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(1000000.50, director.getBudget(), 0.01);
    }
}
