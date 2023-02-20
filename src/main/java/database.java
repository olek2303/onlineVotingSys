
import java.sql.*;

public class database {
    static final String DB_URL = "jdbc:mysql://localhost:3306/voting";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        // Open a connection
        //create();
        //createTable();
        registerUser("11@gmail.com", "hablahablahask123");
        giveVote("11@gmail.com", 2);
    }
    public static void registerUser(String mail, String password) {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //sprawdzenie czy jest taki mail
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "select * from votes where mail = " + "'" + mail + "'";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()) {
                throw new SQLException("jest juz taki rekord");
            }

            String sql1 = "INSERT INTO Votes (mail, password) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql1);
            ps.setString(1, mail);
            ps.setString(2, password);
            ps.executeUpdate();
            System.out.println("User registered...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void giveVote(String mail, int v) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "UPDATE Votes " + "SET vote = 1 WHERE mail = " + "'" + mail + "'";
            stmt.executeUpdate(sql);
            System.out.println("Update made correctly");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void create() {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "CREATE DATABASE VOTING";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable() {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE USERS" +
                    "(id INTEGER not NULL, " +
                    " mail VARCHAR(255), " +
                    " password VARCHAR(255), " +
                    " PRIMARY KEY ( id )), " +
                    "UNIQUE KEY `mail` (`mail`)";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
