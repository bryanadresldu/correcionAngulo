import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cajero extends JFrame{
    private JTextField nombreClienteField;
    private JTextField edadClienteField;
    private JButton registrarButton;
    private JButton limpiarButton;
    private JPanel cajeroPanel;

    public Cajero() {
        setTitle("login");
        setContentPane(cajeroPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarCliente();
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
        nombreClienteField.setText("");
        edadClienteField.setText("");
    }

    public void registrarCliente() {

        if (nombreClienteField.getText().isEmpty()||edadClienteField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Campos no pueden estar vacios");
            return;        }

        String nombreCliente=nombreClienteField.getText();
        int edadCliente=Integer.parseInt(edadClienteField.getText());

        if (edadCliente>=18){
            JOptionPane.showMessageDialog(this,"Cliente guardado");

        }else{
            JOptionPane.showMessageDialog(this,"Cliente es menor de edad no se peude registrar");

        }
    }

}
