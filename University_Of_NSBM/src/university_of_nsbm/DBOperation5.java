
package university_of_nsbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DBOperation5 {
    
    String url = "jdbc:mysql://localhost:3306/university_of_nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    boolean adducourse(UC_registration_form ucrf){
        try{
        con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
        String query = "INSERT INTO ucourse_registration_form VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement)con.prepareStatement(query);
        
        pst.setInt(1,ucrf.getRegID());//add values to the sql query
        pst.setString(2,ucrf.getFullName());//add values to the sql query
        pst.setString(3,ucrf.getSubject1());//add values to the sql query
        pst.setString(4,ucrf.getSubject2());//add values to the sql query
        pst.setString(5,ucrf.getSubject3());//add values to the sql query
        pst.setString(6,ucrf.getSubject4());//add values to the sql query
        pst.setString(7,ucrf.getCode1());//add values to the sql query
        pst.setString(8,ucrf.getCode2());//add values to the sql query
        pst.setString(9,ucrf.getCode3());//add values to the sql query
        pst.setString(10,ucrf.getCode4());//add values to the sql query
        pst.setString(11,ucrf.getYear());//add values to the sql query
        pst.setString(12,ucrf.getFacalty());//add values to the sql query
        pst.setString(13,ucrf.getSemester());//add values to the sql query
        pst.setString(14,ucrf.getPaymentCode());//add values to the sql query
        
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
    
    ArrayList<UC_registration_form> getUC_registration_form(){
        try{
            ArrayList<UC_registration_form> List = new ArrayList<UC_registration_form>();
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "SELECT * FROM ucourse_registration_form";
            pst = (PreparedStatement)con.prepareStatement(query);
            rs = pst.executeQuery();
            
            while(rs.next()){
                UC_registration_form ucrf = new UC_registration_form();
                
                ucrf.setRegID(rs.getInt(1));
                ucrf.setFullName(rs.getString(2));
                ucrf.setSubject1(rs.getString(3));
                ucrf.setSubject2(rs.getString(4));
                ucrf.setSubject3(rs.getString(5));
                ucrf.setSubject4(rs.getString(6));
                ucrf.setCode1(rs.getString(7));
                ucrf.setCode2(rs.getString(8));
                ucrf.setCode3(rs.getString(9));
                ucrf.setCode4(rs.getString(10));
                ucrf.setYear(rs.getString(11));
                ucrf.setFacalty(rs.getString(12));
                ucrf.setSemester(rs.getString(13));
                ucrf.setPaymentCode(rs.getString(14));
                
                List.add(ucrf);
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
    
    public boolean updateucourse(UC_registration_form ucrf){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "UPDATE ucourse_registration_form SET fullname='"+ucrf.getFullName()+"',subject1='"+ucrf.getSubject1()+"',subject2='"+ucrf.getSubject2()+"',subject3='"+ucrf.getSubject3()+"',subject4='"+ucrf.getSubject4()+"',code1='"+ucrf.getCode1()+"',code2='"+ucrf.getCode2()+"',code3='"+ucrf.getCode3()+"',code4='"+ucrf.getCode4()+"',year='"+ucrf.getYear()+"',facalty='"+ucrf.getSemester()+"',paymentcode='"+ucrf.getPaymentCode()+"' WHERE regid="+ucrf.getRegID();
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
    
    public boolean deleteucourse(UC_registration_form ucrf){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "DELETE FROM ucourse_registration_form WHERE regid="+ucrf.getRegID();
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
    


