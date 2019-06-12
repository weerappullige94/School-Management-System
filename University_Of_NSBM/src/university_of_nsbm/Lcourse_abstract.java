
package university_of_nsbm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class Lcourse_abstract extends AbstractTableModel{
    
    private static final String[] COLUMN_NAMES = {"Reg ID","Full Name","Year","Semester","Facalty"};
    private static ArrayList<LC_registration_form> List;
    Lcourse_abstract(ArrayList<LC_registration_form> lcList){
        List = lcList;
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
                return List.get(rowIndex).getSemester();
            case 4:
                return List.get(rowIndex).getFacalty();
            default:
                return "Error";
        }
    }
    
}
