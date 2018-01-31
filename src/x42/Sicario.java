package x42;

import com.nam.Main;
import org.slf4j.Logger;

public class Sicario {

    public Logger log = Main.log;

    public void X42(){

        go();
    }

    private void go(){

        try{
            int i = 10;

            i /= 0;

            int c[] = {42};

            c[42] = 99;
        }
        catch (ArrayIndexOutOfBoundsException e){
            log.error("Array fuck", e);
        }
        catch (RuntimeException e2){
            log.error("Catch2");
            log.error("1", e2);
            //e2.printStackTrace();
            log.error("Catch22");
            log.error("~" + e2 + "~");
        }
        finally {
            log.debug("Done");
        }


    }

}
