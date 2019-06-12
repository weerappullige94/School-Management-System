package university_of_nsbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBOperation2 {

    String url = "jdbc:mysql://localhost:3306/university_of_nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    boolean addppeople(Pregistration_form prf) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "INSERT INTO postgraduate_registration_form VALUES (?,?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, prf.getRegID());//add values to the sql query 
            pst.setString(2, prf.getFullName());//add values to the sql query
            pst.setString(3, prf.getGender());//add values to the sql query
            pst.setString(4, prf.getEmail());//add values to the sql query
            pst.setString(5, prf.getNic());//add values to the sql query
            pst.setString(6, prf.getAddress());//add values to the sql query
            pst.setString(7, prf.getYear());//add values to the sql query
            pst.setString(8, prf.getClassName());//add values to the sql query
            pst.setString(9, prf.getDegreeType());//add values to the sql query
            pst.setString(10, prf.getInstitute());//add values to the sql query

            pst.executeUpdate();//execute the sql query and insert the value to the db table

            return true;

        } catch (Exception e) {
            System.out.print(e);
            return false;
        } finally {
            try {
                if (pst != null) {
                    pst.close();

                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }

        }

    }

    ArrayList<Pregistration_form> getPregistration_form(){

    
        try{
            
            ArrayList<Pregistration_form> List = new ArrayList<Pregistration_form>();
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT * FROM postgraduate_registration_form";
            pst = (PreparedStatement)con.prepareStatement(query);
            rs = pst.executeQuery();
            
            while(rs.next()){
                Pregistration_form prf = new Pregistration_form();
                
                prf.setRegID(rs.getInt(1));
                prf.setFullName(rs.getString(2));
                prf.setGender(rs.getString(3));
                prf.setEmail(rs.getString(4));
                prf.setNic(rs.getString(5));
                prf.setAddress(rs.getString(6));
                prf.setYear(rs.getString(7));
                prf.setClassName(rs.getString(8));
                prf.setDegreeType(rs.getString(9));
                prf.setInstitute(rs.getString(10));
                
                List.add(prf);
                
            }
            
            return List;

        }catch(Exception e){
            System.out.print(e);
            return null;
            
        } finally {
            try {
            if (pst != null) {
                pst.close();

            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
        }

    }
    }
    
    public boolean updateppeople(Pregistration_form prf){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE postgraduate_registration_form SET fullname='"+prf.getFullName()+"',gender='"+prf.getGender()+"',email='"+prf.getEmail()+"',nic='"+prf.getEmail()+"',address='"+prf.getAddress()+"',year='"+prf.getYear()+"',class='"+prf.getClassName()+"',degreetype='"+prf.getDegreeType()+"',institute='"+prf.getInstitute();
            pst = (PreparedStatement)con.prepareStatement(query);
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.print(e);
            return false;
            
        } finally {
            try {
            if (pst != null) {
                pst.close();

            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
        }

    }
    }
    
    public boolean deleteppeople(Pregistration_form prf){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "DELETE FROM postgraduate_registration_form WHERE regid="+prf.getRegID();
            pst = (PreparedStatement)con.prepareStatement(query);
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.print(e);
            return false;
            
        } finally {
            try {
            if (pst != null) {
                pst.close();

            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
        }

    }
    }

}
