
package masjidat.tarbiyah.Database.Operation;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

abstract class OperationDB <T> {
    public List<T> FetchAll() throws SQLException, ClassNotFoundException {
        return null;

    }
    public void InsertAlldata(List<T> data) throws  SQLException, ClassNotFoundException{
        
    }
    public void updateData(int id, String nama, LocalDate tanggal)throws SQLException, ClassNotFoundException{
        
    }
    public void updateData(int id, String nama, int jumlah, boolean jemput, LocalDate tanggal)throws SQLException, ClassNotFoundException{
        
    }
    
    public void delete(int id) throws SQLException, ClassNotFoundException{
        
    }
}
