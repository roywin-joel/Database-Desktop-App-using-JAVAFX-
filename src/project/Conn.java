package project;

import java.sql.*;
import java.util.*;

public class Conn {
	public Connection getConnection() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/studentdb";
        String uname="roy";
        String pass="1234";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);
        return con;
	}

}
