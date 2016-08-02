import org.junit.jupiter.api.*;

/**
 * Created by jigneshkakkad on 2/8/16.
 */


public class TestInfoTests {

    @BeforeEach
    void init(TestInfo testInfo) {
        //Write the display name of each test case!
        System.out.println("Running for :: "+testInfo.getDisplayName());
        String displayName = testInfo.getDisplayName();
        Assertions.assertTrue(displayName.equals("FIRST") || displayName.equals("Second"));
    }

    @Test
    @DisplayName("FIRST")
    void test1(TestInfo testInfo) {
        Assertions.assertEquals("FIRST", testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Second")
    void test2(TestInfo testInfo) {
        Assertions.assertEquals("FIRST", testInfo.getDisplayName());
    }
}
