package com.java.designpatterns.creational;

public class SingletonPattern {

	public static void main(String[] args) {
		DBConnection connection1 = DBConnection.getDBConnection();
		System.out.println("Connection Object 1:" + connection1);
		
		DBConnection connection2 = DBConnection.getDBConnection();
		System.out.println("Connection Object 2:" + connection2);

		if (connection1 == connection2) {
			System.out.println("Both the objects are same.");
		}
	}

}

class DBConnection {
	private static DBConnection connection = null;

	private DBConnection() {
		if (connection != null) {
			throw new RuntimeException("Use getDBConnection() to create instance.");
		}
	}
	
	public static final DBConnection getDBConnection() {
		if (connection == null) {
			synchronized (DBConnection.class) {
				if (connection == null) {
					connection = new DBConnection();
				}
			}
			
		}
		
		return connection;
	}
}
