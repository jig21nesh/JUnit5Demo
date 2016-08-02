/**
 * Created by jigneshkakkad on 2/8/16.
 */
public class SimpleClass {
    public static void main(String[] args) {

    }

    public int add(Integer... listOfNumbers){
        int total = 0;

        if(listOfNumbers == null ) return total;

        for(Integer integer : listOfNumbers){
            total += integer;
        }
        return total;
    }
}
