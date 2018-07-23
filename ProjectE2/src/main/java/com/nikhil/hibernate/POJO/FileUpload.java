package com.nikhil.hibernate.POJO;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "FILES_UPLOAD")
public class FileUpload {
	@Id
	@Column(name="fileName")
	    private String fileName;
	@Column(name="file")
	    private Blob file;
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public Blob getFile() {
			return file;
		}
		public void setFile(Blob file) {
			this.file = file;
		}
	   
	}

