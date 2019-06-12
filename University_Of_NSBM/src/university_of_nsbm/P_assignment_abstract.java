
package university_of_nsbm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class P_assignment_abstract extends AbstractTableModel{
    
    private static final String[] COLUMN_NAMES = {"Reg ID","Full Name","Facalty","Year"};
    private static ArrayList<P_Assignment_details> List;
    P_assignment_abstract(ArrayList<P_Assignment_details> padList){
        List = padList;
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
