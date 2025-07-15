import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame{
    private JTextField nombreField;
    private JPasswordField passwordField;
    private JButton acccederButton;
    private JPanel loginPanel;
    private JComboBox rolSeleccion;

    public login(){
        setTitle("login");
        setContentPane(loginPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);


        acccederButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ingresarLogin();

            }
        });
    }

    private void ingresarLogin() {
        String nombre=nombreField.getText();
        String contrasenia=String.valueOf(passwordField.getPassword());
        String rol=String.valueOf(rolSeleccion.getSelectedItem());

        if(nombre.isEmpty()||contrasenia.isEmpty()){
            JOptionPane.showMessageDialog(this,"Los campos no pueden estar vacios");
            return;
        }

        if(nombre.equals("adm123")&&contrasenia.equals(("1234"))){
            if(rol.equals("Administrador")){
                new Administrador();

            } else {
                JOptionPane.showMessageDialog(this,"Rol incorecto");
            }


        }
        else {
            if(nombre.equals("cjr123")&&contrasenia.equals(("1234"))){
                if(rol.equals("Cajero")){
                    new Cajero();
                } else {
                    JOptionPane.showMessageDialog(this,"Rol incorecto");

                }

            }
            else {
                JOptionPane.showMessageDialog(this,"Contrasenio o usuario incorrrectos");

            }

        }




    }


}
