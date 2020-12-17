import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame {
    private JFrame frame;

    private OnLoginButtonClickListener onLoginButtonClickListener;
    private OnCreateNewButtonClickListener onCreateNewButtonClickListener;

    public interface OnLoginButtonClickListener {
        void onClick(String email, String Password);
    }

    public interface OnCreateNewButtonClickListener {
        void onClick();
    }

    public void setOnLoginButtonClickListener(OnLoginButtonClickListener onLoginButtonClickListener) {
        this.onLoginButtonClickListener = onLoginButtonClickListener;
    }

    public void setCreateNewButtonClickListener(OnCreateNewButtonClickListener onCreateNewButtonClickListener) {
        this.onCreateNewButtonClickListener = onCreateNewButtonClickListener;
    }

    public LoginFrame() {
        frame = new JFrame();
        frame.setSize(450, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        final JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(10, 60, 80, 25);
        panel.add(passLabel);

        final JTextField passText = new JTextField(20);
        passText.setBounds(100, 60, 165, 25);
        panel.add(passText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 90, 150, 25);
        panel.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                onLoginButtonClickListener.onClick(userText.getText(), passText.getText());
            }
        });

        JButton createNewButton = new JButton("Create New Account");
        createNewButton.setBounds(10, 120, 150, 25);
        panel.add(createNewButton);

        createNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.dispose();
                onCreateNewButtonClickListener.onClick();
            }
        });

        frame.add(panel);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void dispose() {
        frame.dispose();
    }
}
