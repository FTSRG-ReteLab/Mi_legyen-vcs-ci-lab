import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class tachographTest {


    @Test
    public void tachotest() {
        tachograph tacho= new tachograph();
        tacho.add(new Date(), 15, 35);
        assert tacho.table.size()>0;
    }
}