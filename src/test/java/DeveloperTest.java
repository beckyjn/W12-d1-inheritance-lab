import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

        Developer developer;

        @Before
        public void before() {
            developer = new Developer("Becky", "5B", 50000.0);
        }

        @Test
        public void hasName() {
            assertEquals("Becky", developer.getName());
        }

        @Test
        public void hasNINumber() {
            assertEquals("5B", developer.getNiNumber());
        }

        @Test
        public void hasSalary() {
            assertEquals(50000.0, developer.getSalary(), 0.1);
        }

        @Test
        public void canRaiseSalary() {
            developer.raiseSalary(0.1);
            assertEquals(55000, developer.getSalary(), 0.1);
        }

        @Test
        public void canGiveBonus() {
            assertEquals(500, developer.payBonus(), 0.1);
        }
    }

