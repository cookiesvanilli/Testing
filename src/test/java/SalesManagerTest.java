import org.junit.jupiter.api.*;
import ru.netology.SalesManager;

public class SalesManagerTest {

    private SalesManager salesManager;

    @BeforeEach
    void setUp() {
        salesManager = new SalesManager(new long[]{4, 1, 10, 12, 45, 3});
        System.out.println("Before");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After");
    }

    @BeforeAll
    static void setUpApp() {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("After all tests");
    }

    @Test
    @DisplayName("Testing max")
    void salesMangerMax() {
        Assertions.assertEquals(45, salesManager.max());
    }

    @Test
    @DisplayName("Testing average")
    void salesManagerAverage() {
        Assertions.assertEquals(4, salesManager.average());
    }

    @Test
    @DisplayName("Equals long[]")
    void testCase() {
        long[] a = {4, 1, 10};
        long[] b = {4, 1, 10};
        Assertions.assertArrayEquals(a, b);
    }
}
