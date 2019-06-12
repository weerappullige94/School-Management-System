
package university_of_nsbm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class Ucourse_abstract extends AbstractTableModel {
    
    private static final String[] COLUMN_NAMES = {"Reg ID","Full Name","Year","Facalty","Semester"};
    private static ArrayList<UC_registration_form> List;
    Ucourse_abstract (ArrayList<UC_registration_form> ucList){
        List = ucList;
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
                return List.get(rowIndex).getYear();
            case 3:
                return List.get(rowIndex).getFacalty();
            case 4:
                return List.get(rowIndex).getSemester();
            default:
                return "Error";
            
        }
    }
    
}
