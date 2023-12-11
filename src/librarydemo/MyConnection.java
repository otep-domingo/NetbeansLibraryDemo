/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarydemo;

/**
 *
 * @author joseph
 */
public class MyConnection {
    private  String dbUsername = "root";
    private final String dbPass="dev123sql$%^";
    private final String dbName="demolibrary";
    private final String dbConnection = "jdbc:mySql://localhost/";
    
    public String getDatabaseUsername(){
        return dbUsername;
    }
    
    public String getDatabasePassword(){ 
        return dbPass;
    }
    
    public String getDatabase(){
        return dbName;
    }
    
    public String getConnection(){
        return dbConnection;
    }
    public void setDatabaseUsername(String value){
        dbUsername = value;
    }
}
