package com.nikhil.hibernate.services;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;


import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.web.multipart.MultipartFile;

import com.nikhil.hibernate.Factory.DAOFactory;
import com.nikhil.hibernate.POJO.FileUpload;

public class FileServices {
	SessionFactory session_Factory =null;
	Session session=null;

	public void upload(String fileName,MultipartFile file) {
		System.out.println("upload method is called");
		DAOFactory factory = new DAOFactory();
		Session session = factory.getInstance();
		FileUpload fileupload = new FileUpload();
		fileupload.setFileName(fileName);
		MultipartFile savedFile;
		
		    byte[] bytes = null;
			try {
				bytes = file.getBytes();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    Blob blob = null;
			try {
				blob = new javax.sql.rowset.serial.SerialBlob(bytes);
			} catch (SerialException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

		 
		//Save method will be call here 
		fileupload.setFile(blob);
		Transaction tx = session.beginTransaction(); 
		session.save(fileupload);
		tx.commit();
	}

}
