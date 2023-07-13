import javax.swing.*;
import java.awt.*;
public class Panel1{
    public static void main (String [] args){
        Panel1 gui = new Panel1();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        JButton buttonThree = new JButton("huh?");

        JTextField field = new JTextField(20);
        field.setText("Что угодно");
        JTextField field2 = new JTextField("Ваше имя");

        JTextArea text = new JTextArea(10,20);
        JScrollPane scroller = new JScrollPane(text);
        text.setLineWrap(true);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel2.add(scroller);

        JCheckBox check = new JCheckBox("К мечте");
        check.setSelected(true);
        panel2.add(check);

        String [] listEntries = {"alpha","beta", "gamma", "delta", "zeta"};
        JList list = new JList(listEntries);

        panel.add(button);
        panel.add(buttonTwo);
        panel.add(buttonThree);
        panel.add(field);
        panel2.add(field2);
        panel3.add(list);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.getContentPane().add(BorderLayout.WEST, panel2);
        frame.getContentPane().add(BorderLayout.CENTER, panel3);

        frame.setSize(1920,1080) ;
        frame.setVisible(true);
        field.requestFocus();
    }
}