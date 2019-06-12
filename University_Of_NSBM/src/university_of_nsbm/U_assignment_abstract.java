
package university_of_nsbm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class U_assignment_abstract extends AbstractTableModel {
    
    private static final String[] COLUMN_NAMES = {"Reg ID","Full Name","Facalty","Year"};
    private static ArrayList<U_Assignment_details> List;
    U_assignment_abstract(ArrayList<U_Assignment_details> uadList){
        List = uadList;
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
                return List.get(rowIndex).getFacalty();
            case 3:
                return List.get(rowIndex).getYear();
            default:
                return "Error";
            
        }
    }
    
}
