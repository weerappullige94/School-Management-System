
package university_of_nsbm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class Pcourse_abstract extends AbstractTableModel {
    
    private static final String[] COLUMN_NAMES = {"Reg ID","Full Name","Year","Facalty","Semester"};
    private static ArrayList<PC_registration_form> List;
    Pcourse_abstract(ArrayList<PC_registration_form> pcList){
        List = pcList;
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
