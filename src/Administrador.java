import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Administrador extends JFrame{
    private JTextField nombreProductoField;
    private JTextField descripcionProductoField;
    private JButton registrarButton;
    private JButton limpiarButton;
    private JPanel administradorPanel;

    public Administrador() {
        setTitle("Panel de Administrador");
        setContentPane(administradorPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarProducto();
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
    }

    public void limpiarCampos() {
        nombreProductoField.setText("");
        descripcionProductoField.setText("");
    }

    public void registrarProducto() {
        if(nombreProductoField.getText().isEmpty()||descripcionProductoField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Los campos no pueden estar vacios");
            return;
        }

        JOptionPane.showMessageDialog(this,"Producto guadado");

    }
}
