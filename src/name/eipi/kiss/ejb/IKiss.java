package name.eipi.kiss.ejb;

import javax.ejb.Local;

/**
 * Created by Damien on 28/05/2015.
 */
@Local
public interface IKiss {

    void createContext(final String name, final String description);

}
