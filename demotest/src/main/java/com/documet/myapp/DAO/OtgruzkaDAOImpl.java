package com.documet.myapp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.documet.myapp.otgruzka.Document;

public class OtgruzkaDAOImpl implements OtgruzkaDAO {
	
    @Autowired
    private EntityManager entityManager;

	@Override
	public List<Document> getDocuments() {

		Query q = entityManager.createNativeQuery("SELECT * FROM SPRORDERSOUTINV (621,'09.05.2016','09.05.2016',0,Null,0) where OUTCOMEINVOICEIDSSET = 5991581", Document.class);
		List<Document> docs =(List<Document>) q.getResultList();
		return docs;
	
	}

}
