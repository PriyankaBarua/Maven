package com.lti.finance.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.finance.entity.Register;

@Repository
public class VerificationDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public void add(Register  v) {
		entityManager.merge(v);
}
	public void updateDocumentStatus(int userId,boolean document_status) {
		Register v = entityManager.find(Register.class, userId);
		v.setDocument_status(document_status);
		entityManager.merge(v);
	}
		public void updateFeeStatus(int userId,boolean fee_status) {
			Register v = entityManager.find(Register.class, userId);
			v.setFee_status(fee_status);
			entityManager.merge(v);
		}
	}