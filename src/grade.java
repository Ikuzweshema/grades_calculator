import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Sun Mar 17 14:03:20 SAST 2024
 */



/**
 * @author shema
 */
public class grade extends JFrame {
    public grade() {
        initComponents();
    }
 public  static void main(String[] args){
     try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
     }
     catch (Exception exception){
         exception.printStackTrace();
     }
       grade obj= new grade();
       obj.frame1.setVisible(true);

 }

 private void button1MouseClicked(MouseEvent e) {
     // TODO add your code here
     double grades;
     grades=Double.parseDouble(textField1.getText());
     if (grades>=88){
         textField3.setText("A");
         textField2.setText(Double.toString(grades));
     } else if(grades>=78 && grades<=87) {
         textField2.setText(Double.toString(grades));
         textField3.setText("B");

     }
     else if(grades>=68 && grades<=77) {
         textField2.setText(Double.toString(grades));
         textField3.setText("C");

     }
     else if(grades>=58 && grades<=67) {
         textField2.setText(Double.toString(grades));
         textField3.setText("D");

     }
     else if( grades<= 57) {
         textField2.setText(Double.toString(grades));
         textField3.setText("C");

     }

 }

 private void button2MouseClicked(MouseEvent e) {
     // TODO add your code here
     textField1.setText("");
     textField2.setText("");
     textField3.setText("");
 }

 private void exit(MouseEvent e) {
     // TODO add your code here
     System.exit(0);
 }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Shemaa Elisa
        frame1 = new JFrame();
        label5 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        panel1 = new JPanel();
        button1 = new JButton();
        label3 = new JLabel();
        textField2 = new JTextField();
        button2 = new JButton();
        label4 = new JLabel();
        textField3 = new JTextField();
        button3 = new JButton();

        //======== frame1 ========
        {
            frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame1.setResizable(false);
            frame1.setTitle("Calculator");
            frame1.setIconImage(new ImageIcon(getClass().getResource("/calculator.png")).getImage());
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));

            //---- label5 ----
            label5.setText("Grades calculator");
            label5.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 24));
            frame1ContentPane.add(label5, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label2 ----
            label2.setText("Grade:");
            label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
            frame1ContentPane.add(label2, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            frame1ContentPane.add(textField1, new GridConstraints(1, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //======== panel1 ========
            {
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
                EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing
                . border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
                java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
                { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () ))
                throw new RuntimeException( ); }} );
                panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

                //---- button1 ----
                button1.setText("Enter");
                button1.setToolTipText("Enter");
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1MouseClicked(e);
                    }
                });
                panel1.add(button1, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            frame1ContentPane.add(panel1, new GridConstraints(1, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label3 ----
            label3.setText("Average:");
            label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
            frame1ContentPane.add(label3, new GridConstraints(2, 0, 1, 1,
                GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            frame1ContentPane.add(textField2, new GridConstraints(2, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- button2 ----
            button2.setText("Clear");
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            frame1ContentPane.add(button2, new GridConstraints(2, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label4 ----
            label4.setText("Final grade:");
            label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
            frame1ContentPane.add(label4, new GridConstraints(3, 0, 1, 1,
                GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            frame1ContentPane.add(textField3, new GridConstraints(3, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- button3 ----
            button3.setText("Exit");
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    exit(e);
                }
            });
            frame1ContentPane.add(button3, new GridConstraints(3, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            frame1.setSize(445, 330);
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Shemaa Elisa
    private JFrame frame1;
    private JLabel label5;
    private JLabel label2;
    private JTextField textField1;
    private JPanel panel1;
    private JButton button1;
    private JLabel label3;
    private JTextField textField2;
    private JButton button2;
    private JLabel label4;
    private JTextField textField3;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
