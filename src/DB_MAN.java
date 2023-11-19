import java.sql.*;
import java.io.*;

public class DB_MAN {
  String strDriver = "sun.jdbc.odbc.jdbcOdbcDriver";
  String strURL = "jdbc:odbc:Automobile64";
  
  Connection DB_con;
  Statement DB_stmt;
  ResultSet DB_rs;
  
  public void dbOpen() throws IOException{
      try{
          Class.forName(strDriver);
          DB_con = DriverManager.getConnection(strURL);
          DB_stmt = DB_con.createStatement();
          
      }catch(Exception e){
          System.out.println("SQLException " + e.getMessage());
      }
  }
  
  public void dbClose() throws IOException{
      try{
          DB_stmt.close();
          DB_con.close();
      }catch(SQLException e){
          System.out.println("SQLException : " + e.getMessage());
      }
  }
}
