
package university_of_nsbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DBOperation7 {
    
    String url = "jdbc:mysql://localhost:3306/university_of_nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    boolean addlcourse(LC_registration_form lcrf){
        try{
        con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
        String query = "INSERT INTO lcourse_registration_form VALUES(?,?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement)con.prepareStatement(query);
        
        
        pst.setInt(1,lcrf.getRegID());//add values to the sql query
        pst.setString(2,lcrf.getFullName());//add values to the sql query
        pst.setString(3,lcrf.getSubject());//add values to the sql query
        pst.setString(4,lcrf.getCode());//add values to the sql query
        pst.setString(5,lcrf.getYear());//add values to the sql query
        pst.setString(6,lcrf.getSemester());//add values to the sql query
        pst.setString(7,lcrf.getFacalty());//add values to the sql query
        pst.setString(8,lcrf.getDate());//add values to the sql query
        pst.setString(9,lcrf.getTime());//add values to the sql query
        pst.setString(10,lcrf.getVenue());//add values to the sql query
        
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
    
    ArrayList<LC_registration_form> getLC_registration_form(){
        try{
            ArrayList<LC_registration_form> List = new ArrayList<LC_registration_form>();
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "SELECT * FROM lcourse_registration_form";
            pst = (PreparedStatement)con.prepareStatement(query);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                LC_registration_form lcrf = new LC_registration_form();
                
                lcrf.setRegID(rs.getInt(1));
                lcrf.setFullName(rs.getString(2));
                lcrf.setSubject(rs.getString(3));
                lcrf.setCode(rs.getString(4));
                lcrf.setYear(rs.getString(5));
                lcrf.setSemester(rs.getString(6));
                lcrf.setFacalty(rs.getString(7));
                lcrf.setDate(rs.getString(8));
                lcrf.setTime(rs.getString(9));
                lcrf.setVenue(rs.getString(10));
                
                List.add(lcrf);
                
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
    
    public boolean updatelcourse(LC_registration_form lcrf){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "UPDATE lcourse_registration_form SET fullname='"+lcrf.getFullName()+"',subject='"+lcrf.getSubject()+"',code='"+lcrf.getCode()+"',year='"+lcrf.getYear()+"',facalty='"+lcrf.getFacalty()+"',date='"+lcrf.getDate()+"',time='"+lcrf.getTime()+"',venue='"+lcrf.getVenue()+"' WHERE regid="+lcrf.getRegID();
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
    
    public boolean deletelcourse(LC_registration_form lcrf){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "DELETE FROM lcourse_registration_form WHERE regid="+lcrf.getRegID();
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
