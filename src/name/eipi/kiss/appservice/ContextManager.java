package name.eipi.kiss.appservice;

import name.eipi.kiss.entity.ContextEntity;
import name.eipi.kiss.persistence.KissDao;


/**
 * Created by Damien on 28/05/2015.
 */
public class ContextManager {

    public static void createContext(final String name, final String description) {

        ContextEntity contextEntity = new ContextEntity();
        contextEntity.setName(name);
        contextEntity.setDescription(description);
        KissDao.getEntityManager().persist(contextEntity);

    }

}
