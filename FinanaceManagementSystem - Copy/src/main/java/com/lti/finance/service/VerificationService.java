package com.lti.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finance.dao.VerificationDAO;


@Service
@Transactional
public class VerificationService {

			@Autowired
			private VerificationDAO verificationDao;
			
			public void updateDocumentStatus(int userId,boolean document_status) {
				
				verificationDao.updateDocumentStatus(userId,document_status);
			}
			public void updateFeeStatus(int userId,boolean fee_status) {
				
				verificationDao.updateFeeStatus(userId,fee_status);
			}
}
