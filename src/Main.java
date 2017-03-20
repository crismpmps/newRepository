/**
 * Created by christosbampis on 20/03/2017.
 */

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Random rand= new Random(56);



        int i=12;
        float y=2.49F;

        y= (float)i;
        System.out.println(y);


    DataOnly data = new DataOnly();
        data.x=2;
        data.y=2.3;
        data.b=true;



    }
}

class DataOnly{

    int x;
    double y;
    boolean b;
}
