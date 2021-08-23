import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Contactoscontroller {

    @FXML
    private TextField nombre;

    @FXML
    private TextField apellido;

    @FXML
    private TextField celular;

    @FXML
    private TextField correo;

    @FXML
    private TextField paginaweb;

    @FXML
    private TextField direccion;

    @FXML
    private TextField notatxt;

    @FXML
    private Button savecontact;

    @FXML
    private TextArea textareacontact;

    @FXML
    private Button vercontactobtn;

    @FXML
    private Button editarcontactobtn;

    @FXML
    private Button eliminarcontactobtn;

    @FXML
    void editarcontactobtn(ActionEvent event) {

    }

    @FXML
    void eliminarcontactobtm(ActionEvent event) {

    }

    @FXML
    void savecontact(ActionEvent event) {

        {
            Connect conexion = new Connect();
            
            String Nombre = nombre.getText();
            String Apellido = apellido.getText();
            int Celular = Integer.parseInt(celular.getText());
            String Correo = correo.getText();
            String Pagina = paginaweb.getText();
            String Direccion = direccion.getText();
            String Nota = notatxt.getText();

            String sql = "insert into contact (nombre,apellido,celular,correo,paginaweb,direccion,notatxt) values (? ,? ,? ,? ,?,?,?)";
            //Connection con3 = conexion.connect();
    
            try {
                Connection con2 = conexion.connect();
                PreparedStatement stmt = con2.prepareStatement(sql);
                
                stmt.setString(1, Nombre);
                stmt.setString(2, Apellido);
                stmt.setInt(3, Celular);
                stmt.setString(4, Correo);
                stmt.setString(5, Pagina);
                stmt.setString(6, Direccion);
                stmt.setString(4, Nota);

                stmt.executeUpdate();
                System.out.println("Contacto Guardado");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }    
        /*
        Connect conexion = new Connect();
        String Nombre = nombre.getText();
        String Apellido = apellido.getText();
        String Correo = correo.getText();
        String Paginaweb = paginaweb.getText();
        String Celular = celular.getText();
        String Direccion = direccion.getText();
        String Nota = notatxt.getText();

        String sql = "insert into contact (nombre , apellido, correo , paginaweb, celular,direccion,nota) values (? ,? ,? ,? ,?,?,?)";
        try {
            Connection con2 = conexion.connect();
            PreparedStatement stmt = con2.prepareStatement(sql);
            stmt.setString(1, Nombre);
            stmt.setString(2, Apellido);
            stmt.setString(3, Correo);
            stmt.setString(4, Paginaweb);
            stmt.setString(5, Celular);
            stmt.setString(6, Direccion);
            stmt.setString(7, Nota);

            stmt.executeUpdate();
            System.out.println("Contacto Guardado ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } */

    }

    @FXML
    void vercontacto(ActionEvent event) {

    }

}
