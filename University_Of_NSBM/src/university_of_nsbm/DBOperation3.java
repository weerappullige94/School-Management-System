
package university_of_nsbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DBOperation3 {
    
    String url = "jdbc:mysql://localhost:3306/university_of_nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
   boolean addlpeople(Lregistration_form lrf){
       try{
       con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
       String query = "INSERT INTO lecturer_registration_form VALUES (?,?,?,?,?,?,?)";
       pst = (PreparedStatement)con.prepareStatement(query);
       
       pst.setInt(1,lrf.getRegID());//add values to the sql query
       pst.setString(2,lrf.getFullName());//add values to the sql query
       pst.setString(3,lrf.getGender());//add values to the sql query
       pst.setString(4,lrf.getEmail());//add values to the sql query
       pst.setString(5,lrf.getNic());//add values to the sql query
       pst.setString(6,lrf.getAddress());//add values to the sql query
       pst.setString(7,lrf.getDegreeType());//add values to the sql query
       
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
   
   ArrayList<Lregistration_form> getLregistration_form(){
       try{
           ArrayList<Lregistration_form> List = new ArrayList<Lregistration_form>();
           con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
           String query = "SELECT * FROM lecturer_registration_form";
           pst = (PreparedStatement)con.prepareStatement(query);
           
           rs = pst.executeQuery();
           
           while(rs.next()){
               Lregistration_form urf = new Lregistration_form();
               
               urf.setRegID(rs.getInt(1));
               urf.setFullName(rs.getString(2));
               urf.setGender(rs.getString(3));
               urf.setEmail(rs.getString(4));
               urf.setNic(rs.getString(5));
               urf.setAddress(rs.getString(6));
               urf.setDegreeType(rs.getString(7));
               
               List.add(urf);
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
   
   public boolean updatelpeople(Lregistration_form lrf){
       try{
           con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
           String query = "UPDATE lecturer_registration_form SET fullname='"+lrf.getFullName()+"',gender='"+lrf.getGender()+"',email='"+lrf.getEmail()+"',nic='"+lrf.getNic()+"',address='"+lrf.getAddress()+"',degreetype='"+lrf.getDegreeType()+"'WHERE regid="+lrf.getRegID();
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
   
   public boolean deletelpeople(Lregistration_form lrf){
       try{
           con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
           String query = "DELETE FROM lecturer_registration_form WHERE regid="+lrf.getRegID();
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
