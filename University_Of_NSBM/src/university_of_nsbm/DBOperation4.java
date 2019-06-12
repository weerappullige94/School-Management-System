
package university_of_nsbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DBOperation4 {
    
    String url = "jdbc:mysql://localhost:3306/university_of_nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    boolean addipeople(Iregistration_form irf){
        try{
        con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
        String query = "INSERT INTO instructor_registration_form VALUES (?,?,?,?,?,?,?)";
        pst = (PreparedStatement)con.prepareStatement(query);
        
        pst.setInt(1,irf.getRegID());//add values to the sql query
        pst.setString(2,irf.getFullName());//add values to the sql query
        pst.setString(3,irf.getGender());//add values to the sql query
        pst.setString(4,irf.getEmail());//add values to the sql query
        pst.setString(5,irf.getNic());//add values to the sql query
        pst.setString(6,irf.getAddress());//add values to the sql query
        pst.setString(7,irf.getDegreeType());//add values to the sql query
        
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
                pst.close();
            }
            }catch(Exception e){}
        
        }
        
    
    }
    
    ArrayList<Iregistration_form> getIregistration_form(){
        try{
            
            ArrayList<Iregistration_form> List = new ArrayList<Iregistration_form>();
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "SELECT * FROM instructor_registration_form";
            pst = (PreparedStatement)con.prepareStatement(query);
            
            rs = pst.executeQuery();
            while(rs.next()){
                Iregistration_form irf = new Iregistration_form();
                
                irf.setRegID(rs.getInt(1));
                irf.setFullName(rs.getString(2));
                irf.setGender(rs.getString(3));
                irf.setEmail(rs.getString(4));
                irf.setNic(rs.getString(5));
                irf.setAddress(rs.getString(6));
                irf.setDegreeType(rs.getString(7));
                
                List.add(irf);
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
                    pst.close();
                }
                }catch(Exception e){}
            }
    }
    
    public boolean updateipeople(Iregistration_form irf){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "UPDATE instructor_registration_form SET fullname='"+irf.getFullName()+"',gender='"+irf.getGender()+"',email='"+irf.getEmail()+"',nic='"+irf.getNic()+"',address='"+irf.getAddress()+"',degreetype='"+irf.getDegreeType()+"' WHERE regid="+irf.getRegID();
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
                    pst.close();
                }
                }catch(Exception e){}
            }
    } 
    
    public boolean deleteipeople(Iregistration_form irf){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "DELETE FROM instructor_registration_form WHERE regid="+irf.getRegID();
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
                    pst.close();
                }
                }catch(Exception e){}
            }
    }
}
