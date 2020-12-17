import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpFrame {
    private JFrame frame;

    private OnSignUpButtonClickListener onSignUpButtonClickListener;

    public interface OnSignUpButtonClickListener {
        void onClick(String name, String email, String phone, String address, String dob, String password);
    }


    public void setOnSignUpButtonClickListener(OnSignUpButtonClickListener onSignUpButtonClickListener) {
        this.onSignUpButtonClickListener = onSignUpButtonClickListener;
    }

    public SignUpFrame() {
        frame = new JFrame();
        frame.setSize(450, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);

        final JTextField nameText = new JTextField(20);
        nameText.setBounds(100, 20, 165, 25);
        panel.add(nameText);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(10, 50, 80, 25);
        panel.add(emailLabel);

        final JTextField emailText = new JTextField(20);
        emailText.setBounds(100, 50, 165, 25);
        panel.add(emailText);

        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(10, 80, 80, 25);
        panel.add(phoneLabel);

        final JTextField phoneText = new JTextField(20);
        phoneText.setBounds(100, 80, 165, 25);
        panel.add(phoneText);


        JLabel dobLabel = new JLabel("Date of Birth");
        dobLabel.setBounds(10, 110, 80, 25);
        panel.add(dobLabel);

        final JTextField dobText = new JTextField(20);
        dobText.setBounds(100, 110, 165, 25);
        panel.add(dobText);


        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(10, 140, 80, 25);
        panel.add(addressLabel);

        final JTextField addressText = new JTextField(20);
        addressText.setBounds(100, 140, 165, 25);
        panel.add(addressText);


        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 170, 80, 25);
        panel.add(passwordLabel);

        final JTextField passwordText = new JTextField(20);
        passwordText.setBounds(100, 170, 165, 25);
        panel.add(passwordText);


        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(10, 220, 150, 25);
        panel.add(signUpButton);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                onSignUpButtonClickListener.onClick(nameText.getText(), emailText.getText(), phoneText.getText(), addressText.getText(), dobText.getText(), passwordText.getText());
            }
        });

        frame.add(panel);
    }

    public void show() {
        frame.setVisible(true);
    }
}
