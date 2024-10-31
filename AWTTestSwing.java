import java.awt.*; // Importa AWT para interface gráfica
import javax.swing.*; // Importa Swing para interface gráfica

public class AWTTestSwing {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("AWT Test"); // Cria a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha ao clicar no X
        frame.setSize(400, 200); // Tamanho da janela
        frame.setLayout(new BorderLayout()); // Define o layout da janela

        JLabel label1 = new JLabel("Label1:"); // Cria um rótulo
        JTextField textField1 = new JTextField(15); // Cria um campo de texto

        JPanel topPanel = new JPanel(); // Painel para o rótulo e campo
        topPanel.setLayout(new FlowLayout()); // Layout em linha
        topPanel.add(label1); // Adiciona o rótulo
        topPanel.add(textField1); // Adiciona o campo de texto

        // Cria três botões.
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        JPanel buttonPanel = new JPanel(); // Painel para os botões
        buttonPanel.setLayout(new FlowLayout()); // Layout em linha
        buttonPanel.add(button1); // Primeiro botão
        buttonPanel.add(button2); // Segundo botão
        buttonPanel.add(button3); // Terceiro botão
        // Adiciona os painéis à janela.
        frame.add(topPanel, BorderLayout.NORTH); // Painel do topo
        frame.add(buttonPanel, BorderLayout.CENTER); // Painel dos botões

        frame.setVisible(true); // Torna a janela visível
    }
    
}
