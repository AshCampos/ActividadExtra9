
import com.mycompany.actividadextra9.modelo.Libro;
import com.mycompany.actividadextra9.vista.VentanaLibro;
import com.mycompany.actividadextra9.modelo.ModeloTablaLibro;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class ControladorLibro extends MouseAdapter {

    private VentanaLibro view;
    private ModeloTablaLibro modelo;

    public ControladorLibro(VentanaLibro view) {
        this.view = view;
        modelo = new ModeloTablaLibro();
        this.view.getTblLibro().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {
            
            modelo.cargarDatos();
            this.view.getTblLibro().setModel(modelo);
            this.view.getTblLibro().updateUI();
        }

        if (e.getSource() == this.view.getBtnAgregar()) {
            Libro libro = new Libro();
            libro.setId(0);
            libro.setTitulo(this.view.getTxtTitulo().getText());
            libro.setAutor(this.view.getTxtAutor().getText());
            if (modelo.agregarLibro(libro)) {
                JOptionPane.showMessageDialog(view, "se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblLibro().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "no se pudo aregar a la base de datos. Por favor revise su conexion", "Error al insertar", JOptionPane.ERROR_MESSAGE);

            }
            this.view.limpiar();
        }
    }

}
