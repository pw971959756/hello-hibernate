package com.test.pw.shibernate.test;

import com.test.pw.shibernate.util.HibernateUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.engine.query.spi.sql.NativeSQLQueryReturn;

import java.util.List;

public class SysUserHQLTestMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

//        自定义查询条件
//        SysUser get1 = (SysUser) session.get(SysUser.class, new Integer(1));
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.baeldung.movie_catalog");

//        HQL
//        SysUser  merge = (SysUser) session.merge(get2);
//        String hql = "from SysUser as su where su.id =:id";
//        Query query = session.createQuery(hql).setParameter("id", 1);
//        SysUser user = (SysUser)query.uniqueResult();
//        System.out.println(user);



//        对象方式
////        Criteria(Student.class); //生成一个Criteria对象cr.add(Restrictions.eq("name", "Bill"));//等价于where name=’Bill’ List list = cr.list(); Student stu = (Student)list.get(0); System.out.println(stu.getName());
//        Criteria cr = session.createCriteria(SysUser.class);
//        cr.add(Restrictions.eq("id", 8));
////        cr.add(Restrictions.like("name", ""));
////        cr.add(Restrictions.like("name", ""));
//        System.out.println("cr.list() = " + JSON.toJSONString(cr.list()));

//        SQL
//        SQLQuery query = session.createSQLQuery("select * from user");
//        List<NativeSQLQueryReturn> queryReturns = query.getQueryReturns();
//        System.out.println("query.list() = " + query.list());

//        MyBatis （MySQL/Oracle）
//        MyBatis SQL 手写
//        对象映射 XML 、 注解

//
//  SQLServer ， MySQL， Oracle， PostgreSQL
//                    Mariadb
//

    }
}
