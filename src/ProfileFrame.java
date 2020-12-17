import user.User;

import javax.swing.*;

public class ProfileFrame {
    private static final int LABEL_WIDTH = 250;
    private JFrame frame;
    private User user = new User();

    public ProfileFrame() {
        getUserDataFromDb();
        frame = new JFrame();
        frame.setSize(450, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Name : " + user.getName());
        nameLabel.setBounds(10, 20, LABEL_WIDTH, 25);
        panel.add(nameLabel);

        JLabel emailLabel = new JLabel("Email : " + user.getEmail());
        emailLabel.setBounds(10, 50, LABEL_WIDTH, 25);
        panel.add(emailLabel);

        JLabel phoneLabel = new JLabel("Phone : " + user.getPhoneNumber());
        phoneLabel.setBounds(10, 80, LABEL_WIDTH, 25);
        panel.add(phoneLabel);

        JLabel dobLabel = new JLabel("Date of Birth : " + user.getDateOfBirth());
        dobLabel.setBounds(10, 110, LABEL_WIDTH, 25);
        panel.add(dobLabel);

        JLabel addressLabel = new JLabel("Address : " + user.getAddress());
        addressLabel.setBounds(10, 140, LABEL_WIDTH, 25);
        panel.add(addressLabel);

        frame.add(panel);
    }

    private void getUserDataFromDb() {
        // read from db first then assign the values
        user.setName("nameFromDb");
        user.setEmail("emailFromDb");
        user.setDateOfBirth("DoB from db");
        user.setPhoneNumber("phone number from db");
        user.setAddress("address from db");
    }

    public void show() {
        frame.setVisible(true);
    }
}
