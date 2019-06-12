
package university_of_nsbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DBOperation9 {
    
    String url = "jdbc:mysql://localhost:3306/university_of_nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    boolean adduassignment(U_Assignment_details uad){
        try{
        con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
        String query ="INSERT INTO uassignment_details VALUES (?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement)con.prepareStatement(query);
        
        pst.setInt(1,uad.getRegID());//add values to the sql query
        pst.setString(2,uad.getFullName());//add values to the sql query
        pst.setString(3,uad.getYear());//add values to the sql query
        pst.setString(4,uad.getFacalty());//add values to the sql query
        pst.setString(5,uad.getSubject());//add values to the sql query
        pst.setString(6,uad.getCode());//add values to the sql query
        pst.setString(7,uad.getAssignmentNo());//add values to the sql query
        pst.setString(8,uad.getGrade());//add values to the sql query
        pst.setString(9,uad.getEmail());//add values to the sql query
        
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
            if(con != null){
                con.close();
            }
            }catch(Exception e){}
        }
        
        
        
    }
    
    ArrayList<U_Assignment_details>getU_Assignment_details(){
        try{
            ArrayList<U_Assignment_details> List = new ArrayList<U_Assignment_details>();
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query ="SELECT * FROM uassignment_details";
            pst = (PreparedStatement)con.prepareStatement(query);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                U_Assignment_details uad = new U_Assignment_details();
                
                uad.setRegID(rs.getInt(1));
                uad.setFullName(rs.getString(2));
                uad.setYear(rs.getString(3));
                uad.setFacalty(rs.getString(4));
                uad.setSubject(rs.getString(5));
                uad.setCode(rs.getString(6));
                uad.setAssignmentNo(rs.getString(7));
                uad.setGrade(rs.getString(8));
                uad.setEmail(rs.getString(9));
                
                List.add(uad);
                
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
            if(con != null){
                con.close();
            }
            }catch(Exception e){}
        }
    }
    
    public boolean updateuassignment(U_Assignment_details uad){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query ="UPDATE uassignment_details SET fullname='"+uad.getFullName()+"',year='"+uad.getYear()+"',facalty='"+uad.getFacalty()+"',subject='"+uad.getSubject()+"',code='"+uad.getCode()+"',assignmentcode='"+uad.getAssignmentNo()+"',grade='"+uad.getGrade()+"',email='"+uad.getEmail()+"' WHERE regid="+uad.getRegID();
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
            if(con != null){
                con.close();
            }
            }catch(Exception e){}
        }
    }
    
    public boolean deleteuassignment(U_Assignment_details uad){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query ="DELETE FROM uassignment_details WHERE regid="+uad.getRegID();
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
            if(con != null){
                con.close();
            }
            }catch(Exception e){}
        }
    }
}
