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
        }
/*        catch (Exception e){
            log.error("Catch");
        }*/
        catch (RuntimeException e2){
            log.error("Catch");
        }
        finally {
            log.debug("Done");
        }


    }

}
