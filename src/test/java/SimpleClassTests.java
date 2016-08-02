import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by jigneshkakkad on 2/8/16.
 */

public class SimpleClassTests {

    @Test
    @DisplayName("This is a first Test")
    void testTwoNumbers(){
        SimpleClass simpleClass = new SimpleClass();

        Assertions.assertEquals(simpleClass.add(1,2), 3);
    }
}
