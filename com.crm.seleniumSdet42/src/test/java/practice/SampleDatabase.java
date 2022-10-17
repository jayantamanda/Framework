package practice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class SampleDatabase {

	public static void main(String[] args) throws Throwable  {
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_yantra","root","root");
		Statement stat = con.createStatement();
		String query = "select * from student";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		}
		con.close();
	}

}
