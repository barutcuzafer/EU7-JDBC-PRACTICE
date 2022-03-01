package jdbctests;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String dbUrl="jdbc:oracle:thin:@3.87.216.93:1521:xe";
        String dbUsername="hr";
        String dbPassword="hr";

        //create connection
        Connection connection= DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
        //statement object
        Statement statement=connection.createStatement();
        //run query and get the result in result set object
      //  ResultSet resultSet= statement.executeQuery("Select * from regions");
       // ResultSet resultSet= statement.executeQuery("Select first_name,last_name,salary from employees");
        ResultSet resultSet= statement.executeQuery("Select * from departments");

        //move pointer to first row--in default it is pointing null/header
    /*   for (int i = 1; i <= 4; i++) {
            resultSet.next();
            System.out.println(resultSet.getInt("region_id")+"-"+resultSet.getString("region_name"));
           System.out.println(resultSet.getInt(1));
       }

     */

/*
        resultSet.next();
        System.out.println(resultSet.getString("region_name"));
        resultSet.next();
        System.out.println(resultSet.getString(2));

 */
        while(resultSet.next()){
            System.out.println(resultSet.getString(1) + "-" + resultSet.getString(2)+ "-" +resultSet.getString(3)+ "-" +resultSet.getString(4));
        }


        //close all connections in reverse order
        resultSet.close();
        statement.close();
        connection.close();


    }
}
