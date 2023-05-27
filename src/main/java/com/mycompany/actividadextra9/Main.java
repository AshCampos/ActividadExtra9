
package com.mycompany.actividadextra9;

import com.mycompany.actividadextra9.vista.VentanaLibro;


public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro("MVC Y JDBC");
        ControladorLibro controller = new ControladorLibro(view);
    }
     
}
