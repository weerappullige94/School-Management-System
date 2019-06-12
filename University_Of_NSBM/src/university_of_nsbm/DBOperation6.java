
package university_of_nsbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DBOperation6 {
    
    String url = "jdbc:mysql://localhost:3306/university_of_nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    boolean addpcourse(PC_registration_form pcrf){
        try{
        con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
        String query = "INSERT INTO pcourse_registration_form VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = (PreparedStatement)con.prepareStatement(query);
        
        pst.setInt(1,pcrf.getRegID());//add values to the sql query
        pst.setString(2,pcrf.getFullName());//add values to the sql query
        pst.setString(3,pcrf.getSubject1());//add values to the sql query
        pst.setString(4,pcrf.getSubject2());//add values to the sql query
        pst.setString(5,pcrf.getSubject3());//add values to the sql query
        pst.setString(6,pcrf.getSubject4());//add values to the sql query
        pst.setString(7,pcrf.getCode1());//add values to the sql query
        pst.setString(8,pcrf.getCode2());//add values to the sql query
        pst.setString(9,pcrf.getCode3());//add values to the sql query
        pst.setString(10,pcrf.getCode4());//add values to the sql query
        pst.setString(11,pcrf.getYear());//add values to the sql query
        pst.setString(12,pcrf.getFacalty());//add values to the sql query
        pst.setString(13,pcrf.getSemester());//add values to the sql query
        pst.setString(14,pcrf.getPaymentCode());//add values to the sql query
        
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
    
    ArrayList<PC_registration_form> getPC_registration_form(){
        try{
            ArrayList<PC_registration_form> List = new ArrayList<PC_registration_form>();
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "SELECT * FROM pcourse_registration_form";
            pst = (PreparedStatement)con.prepareStatement(query);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                PC_registration_form pcrf = new PC_registration_form();
                
                pcrf.setRegID(rs.getInt(1));
                pcrf.setFullName(rs.getString(2));
                pcrf.setSubject1(rs.getString(3));
                pcrf.setSubject2(rs.getString(4));
                pcrf.setSubject3(rs.getString(5));
                pcrf.setSubject4(rs.getString(6));
                pcrf.setCode1(rs.getString(7));
                pcrf.setCode2(rs.getString(8));
                pcrf.setCode3(rs.getString(9));
                pcrf.setCode4(rs.getString(10));
                pcrf.setYear(rs.getString(11));
                pcrf.setFacalty(rs.getString(12));
                pcrf.setSemester(rs.getString(13));
                pcrf.setPaymentCode(rs.getString(14));
                
                List.add(pcrf);
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
    
    public boolean updatepcourse(PC_registration_form pcrf){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "UPDATE pcourse_registration_form SET fullname='"+pcrf.getFullName()+"',subject1='"+pcrf.getSubject1()+"',subject2='"+pcrf.getSubject2()+"',subject3='"+pcrf.getSubject3()+"',subject4='"+pcrf.getSubject4()+"',code1='"+pcrf.getCode1()+"',code2='"+pcrf.getCode2()+"',code3='"+pcrf.getCode3()+"',code4='"+pcrf.getCode4()+"',year='"+pcrf.getYear()+"',facalty='"+pcrf.getFacalty()+"',semester='"+pcrf.getSemester()+"',paymentcode='"+pcrf.getPaymentCode()+"' WHERE regid="+pcrf.getRegID();
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
    
    public boolean deletepcourse(PC_registration_form pcrf){
        try{
            con = (Connection)DriverManager.getConnection(url,username,password);//get the connection
            String query = "DELETE FROM pcourse_registration_form WHERE regid="+pcrf.getRegID();
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
