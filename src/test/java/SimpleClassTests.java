import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by jigneshkakkad on 2/8/16.
 */

public class SimpleClassTests {

    @Test
    void testTwoNumbers(){
        SimpleClass simpleClass = new SimpleClass();

        Assertions.assertEquals(simpleClass.add(1,2), 3);
    }

    @Test
    @DisplayName("DisplayName Test")
    void testTwoNumbersAndTheDisplayNameTag(){
        SimpleClass simpleClass = new SimpleClass();
        Assertions.assertEquals(simpleClass.add(1,2), 3);
    }


    @Test
    void groupAssertions(){
        int[] numbers = {0, 1, 2, 3, 4};
        Assertions.assertAll("numbers",
                () -> Assertions.assertEquals(numbers[0], 0),
                () -> Assertions.assertEquals(numbers[3], 3),
                () -> Assertions.assertEquals(numbers[4], 4)
        );
    }

    @Test
    @Disabled
    void testTheDisableAnnotation(){
        Assertions.assertTrue(false);
    }

    @Test
    void testingAssertWithAnOptionalMessage(){
        SimpleClass simpleClass = new SimpleClass();
        Assertions.assertEquals(simpleClass.add(1), 1, "This is an optional message!");
    }


}
