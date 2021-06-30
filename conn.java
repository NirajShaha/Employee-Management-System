package EMPLOYEE;
import java.sql.*;

public class conn {
    public Connection c; /*setups connection with mysql*/
    public Statement s; /*executes all the quries of Mysql*/
    /*contructer created*/
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");/*registered the drivers of Mysql with help of forName*/
                    c=DriverManager.getConnection("jdbc:mysql://localhost:3306/emsystem","root","");
                    s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
