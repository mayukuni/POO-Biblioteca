package app;

import javax.swing.*;

public class BibliotecaApp extends JFrame {
    public BibliotecaApp() {
        setTitle("Sistema de Biblioteca");
        setSize(800, 600); // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        initComponents(); // Método para inicializar os componentes da interface
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Adicionar Livro");
        JTextField textField = new JTextField(20);

        panel.add(textField);
        panel.add(button);
        add(panel);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BibliotecaApp app = new BibliotecaApp();
            app.setVisible(true);
        });
    }
}
