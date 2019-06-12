
package university_of_nsbm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Pregistration_adstract extends AbstractTableModel{
    private static final String [] COLUMN_NAMES = {"Reg ID","Full name","Gender","Email","NIC","Address","Year"};
    private static ArrayList<Pregistration_form> List;
    Pregistration_adstract(ArrayList<Pregistration_form>pList){
        List = pList;
    }
    
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return List.size();
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
