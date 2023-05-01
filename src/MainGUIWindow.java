import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton button1;


    public MainGUIWindow()
    {
        createUIComponents();
    }

    public void createUIComponents()
    {
        setContentPane(mainPanel);
        setTitle("First GUI??");
        setSize(500, 400);
        setLocation(450, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button1.addActionListener(this);
        textField1.addKeyListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source instanceof JButton)
        {
            JButton button = (JButton) source;
            String text = button.getText();

            if (text.equals("Send"))
            {
                textArea1.append("Sent!");
            }
        }

    }
    public void keyTyped(KeyEvent e)
    {

    }

    public void keyPressed(KeyEvent e)
    {

    }
    public void keyReleased(KeyEvent e)
    {

    }
}
