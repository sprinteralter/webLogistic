/*package com.documet.myapp.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.documet.myapp.otgruzka.Document;



public class SPRORDERSOUTINVDET {

//private JdbcTemplate jdbcTemplate = null;
	
	@Autowired
	private EntityManager entityManager;
	
	public void getData(){	
		final String query = "select * from SPRORDERSOUTINV (621,'09.05.2016','09.05.2016',0,Null,0) where OUTCOMEINVOICEIDSSET = 5991581";
		List<Document> reestr= entityManager.createQuery(query, Document.class).getResultList();
		System.out.println(reestr.size()+ " SIZEEEEEEEEEEEEEEEE");
	}
	
}
*/