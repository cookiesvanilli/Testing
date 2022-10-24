import org.junit.jupiter.api.*;
import ru.netology.WordChecker;

public class WordCheckerTest {

    private WordChecker wordChecker;
    private static final String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in" +
            " voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    @BeforeEach
    void setUp() {
        wordChecker = new WordChecker(lorem);
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
    void positiveTest() {
        Assertions.assertTrue(wordChecker.hasWord("dolor"));
    }

    @Test
    void negativeTest() {
        Assertions.assertFalse(wordChecker.hasWord("abc"));
    }
}
