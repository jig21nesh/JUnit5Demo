import org.junit.Assume;
import org.junit.jupiter.api.*;

/**
 * Created by jigneshkakkad on 2/8/16.
 */
public class AnotherSimpleClassTests {
    @BeforeAll
    static void initializeExternalResources() {
        System.out.println("Initializing resources...");
    }

    @BeforeEach
    void initializeMockObjects() {
        System.out.println("Initializing mock objects...");
    }

    @Test
    void someTest() {
        System.out.println("Running my test...");
        Assertions.assertTrue(true);
    }

    @Test
    void otherTest() {
        Assume.assumeTrue(true);
        System.out.println("Running another test...");
        Assertions.assertNotEquals(1, 42, "Why wouldn't these be the same?");
    }

    @Test
    @Disabled
    void disabledTest() {
        System.exit(1);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing ........");
    }

    @AfterAll
    static void freeExternalResources() {
        System.out.println("Freeing resources...");
    }
}
