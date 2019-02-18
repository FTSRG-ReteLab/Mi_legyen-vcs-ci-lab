import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.sun.javafx.geom.Vec2d;

import java.util.Date;

public class tachograph {

     public Table<Date, Integer, Integer> table
            = HashBasedTable.create();

    public void add (Date d , Integer i1, Integer i2){
        table.put(d,i1,i2);
    }

}
