package GUI;
import javax.swing.*;

public class LaunchPage {
    JFrame frame = new JFrame("Library Manager");
    JButton myButton = new JButton("Main Window");
    ImageIcon icon = new ImageIcon("book.png");

    LaunchPage() {

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(e -> method1());

        frame.setIconImage(icon.getImage());
        frame.add(myButton);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);


    }

    public static void method1() {

        AddingBookPage addingBookPage = new AddingBookPage();

    }

}