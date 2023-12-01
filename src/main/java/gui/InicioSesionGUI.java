package GUI;

import DAO.MedicoDAO;
import entidades.Medicos;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import repository.MedicoRepository;

public class InicioSesionGUI {
    private JFrame frame;
    private JButton btnProfesional;
    private JButton btnUsuario;

    public InicioSesionGUI() {
        frame = new JFrame("Inicio de Sesión");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnProfesional = new JButton("Profesional Médico");
        btnUsuario = new JButton("Usuario");

        btnProfesional.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String matriculaString = JOptionPane.showInputDialog(frame, "Ingrese su matrícula:");
                if (matriculaString != null && !matriculaString.isEmpty()) {
                    try {
                        int matricula = Integer.parseInt(matriculaString);
                        validarMatriculaProfesional(matricula);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "La matrícula debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        btnUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaUsuario();
            }
        });

        JPanel panel = new JPanel();
        panel.add(btnProfesional);
        panel.add(btnUsuario);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void abrirVentanaUsuario() {
        frame.dispose(); // Cerrar ventana actual

        // Aquí puedes agregar lógica para la ventana de registro de mascotas
        // ...
    }

    private boolean validarMatriculaProfesional(int matricula) {
        // Aquí puedes agregar la lógica para validar la matrícula del profesional médico
        // 1 ero deberia obtener todas las matriculas que hay en la base de datos - 2 luego las itero hasta encontrar la que coincida con la que quiero
        MedicoDAO medicoDAO = new MedicoRepository();
        
        List<Medicos> medicos = new ArrayList<>();
        

        // Una vez validada, abrir la ventana de turnos para el profesional médico
        new VentanaTurnosProfesional();
        frame.dispose(); // Cerrar ventana actual
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InicioSesionGUI();
            }
        });
    }
}
