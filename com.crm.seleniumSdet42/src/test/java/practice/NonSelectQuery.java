package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class NonSelectQuery {

	 

		public static void main(String[] args) throws Throwable  {
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_yantra","root","root");
			Statement stat = con.createStatement();
			String query = "insert into student(first_name,last_name,address)values('raju','Bn','India')";
			
			int result=stat.executeUpdate(query);
			
			
			if(result==1){
				System.out.println("user is created");
			}
			else {
				System.out.println("user is not created");
			}
	}

}
