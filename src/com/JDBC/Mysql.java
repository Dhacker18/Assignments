package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Mysql {
	

		final private static String hostName = "localhost";
		final private static String userName = "root";
		final private static String password = "Jaishreeram@7878";

		public static void main(String[] args) {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection(
						"jdbc:mysql://" + hostName + "/seminar?" + "user=" + userName + "&password=" + password);
				Statement statement = connection.createStatement();

				ResultSet resultset = statement.executeQuery("SELECT * FROM dhacker.dairymilk");
				while (resultset.next()) {
					String firstName = resultset.getString("first_name");
					String lastName = resultset.getString("last_name");
					
					System.out.println("Name:" + firstName + lastName);
					
				
				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

