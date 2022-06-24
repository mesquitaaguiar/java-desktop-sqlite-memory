package br.com.cameag.java.desktop.sqlite.memory;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author Carlos Mesquita Aguiar
 * @date 24/06/2022 
 */
public class DbSingletonSqlite {
    
    private static Connection conn;
    
    private DbSingletonSqlite() {}
    
    public static Statement getInstance(Component component) {
        try {
            Class.forName("org.sqlite.JDBC");
            DbSingletonSqlite.conn = DriverManager.getConnection("jdbc:sqlite::memory:");
            return DbSingletonSqlite.conn.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(component, ex.getMessage());
        }
        return null;
    }
    
    public static void closeConnection(){
        if(DbSingletonSqlite.conn == null){
            try{
                DbSingletonSqlite.conn.close();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }finally{
                DbSingletonSqlite.conn = null;
            }
        }
    }
}
