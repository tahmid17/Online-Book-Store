import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame {
    private JFrame frame;

    private OnProfileButtonClickListener onProfileButtonClickListener;


    public interface OnProfileButtonClickListener {

        void onClick();
    }

    public void setOnProfileButtonClickListener(OnProfileButtonClickListener onProfileButtonClickListener) {
        this.onProfileButtonClickListener = onProfileButtonClickListener;
    }


    public HomeFrame() {
        frame = new JFrame();
        frame.setSize(450, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(null);
        JButton profileButton = new JButton("User Profile");
        profileButton.setBounds(10, 10, 120, 25);
        panel.add(profileButton);
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.dispose();
                onProfileButtonClickListener.onClick();
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
