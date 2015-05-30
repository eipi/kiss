package name.eipi.kiss.ejb;

import name.eipi.kiss.appservice.ContextManager;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Damien on 28/05/2015.
 */
@Stateless
public class KissBean implements IKiss {

    @PersistenceContext(unitName="KissManagedPersistenceUnit", name="KissManagedPersistenceUnit")
    EntityManager entityManager;

    public void createContext(final String name, final String description) {
        ContextManager.createContext(name, description);
    }

}
