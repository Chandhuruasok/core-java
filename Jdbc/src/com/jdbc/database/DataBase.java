package com.jdbc.database;

import java.sql.*;

public class DataBase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();
        System.out.println(connection);
        update();
        delete();
        insert();
        //alter();
    }
    
        public static Connection getConnection() throws ClassNotFoundException, SQLException{
            
            Class .forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegeappmanagement","root","Aspcfamily@1");
            
            return connection;
        }
        public static void update() throws ClassNotFoundException,SQLException
        {
        	Connection connection=getConnection();
        	String query="update collegeapp set student_name='chandhuru' where roll_no=1"; 
        	PreparedStatement prepare=connection.prepareStatement(query);
        	System.out.println("Updated Successfully");
        	prepare.execute();
        	connection.close();
        }
        public static void delete() throws ClassNotFoundException,SQLException
        {
        	Connection connection=getConnection();
        	String query="delete from collegeapp where roll_no=4"; 
        	PreparedStatement prepare=connection.prepareStatement(query);
        	System.out.println("deleted Successfully");
        	prepare.execute();
        	connection.close();
        }
        public static void insert() throws ClassNotFoundException,SQLException
        {
        	Connection connection=getConnection();
        	String query="insert into collegeapp(roll_no,student_name,attendance_percent,fees_paid) values(4,'shaw',65,90000)"; 
        	PreparedStatement prepare=connection.prepareStatement(query);
        	String query1="insert into collegeapp(roll_no,student_name,attendance_percent,fees_paid) values(5,'root',95,10000)"; 
        	PreparedStatement prepare1=connection.prepareStatement(query1);
        	System.out.println("inserted Successfully");
        	prepare.execute();
        	prepare.execute();
        	connection.close();
        }
        public static void alter() throws ClassNotFoundException,SQLException
        {
        	Connection connection=getConnection();
        	String query="alter table collegeapp add location varchar(50)"; 
        	PreparedStatement prepare=connection.prepareStatement(query);
        	System.out.println("altered Successfully");
        	prepare.execute();
        	connection.close();
        }
}
