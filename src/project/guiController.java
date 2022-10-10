package project;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javafx.event.ActionEvent;

import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class guiController{
	@FXML
	private Button s;
	@FXML
	private TextArea tv;
	@FXML
	private Button d;
	@FXML
	private Button co;
	@FXML
	private Button g;
	@FXML
	private Button cl;
	@FXML
	private Button q1;
	@FXML
	private Button q2;
	@FXML
	private Button q3;

	// Event Listener on Button[#s].onAction
	@FXML
	public void btn_std(ActionEvent event) throws Exception {
		if(event.getSource()==s)
		{
			String res="";
			String url = "jdbc:mysql://localhost:3306/studentdb";
	        String uname="roy";
	        String pass="1234";
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con=DriverManager.getConnection(url,uname,pass);
	        Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery("select *from student");
	        ResultSetMetaData rsmd =(ResultSetMetaData) rs.getMetaData();
	        int cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+rsmd.getColumnName(i)+"\t\t\t";
	        	}
	        	res=res+"\n\n";
	        	break;
	        }
	        rs=st.executeQuery("select *from student");
	         rsmd =(ResultSetMetaData) rs.getMetaData();
	         cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int j=1;j<=cn;j++)
	        	{
	        		String cv=rs.getString(j);
	        		res=res+cv+"\t\t";
	        	}
	        	res=res+"\n\n";
	        }
	        tv.setText(res);
	        st.close();
	        con.close();
		}

	}
	// Event Listener on Button[#d].onAction
		@FXML
		public void btn_dept(ActionEvent event) throws Exception {
			String res="";
			Conn c = new Conn();
			Connection con=c.getConnection();
			/*Display d = new Display();
			ConsoleOutput o = new ConsoleOutput();
			d.printTable(con,"class",7,6);
			res=o.stop();*/
			Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery("select *from department");
	        ResultSetMetaData rsmd =(ResultSetMetaData) rs.getMetaData();
	        int cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+rsmd.getColumnName(i)+"\t";
	        	}
	        	res=res+"\n\n";
	        	break;
	        }
	        rs=st.executeQuery("select *from department");
	        rsmd =(ResultSetMetaData) rs.getMetaData();
	        cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+cv+"\t\t";
	        	}
	        	res=res+"\n\n";
	        }
	        tv.setText(res);
	        st.close();
			tv.setText(res);
	        con.close();
		}
		@FXML
		public void btn_cou(ActionEvent event)throws Exception {
			String res="";
			Conn c = new Conn();
			Connection con=c.getConnection();
			Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery("select *from course");
	        ResultSetMetaData rsmd =(ResultSetMetaData) rs.getMetaData();
	        int cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+rsmd.getColumnName(i)+"\t\t";
	        	}
	        	res=res+"\n\n";
	        	break;
	        }
	         rs=st.executeQuery("select *from course");
	         rsmd =(ResultSetMetaData) rs.getMetaData();
	         cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+cv+"\t\t\t";
	        	}
	        	res=res+"\n\n";
	        }
	        tv.setText(res);
	        st.close();
	        con.close();
		}
		// Event Listener on Button[#g].onAction
		// Event Listener on Button[#c].onAction
		@FXML
		public void btn_gr (ActionEvent event)throws Exception {
			String res="";
			Conn c = new Conn();
			Connection con=c.getConnection();
			Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery("select *from grade_report");
	        ResultSetMetaData rsmd =(ResultSetMetaData) rs.getMetaData();
	        int cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+rsmd.getColumnName(i)+"\t\t";
	        	}
	        	res=res+"\n\n";
	        	break;
	        }
	        rs=st.executeQuery("select *from grade_report");
	        rsmd =(ResultSetMetaData) rs.getMetaData();
	        cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+cv+"\t\t";
	        	}
	        	res=res+"\n\n";
	        }
	        tv.setText(res);
	        st.close();
	        con.close();
		}
		// Event Listener on Button[#c].onAction
		@FXML
		public void btn_cl(ActionEvent event)throws Exception {
			String res="";
			Conn c = new Conn();
			Connection con=c.getConnection();
			Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery("select *from class");
	        ResultSetMetaData rsmd =(ResultSetMetaData) rs.getMetaData();
	        int cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+rsmd.getColumnName(i)+"\t\t";
	        	}
	        	res=res+"\n\n";
	        	break;
	        }
	        rs=st.executeQuery("select *from class");
	         rsmd =(ResultSetMetaData) rs.getMetaData();
	         cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+cv+"\t\t";
	        	}
	        	res=res+"\n\n";
	        }
	        tv.setText(res);
	        st.close();
	        con.close();
		}
		// Event Listener on Button[#q1].onAction
		@FXML
		public void btn_q1(ActionEvent event)throws Exception {
			String res="";
			Conn c = new Conn();
			Connection con=c.getConnection();
			CallableStatement st = (CallableStatement) con.prepareCall("{call querry1()}");
			st.execute();
			ResultSet rs = st.getResultSet();
			ResultSetMetaData rsmd =(ResultSetMetaData) rs.getMetaData();
	        int cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+rsmd.getColumnName(i)+"\t\t\t";
	        	}
	        	res=res+"\n\n";
	        	break;
	        }
	        st = (CallableStatement) con.prepareCall("{call querry1()}");
			st.execute();
	        rs = st.getResultSet();
			rsmd =(ResultSetMetaData) rs.getMetaData();
	        cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+cv+"\t\t";
	        	}
	        	res=res+"\n\n";
	        }
	        tv.setText(res);
	        st.close();
	        con.close();
		}
		// Event Listener on Button[#q2].onAction
		@FXML
		public void btn_q2(ActionEvent event) throws Exception{
			String res="";
			Conn c = new Conn();
			Connection con=c.getConnection();
			CallableStatement st = (CallableStatement) con.prepareCall("{call querry2()}");
			st.execute();
			ResultSet rs = st.getResultSet();
			ResultSetMetaData rsmd =(ResultSetMetaData) rs.getMetaData();
	        int cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+rsmd.getColumnName(i)+"\t\t";
	        	}
	        	res=res+"\n\n";
	        	break;
	        }
	        st = (CallableStatement) con.prepareCall("{call querry2()}");
			st.execute();
	        rs = st.getResultSet();
			rsmd =(ResultSetMetaData) rs.getMetaData();
	        cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+cv+"\t\t";
	        	}
	        	res=res+"\n\n";
	        }
	        tv.setText(res);
	        st.close();
	        con.close();
		}
		// Event Listener on Button[#q3].onAction
		@FXML
		public void btn_q3 (ActionEvent event)throws Exception {
			String res="";
			Conn c = new Conn();
			Connection con=c.getConnection();
			CallableStatement st = (CallableStatement) con.prepareCall("{call querry3()}");
			st.execute();
			ResultSet rs = st.getResultSet();
			ResultSetMetaData rsmd =(ResultSetMetaData) rs.getMetaData();
	        int cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+rsmd.getColumnName(i)+"\t\t";
	        	}
	        	res=res+"\n\n";
	        	break;
	        }
	        st = (CallableStatement) con.prepareCall("{call querry3()}");
			st.execute();
	        rs = st.getResultSet();
			rsmd =(ResultSetMetaData) rs.getMetaData();
	        cn=rsmd.getColumnCount();
	        while(rs.next())
	        {
	        	for(int i=1;i<=cn;i++)
	        	{
	        		String cv=rs.getString(i);
	        		res=res+cv+"\t\t";
	        	}
	        	res=res+"\n\n";
	        }
	        tv.setText(res);
	        st.close();
	        con.close();
		}
}
