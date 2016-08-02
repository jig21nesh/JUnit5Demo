import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Created by jigneshkakkad on 2/8/16.
 */


@Tag("TaggingTests")
public class TaggingTests {

    @Test
    @Tag("Tag")
    void testTag() {
        Assertions.assertTrue(true);
    }
}
