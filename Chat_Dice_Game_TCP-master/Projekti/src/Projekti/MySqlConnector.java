package Projekti;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class MySqlConnector {
    
 Connection conn = null;


	public static Connection connectFiekDb(String server)
	{
		try
		{
			//perdoret per marrjen e Driverit per lidhje
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://"+server+":3306/dbSisteme?&autoReconnect=true&useSSL=false","root","root");
			return conn;
		}
		catch (Exception se)
		{
			JOptionPane.showMessageDialog(null, "Errori :" + se.getMessage());
		
		return null; }
		
		
	}

	}
