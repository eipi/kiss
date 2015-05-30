package name.eipi.kiss.persistence;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Damien on 28/05/2015.
 */
public class KissDao {

    public enum Mode {
        Standalone, Container
    }

    private static Mode MODE = Mode.Standalone;

    public static void setMode (Mode mode) {
        MODE = mode;
    }

    private static EntityManagerFactory emf = null;

    private static EntityManager em = null;

    public static void setEntityManager(final EntityManager entityManager) {
        em = entityManager;
    }

    public static EntityManager getEntityManager() {
        if (MODE.equals(Mode.Container)) {
            try {
                InitialContext initCtx = new InitialContext();
                javax.persistence.EntityManager entityManager =
                    (javax.persistence.EntityManager)initCtx.lookup("java:comp/env/KissManagedPersistenceUnit");
                return entityManager;
            } catch(NamingException nEx) {
                System.err.println(nEx.getMessage());
            }

        } else if (MODE.equals(Mode.Standalone)) {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("KissLocalPersistenceUnit");
            }
            if (em == null) {
                em = emf.createEntityManager();
            }
            return em;
        }
        System.err.println("Config error -> KissDao mode not set.");
        return null;
    }

}
