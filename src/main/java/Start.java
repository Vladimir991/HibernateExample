import org.hibernate.SessionFactory;

/**
 * Created by Vladimir Glinskikh on 04.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Start {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    }
}
