import model.Product;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Vladimir Glinskikh on 04.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Start {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Object> products = null;
        try {
            session.beginTransaction();

            SQLQuery query = session.createSQLQuery("SELECT * FROM product");
            query.addEntity(Product.class);
            products = query.list();

            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
        for (Iterator iterator = products.iterator();
             iterator.hasNext(); ) {
            Product product = (Product) iterator.next();
            System.out.println(product.toString());
        }
    }
}
