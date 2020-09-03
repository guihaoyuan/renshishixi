package dazuoye.utils;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBCP2utils {
	
	public static DataSource getDataSource() {
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setUrl("jdbc:mysql://localhost:3306/gowhere");
		//这里要改动
		return ds;
	}
}
