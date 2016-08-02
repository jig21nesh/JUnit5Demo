import org.junit.Assume;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Created by jigneshkakkad on 2/8/16.
 */
public class AssumptionTests {



    @Test
    void testOnlyOnCiServer() {
        Assume.assumeTrue("CI".equals(SimpleClass.getCIDev()));
        // remainder of test
        Assertions.assertTrue(true);
        System.out.println("Did I see this line?");
    }

    @Test
    void testOnlyOnDevServer() {
        Assume.assumeTrue("DEV".equals(SimpleClass.getCIDev()));
        // remainder of test
        Assertions.assertTrue(true);
        System.out.println("Shouldn't see this line!");
    }
}
