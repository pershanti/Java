import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[10];
        myArray[3] = 4;
        myArray[8] = 4;
        for(int i=0; i<myArray.length; i++){
            if(myArray[i] == 4){
                System.out.println("yay");
            }
            else{
                continue;
            }
        }
    }
}
