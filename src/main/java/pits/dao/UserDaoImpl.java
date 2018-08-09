package pits.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pits.model.User;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public List<User> getUser() {

        Session session = this.sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> criteria = builder.createQuery(User.class);
        List<User> users = session.createQuery(criteria).getResultList();
        session.close();

        return users;
    }

    public User findUserByEmail(String email) {
        User userDetails = null;
        Criteria criteria = sessionFactory.openSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("email", email));
        List<User> entityList = criteria.list();
        if (!entityList.isEmpty()) {
            userDetails = entityList.get(0);
        }
        return userDetails;
    }

}
