
package university_of_nsbm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class Uregistration_adstract extends AbstractTableModel {
    
    private static final String[] COLUMN_NAMES = {"Reg ID","Full Name","Gender","Email","NIC","Address","Year"};
    private static ArrayList <Uregistration_form> List;
    Uregistration_adstract(ArrayList <Uregistration_form> uList){
        List = uList;
    }

    @Override
    public int getRowCount() {
        return List.size();
    }
    
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return List.get(rowIndex).getRegID();
            case 1:
                return List.get(rowIndex).getFullName();
            case 2:
                return List.get(rowIndex).getGender();
            case 3:
                return List.get(rowIndex).getEmail();
            case 4:
                return List.get(rowIndex).getNic();
            case 5:
                return List.get(rowIndex).getAddress();
            case 6:
                return List.get(rowIndex).getYear();
            default:
                return "Error";
            
        }
    }
    
}
