
package com.mycompany.actividadextra9.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;


public class InterfazDAO {
    public abstract boolean insertar(Object obj)throws SQLException;
    
    public abstract boolean update(Object obj)throws SQLException;
    
    public abstract boolean delete(String  id)throws SQLException;
    
    public abstract ArrayList obtenertodo( )throws SQLException;
    
        public abstract Object buscarPorId(String id )throws SQLException;
        

    
}
