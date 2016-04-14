import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.stat.SessionStatistics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Alexander on 12.04.2016.
 */
public class Runner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate-tricks");
        EntityManager entityManager = entityManagerFactory.createEntityManager();



        SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
        Session session = sessionFactory.openSession();

        sessionFactory.getStatistics();

        SessionStatistics statistics = session.getStatistics();
        statistics.getCollectionCount();

        entityManager.close();
        entityManagerFactory.close();
    }
}
