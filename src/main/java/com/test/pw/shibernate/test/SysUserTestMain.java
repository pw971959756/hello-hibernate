package com.test.pw.shibernate.test;

import com.alibaba.fastjson.JSON;
import com.test.pw.shibernate.entity.SysUser;
import com.test.pw.shibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.io.Serializable;
import java.sql.Connection;
import java.util.Date;

public class SysUserTestMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
//        session.connection().setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);

//
        SysUser get1 = (SysUser) session.get(SysUser.class, new Integer(1));
        SysUser load1 = (SysUser) session.load(SysUser.class, new Integer(2));

        System.out.println("===============================1 ");
//        session.clear();

        SysUser get2 = (SysUser) session.get(SysUser.class, new Integer(1));
        SysUser load2 = (SysUser) session.load(SysUser.class, new Integer(2));
        System.out.println("===============================2 ");

//        for (int i = 0; i < 10; i++) {
//            SysUser user = new SysUser();
//            user.setUserId(1 + i);
//            user.setUsername("Mukesh :" + i);
//            user.setCreatedBy("Google : " + i);
//            user.setCreatedDate(new Date());
//            session.save(user);
//        }
//
//        session.getTransaction().commit();

        get2.setUsername("张三:" + System.currentTimeMillis());
//        session.persist(get2);
        System.out.println("get2 = " + get2);
//        session.getTransaction().commit();

//        SysUser  merge = (SysUser) session.merge(get2);
//        session.save(merge);
//        session.getTransaction().commit();

//        System.out.println(get2);
//
        get2.setUsername("zhangsan "+System.currentTimeMillis());
        session.refresh(get2);
        session.getTransaction().commit();
//        System.out.println(get2);
//        System.out.println(get2);

//        session.flush();
//        session.getTransaction().rollback();

//        SysUser user = new SysUser();
//        user.setUserId(1);
//        user.setUsername("Mukesh :");
//        user.setCreatedBy("Google : ");
//        user.setCreatedDate(new Date());
//        session.save(user);
//
//
//
//
//        // 浅拷贝
//        SysUser userCopy = user;
//        userCopy.setUsername("Mukesh userCopy: 中国移动");
//        userCopy.setCreatedBy("Google userCopy: 中国联通");
//
//        // 深拷贝
//        SysUser userCp = JSON.parseObject(JSON.toJSONString(user),SysUser.class);
//        userCp.setUsername("Mukesh userCp: 中国移动");
//        userCp.setCreatedBy("Google userCp: 中国联通");

//        刷新是将基础持久性存储与保存在内存中的可持久状态进行同步的过程。它会在正在运行的事务中更新或插入到您的表中，但可能不会提交这些更改。
//        提交数据到事务当中，单并未commit
//        session.flush();



//        重新 主持 ，清理查询,清理上下文
//        session.clear();

//        会强制发送select语句，以使session缓存中对象的状态和数据表中对应的记录保持一致。该方法的有效性需要配置事务的隔离级别为read commited(读已提交)
//        事务隔离级别 read commited(读已提交)
//        session.refresh();


//        通过从传递的对象中获取的ID查找一个实体实例（从持久性上下文中检索一个现有实体实例，或者从数据库中加载一个新实例）；
//        将字段从传递的对象复制到此实例；
//        返回新更新的实例。
//        提交对象到缓存中 / 提交对象到缓存中/ 提交对象到缓存中
////        session.merge();

//        一个短暂的实例变为持久（和操作级联到所有与关系的级联= PERSIST或级联= ALL），
//        如果实例已经是持久性的，则此调用对该特定实例无效（但仍会级联为其与cascade = PERSIST或cascade = ALL的关系），
//        如果实例是分离的，则应在调用此方法或提交或刷新会话时发生异常。
//         提交到内存当中，需要手动commit/提交到内存当中，需要手动commit/提交到内存当中，需要手动commit
//        session.persist();


        // Spring Cloud

        // 数据传输


//        push
//        session.getTransaction().commit();












//  HQL
//        refresh
//        flush
//        clear
//        merge
//        persist




    }
}
