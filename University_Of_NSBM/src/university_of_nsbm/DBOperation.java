package university_of_nsbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBOperation {

    String url = "jdbc:mysql://localhost:3306/university_of_nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    boolean addupeople(Uregistration_form urf) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "INSERT INTO undergraduate_registration_form VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, urf.getRegID());//add values to the sql query
            pst.setString(2, urf.getFullName());//add values to the sql query
            pst.setString(3, urf.getGender());//add values to the sql query
            pst.setString(4, urf.getEmail());//add values to the sql query
            pst.setString(5, urf.getNic());//add values to the sql query
            pst.setString(6, urf.getAddress());//add values to the sql query
            pst.setString(7, urf.getYear());//add values to the sql query
            pst.setString(8, urf.getIndexNo());//add values to the sql query
            pst.setString(9, urf.getSubject1());//add values to the sql query
            pst.setString(10, urf.getSubject2());//add values to the sql query
            pst.setString(11, urf.getSubject3());//add values to the sql query
            pst.setString(12, urf.getGrade1());//add values to the sql query
            pst.setString(13, urf.getGrade2());//add values to the sql query
            pst.setString(14, urf.getGrade3());//add values to the sql query
            pst.setString(15, urf.getzScore());//add values to the sql query
            pst.setString(16, urf.getdRank());//add values to the sql query
            pst.setString(17, urf.getiRank());//add values to the sql query

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

    ArrayList <Uregistration_form> getUregistration_form(){
        try{
            
            ArrayList<Uregistration_form> List = new ArrayList<Uregistration_form>();
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "SELECT * FROM undergraduate_registration_form";
            pst = (PreparedStatement) con.prepareStatement(query);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                Uregistration_form urf = new Uregistration_form();
                
                urf.setRegID(rs.getInt(1));
                urf.setFullName(rs.getString(2));
                urf.setGender(rs.getString(3));
                urf.setEmail(rs.getString(4));
                urf.setNic(rs.getString(5));
                urf.setAddress(rs.getString(6));
                urf.setYear(rs.getString(7));
                urf.setIndexNo(rs.getString(8));
                urf.setSubject1(rs.getString(9));
                urf.setSubject2(rs.getString(10));
                urf.setSubject3(rs.getString(11));
                urf.setGrade1(rs.getString(12));
                urf.setGrade2(rs.getString(13));
                urf.setGrade3(rs.getString(14));
                urf.setzScore(rs.getString(15));
                urf.setdRank(rs.getString(16));
                urf.setiRank(rs.getString(17));
                
                List.add(urf);
            }
        return List;
            
        }catch (Exception e) {
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
    
    public boolean updateupeople(Uregistration_form urf){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "UPDATE undergraduate_registration_form SET fullname='"+urf.getFullName()+"',gender='"+urf.getGender()+"',email='"+urf.getEmail()+"',nic='"+urf.getNic()+"',address='"+urf.getAddress()+"',year='"+urf.getYear()+"',indexno='"+urf.getIndexNo()+"',subject1='"+urf.getSubject1()+"',subject2='"+urf.getSubject2()+"',subject3='"+urf.getSubject3()+"',grade1='"+urf.getGrade1()+"',grade2='"+urf.getGrade2()+"',grade3='"+urf.getGrade3()+"',zscore='"+urf.getzScore()+"',drank='"+urf.getdRank()+"',irank='"+urf.getiRank()+"'WHERE regid=" +urf.getRegID();
            pst = (PreparedStatement) con.prepareStatement(query);
            
            pst.executeUpdate();
            return true;
            
        }catch (Exception e) {
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
    
    
    public boolean deleteupeople(Uregistration_form urf){
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);//get the connection
            String query = "DELETE FROM undergraduate_registration_form WHERE regid="+urf.getRegID();
            pst = (PreparedStatement) con.prepareStatement(query);
            
            pst.executeUpdate();
            return true;
        }catch (Exception e) {
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
