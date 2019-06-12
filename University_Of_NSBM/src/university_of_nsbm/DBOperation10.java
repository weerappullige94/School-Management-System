
package university_of_nsbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DBOperation10 {
    
    String url = "jdbc:mysql://localhost:3306/university_of_nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    boolean addpassignment(P_Assignment_details pad){
        try{
        con = (Connection)DriverManager.getConnection(url,username, password);//get the connection
        String query = "INSERT INTO passignment_details VALUES (?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement)con.prepareStatement(query);
        
        pst.setInt(1,pad.getRegID());//add values to the sql query
        pst.setString(2,pad.getFullName());//add values to the sql query
        pst.setString(3,pad.getYear());//add values to the sql query
        pst.setString(4,pad.getFacalty());//add values to the sql query
        pst.setString(5,pad.getSubject());//add values to the sql query
        pst.setString(6,pad.getCode());//add values to the sql query
        pst.setString(7,pad.getAssignmentNo());//add values to the sql query
        pst.setString(8,pad.getGrade());//add values to the sql query
        pst.setString(9,pad.getEmail());//add values to the sql query
        
        pst.executeUpdate();//execute the sql query and insert the value to the db table
        return true;
        
        }catch(Exception e){
            System.out.print(e);
            return false;
        }finally{
            try{
            if(pst != null){
                pst.close();
            }
            if(con !=null){
                con.close();
            }
            }catch(Exception e){}
        }
    }
    
    ArrayList<P_Assignment_details>getP_Assignment_details(){
        try{
            ArrayList<P_Assignment_details> List = new ArrayList<P_Assignment_details>();
            con = (Connection)DriverManager.getConnection(url,username, password);//get the connection
            String query = "SELECT * FROM passignment_details";
            pst = (PreparedStatement)con.prepareStatement(query);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                P_Assignment_details pad = new P_Assignment_details();
                
                pad.setRegID(rs.getInt(1));
                pad.setFullName(rs.getString(2));
                pad.setYear(rs.getString(3));
                pad.setFacalty(rs.getString(4));
                pad.setSubject(rs.getString(5));
                pad.setCode(rs.getString(6));
                pad.setAssignmentNo(rs.getString(7));
                pad.setGrade(rs.getString(8));
                pad.setEmail(rs.getString(9));
                
                List.add(pad);
            }
            return List;
        }catch(Exception e){
            System.out.print(e);
            return null;
        }finally{
            try{
            if(pst != null){
                pst.close();
            }
            if(con !=null){
                con.close();
            }
            }catch(Exception e){}
        }
    }
    
    public boolean deletepassignment(P_Assignment_details pad){
        try{
            con = (Connection)DriverManager.getConnection(url,username, password);//get the connection
            String query = "DELETE FROM passignment_details WHERE regid="+pad.getRegID();
            pst = (PreparedStatement)con.prepareStatement(query);
            
            pst.executeUpdate();
            return true;
            
        }catch(Exception e){
            System.out.print(e);
            return false;
        }finally{
            try{
            if(pst != null){
                pst.close();
            }
            if(con !=null){
                con.close();
            }
            }catch(Exception e){}
        }
    }
    
}
