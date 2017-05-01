package com.fanye.util;

import java.sql.Connection;
import java.sql.DriverManager;


/*
 * ���ݿ⹤����
 */
public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/db_book";
	private String dbUserName="root";
	private String dbPassWord="123456";
	private String jdbcName="com.mysql.jdbc.Driver";
	
	
	/*
	 * ��ȡ���ݿ�����
	 */
	public Connection getCon() throws Exception{
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl, dbUserName, dbPassWord);
		return con;
	}
	
	
	/**
	 * �ر����ݿ�����
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con) throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("���ݿ����ӳɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
	}
}
