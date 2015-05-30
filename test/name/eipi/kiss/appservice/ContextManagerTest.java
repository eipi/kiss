package name.eipi.kiss.appservice;

import name.eipi.kiss.BaseKissTest;
import org.junit.Test;

/**
 * Created by Damien on 28/05/2015.
 */
public class ContextManagerTest extends BaseKissTest {

    @Test
    public void testCreateContext() {
        ContextManager.createContext("Home", "Home");
    }

}
