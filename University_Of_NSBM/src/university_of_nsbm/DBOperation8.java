
package university_of_nsbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DBOperation8 {
    String url = "jdbc:mysql://localhost:3306/university_of_nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    boolean addicourse(IC_registration_form icrf){
        try{
        con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
        String query = "INSERT INTO icourse_registration_form VALUES (?,?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement)con.prepareStatement(query);
        
        pst.setInt(1,icrf.getRegID());//add values to the sql query
        pst.setString(2,icrf.getFullName());//add values to the sql query
        pst.setString(3,icrf.getSubject());//add values to the sql query
        pst.setString(4,icrf.getCode());//add values to the sql query
        pst.setString(5,icrf.getYear());//add values to the sql query
        pst.setString(6,icrf.getSemester());//add values to the sql query
        pst.setString(7,icrf.getFacalty());//add values to the sql query
        pst.setString(8,icrf.getDate());//add values to the sql query
        pst.setString(9,icrf.getTime());//add values to the sql query
        pst.setString(10,icrf.getTime());//add values to the sql query
        
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
    
    ArrayList<IC_registration_form> getIC_registration_form(){
        try{
            ArrayList<IC_registration_form> List = new ArrayList<IC_registration_form>();
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "SELECT * FROM icourse_registration_form";
            pst = (PreparedStatement)con.prepareStatement(query);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                IC_registration_form icrf = new IC_registration_form();
                
                icrf.setRegID(rs.getInt(1));
                icrf.setFullName(rs.getString(2));
                icrf.setSubject(rs.getString(3));
                icrf.setCode(rs.getString(4));
                icrf.setYear(rs.getString(5));
                icrf.setSemester(rs.getString(6));
                icrf.setFacalty(rs.getString(7));
                icrf.setDate(rs.getString(8));
                icrf.setTime(rs.getString(9));
                icrf.setVenue(rs.getString(10));
                
                List.add(icrf);
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
    
    public boolean updateicourse(IC_registration_form icrf){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "UPDATE icourse_registration_form SET fullname='"+icrf.getFullName()+"',subject='"+icrf.getSubject()+"',code='"+icrf.getCode()+"',year='"+icrf.getYear()+"',facalty='"+icrf.getFacalty()+"',date='"+icrf.getDate()+"',time='"+icrf.getTime()+"',venue='"+icrf.getVenue()+"' WHERE regid="+icrf.getRegID();
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
   
    public boolean deleteicourse(IC_registration_form icrf){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "DELETE FROM icourse_registration_form WHERE regid="+icrf.getRegID();
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
