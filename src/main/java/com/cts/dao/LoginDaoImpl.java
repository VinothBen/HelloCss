package com.cts.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.LoginDetails;
import com.cts.vo.LoginVo;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;

	public String addLogin(LoginVo loginVo) {

		loginVo.getId();
		List<String> name = new ArrayList<String>();
		LoginDetails loginDetails = new LoginDetails();
		Session session = sessionFactory.openSession();
		try {
			// Query q = sessionFactory.openSession().createSQLQuery(qry);
			// name = q.list();
			loginDetails.setId(loginVo.getId());
			loginDetails.setName(loginVo.getName());
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			Date d = null;
			try {
				d = sdf.parse(loginVo.getStartDate());

			} catch (ParseException e) {
				e.printStackTrace();
			}
			loginDetails.setStartDate(d);
			// sessionFactory.openSession().saveOrUpdate(loginDetails);

			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(loginDetails);
			transaction.commit();
			// sessionFactory.openSession().createSQLQuery("insert into
			// login_details values (" + loginVo.getId() + ","
			// + "'" + loginVo.getName() + "'" + "," + d + ")");

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		String msg = null;
		if (name.isEmpty()) {
			msg = "NoData!!";
		} else {
			msg = "Success!!";
		}
		return msg;
	}

	@SuppressWarnings("unchecked")
	public List<LoginVo> getList(LoginVo loginVo) {

		Session session = sessionFactory.openSession();
		List<LoginVo> list2 = new ArrayList<LoginVo>();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		List<LoginDetails> list = new ArrayList<LoginDetails>();
		Criteria criteria = session.createCriteria(LoginDetails.class);
		try {
			Date d = sdf.parse(loginVo.getStartDate());
			criteria.add(Restrictions.eq("startDate", d ));
			list = criteria.list();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		for (LoginDetails details : list) {

			{
				LoginVo vo = new LoginVo();
				vo.setId(details.getId());
				vo.setName(details.getName());
				String s = String.valueOf(sdf.format(details.getStartDate()));
				vo.setStartDate(s);
				list2.add(vo);
			}

		}

		return list2;
	}

}
