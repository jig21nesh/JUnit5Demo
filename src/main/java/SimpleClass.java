/**
 * Created by jigneshkakkad on 2/8/16.
 */
public class SimpleClass {
    public static void main(String[] args) {
        System.out.println(System.getenv("ENV"));
    }

    public int add(Integer... listOfNumbers){
        int total = 0;

        if(listOfNumbers == null ) return total;

        for(Integer integer : listOfNumbers){
            total += integer;
        }
        return total;
    }

    public int[] getGroupOfNumbers(){
        int[] numbers = {0, 1, 2, 3, 4};
        return numbers;
    }

    //Mock methods to get an environment
    public static String getCIDev(){
        return "CI";
    }

    public static String getDevEnv(){
        return "DEV";
    }
}
