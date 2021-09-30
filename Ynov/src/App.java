import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JButton exitButton;
    private JPanel Main;
    private JButton buildCarButton;
    private JButton turnRightButton;
    private JButton turnLeftButton;
    private JButton infoCarButton;
    private JButton infoWheelButton;
    private JButton driveButton;

    public App() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        turnRightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.Joris.Car.Rotate("right");
            }
        });

        turnLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.Joris.Car.Rotate("left");
            }
        });

        driveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.Joris.Car.Rotate("straight");
            }
        });

        buildCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.Joris.Main.main();
            }
        });

        infoCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.Joris.Main.getInfo();
            }
        });

        infoWheelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.Joris.Main.getInfoWheel();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Game");
        frame.setContentPane(new App().Main);
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}
