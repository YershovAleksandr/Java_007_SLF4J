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
        catch (ArithmeticException e2){
            log.error("1", e2);
            log.error("~" + e2 + "~");
        }
        catch (RuntimeException e3){
            log.error("Runtime exception ", e3);
        }
        finally {
            log.debug("Done");
        }
    }

}
