package name.eipi.kiss;

import name.eipi.kiss.persistence.KissDao;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * Created by Damien on 28/05/2015.
 */
public abstract class BaseKissTest {

    private static EntityManager em = null;
    private static EntityTransaction txn = null;

    @BeforeClass
    public static void initPersistence() {
        KissDao.setMode(KissDao.Mode.Standalone);
        em = KissDao.getEntityManager();
        KissDao.setEntityManager(em);
        txn = em.getTransaction();
        txn.begin();
    }

    @AfterClass
    public static void exitPersistence() {
        em.flush();
        txn.commit();
        em.close();

    }



}
