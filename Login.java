//develop a login page using java swing with username and password fields, a login button, and a message label to display success or failure messages. The login button should validate the input against predefined credentials and update the message label accordingly.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password";
    public Login(){
        setTitle("Login Page");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        initializeComponents();
        setVisible(true);               
    }
    private void initializeComponents() {
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);
        loginButton = new JButton("Login");
        messageLabel = new JLabel("");
        loginButton.addActionListener(this);
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(messageLabel);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid username or password.");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login());

    }
}

//how to add the this rpositiory on GitHub


    
