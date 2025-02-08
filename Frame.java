import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JFrame f;
    JButton button, button1, button2, button3;
    JPanel blueJPanel;
    JTextField textField;
    JCheckBox checkBox;
    JComboBox comboBox;

    Frame() {
        ////////////////// Label /////////////////////////
        ImageIcon img2 = new ImageIcon("home.png");
        Font T1 = new Font("TAGameboy-Regular", Font.PLAIN, 20);// change color Font "Name font" รูปแบบ ขนาด
        Border border = BorderFactory.createLineBorder(Color.WHITE, 3);// create Border
        JLabel label = new JLabel();// Create Label
        label.setText("Hi Bro");// set text of label
        label.setIcon(img2);// set img of label
        label.setHorizontalTextPosition(JLabel.CENTER); // จัดทุกอย่างให้อยู่กลาง || LEFT CENTER RIGHT แกน X
        label.setVerticalTextPosition(JLabel.TOP);// จัดทุกอย่างให้อยู่บนimg || TOP CENTER BOTTOM แกน Y
        label.setForeground(Color.WHITE);// change color text
        label.setFont(T1);
        label.setIconTextGap(20);// ช่องว่างของตัวอักศรกับรูป
        label.setBackground(Color.BLACK);// change BG color of label
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);// จัดทุกอย่างให้อยู่ในตำแหน่งที่ต้องการ || TOP CENTER BOTTOM แกน Y
        label.setHorizontalAlignment(JLabel.CENTER);// จัดทุกอย่างให้อยู่ในตำแหน่งที่ต้องการ || LEFT CENTER RIGHT แกน X
        label.setBounds(0, 0, 470, 500);// ตำแหน่ง x y ขนาดของBound
        // เขียนงี้กะได้
        // ImageIcon imageIcon = new
        // ImageIcon(getClass().getResource("Main/StartMenu/BlackHead.png"));
        // JLabel imageLabel = new JLabel(imageIcon);
        // imageLabel.setBounds(115, 50, 470, 100);

        ////////////////// Jpanel ////////////////////////
        JPanel redJPanel = new JPanel();
        redJPanel.setBackground(Color.RED);
        redJPanel.setBounds(0, 0, 100, 100);

        blueJPanel = new JPanel();
        blueJPanel.setBackground(Color.blue);
        blueJPanel.setBounds(100, 0, 100, 100);
        blueJPanel.setVisible(false);

        JPanel mPanel = new JPanel();
        mPanel.setBackground(Color.PINK);
        mPanel.setBounds(0, 300, 300, 300);
        mPanel.setLayout(new BorderLayout());
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel Panel = new JPanel();
        Panel.setBackground(Color.GRAY);
        Panel.setBounds(0, 0, 600, 600);

        ////////////////// JButton ////////////////////////
        ImageIcon img3 = new ImageIcon("run.png");
        button1 = new JButton();
        button1.setBounds(200, 100, 100, 50);
        button1.addActionListener(this);
        // button1.addActionListener(e ->System.out.println("hoooo");); //เขียนงี้กะได้
        button1.setText("I'm button"); // ใส่ข้อความลงไปในปุ่ม
        button1.setFocusable(false); // ทำให้กรอบข้อความหายไป กรอบปะปะะอะ
        button1.setIcon(img3);
        button1.setHorizontalTextPosition(JButton.CENTER);
        button1.setVerticalTextPosition(JButton.BOTTOM);
        button1.setFont(T1);
        button1.setIconTextGap(20);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.lightGray);
        button1.setBorder(BorderFactory.createEtchedBorder());// ทำให้ปุ่มดูนูนขึ้นมา

        button = new JButton("New window");
        button.setBounds(300, 300, 200, 40);
        button.setFocusable(false);
        button.addActionListener(this);

        ////////////////// Joption ////////////////////////
        // while (true) {
        // JOptionPane.showMessageDialog(null, img3, "test op1",
        // JOptionPane.PLAIN_MESSAGE);//show img ok button
        // }//show จนกว่าจะผ่านเงื่อนไข

        //ที่เหลืออยู่ข้างล่าง

        button2 = new JButton("ex option");
        button2.setBounds(400, 400, 200, 40);
        button2.setFocusable(false);
        button2.addActionListener(this);

        ////////////////// textField ////////////////////////
        button3 = new JButton("submit");
        button3.addActionListener(this);
        button3.setFocusable(false);
        textField = new JTextField();// กรอกข้อความ
        textField.setPreferredSize(new Dimension(250, 40));
        // textField.setText("Username");กำหนดมาให้เลย

        ////////////////// JChackbox ////////////////////////
        checkBox = new JCheckBox();
        checkBox.setText("i'm not arobox");
        checkBox.setFocusable(false);
        checkBox.setIcon(img3);
        checkBox.setSelectedIcon(img2);

         ////////////////// Jcombo ////////////////////////
         String[] animals  = {null,"a","b","c"};
         comboBox = new JComboBox(animals); //drop box
         comboBox.addActionListener(this);
         comboBox.setEditable(true);//ใส่ค่าเอง
         System.out.println(comboBox.getItemCount());//จำนวนค่าที่อยู่ในนั้น
         comboBox.addItem("u");//เพิ่มค่าเข้ามา
         comboBox.insertItemAt("j", 2);//เพิ่มค่าเข้ามาแบบกำหนดตำแหน่ง
         comboBox.setSelectedIndex(0);//ตำแหน่งเลือกเริ่มต้น
         comboBox.removeItem("c");//ลบค่าออก
         comboBox.removeItemAt(3);//ลบค่าออกที่ตำแหน่ง
        //comboBox.removeAllItems();//ลบออกทั้งหมด






        ImageIcon img = new ImageIcon("kulnros jibi.JPG");
        Color BG = new Color(24, 78, 119);
        f = new JFrame(); // สร้างหน้าต่าง
        f.setTitle("Test frame"); // ตั้งชื่อ
        f.setIconImage(img.getImage()); // icon frame
        f.getContentPane().setBackground(BG);// change BG
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ปุ่ม x
        f.setResizable(false);// ปรับขนาดหน้าจอได้
        f.setSize(600, 600); // ขนาดหน้าต่าง

        // f.add(redJPanel);
        // f.add(blueJPanel);

        // f.add(label);// add label to frame

        // mPanel.add(label);// add label to Jpanel
        // f.add(mPanel);// add Jpanel to frame

        // Panel.add(button);

        // Panel.add(button1);
        
        // Panel.add(button2);

        // Panel.add(textField);
        // Panel.add(button3);

        // Panel.add(checkBox);
        // Panel.add(comboBox);
        f.add(Panel);

        // f.pack();//ขนาดจะเท่าlabel มัดรวมเป็นก้อน
        f.setLayout(null);// clearทุกอย่างที่ไม่ได้อยู่ในBound
        f.setVisible(true); // ทำให้หน้าต่างแสดง ไว้ล่างสุด

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println("hoooo");
            // button1.setEnabled(false);//ทำให้ปุ่มหยุดทำงาน เป็นสีเทา กดไม่ได้อีก
            blueJPanel.setVisible(true);

        }
        if (e.getSource() == button) {
            System.out.println("12345");
            button.setEnabled(false);
            f.dispose(); // ปิดทิ้ง
            Newwindow NW = new Newwindow(); // เรรียกหน้าต่างใหม่

        }

        if (e.getSource() == button2) {

            JOptionPane.showMessageDialog(null, "img3", "test op1", JOptionPane.PLAIN_MESSAGE);// show text ok button
            JOptionPane.showMessageDialog(null, "i", "test op1", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "?", "test op1", JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null, "!", "test op1", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "x", "test op1", JOptionPane.ERROR_MESSAGE);

            int answer = JOptionPane.showConfirmDialog(null, "img3", "test op2", JOptionPane.YES_NO_CANCEL_OPTION);
            // JOptionPane.showConfirmDialog(null, "img3", "test op2",
            // JOptionPane.YES_OPTION);
            // JOptionPane.showConfirmDialog(null, "img3", "test op2",
            // JOptionPane.YES_NO_OPTION);
            ImageIcon img3 = new ImageIcon("run.png");
            System.out.println(answer);
            String name = JOptionPane.showInputDialog("what is your name :");
            System.out.println("Hello" + name);
            JOptionPane.showOptionDialog(null, name + "?", "Your some one this name ", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, null, 0);
            JOptionPane.showOptionDialog(null, name + "?", "Your some one this name ", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, img3, null, 0);
            String[] responses = { "nooooo", "ya ya", "bye" };
            JOptionPane.showOptionDialog(null, name + "?", "Your some one this name ", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, img3, responses, 0);

        }
        if (e.getSource() == button3) {
            System.out.println("Hi " + textField.getText());
            textField.setEditable(false);// ล็อคค่า
            button3.setEnabled(false);
            System.out.println(checkBox.isSelected());//ค่าที่ติ๊ก
            checkBox.setEnabled(false);
        }
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());//output สิ่งที่เลือก
            System.out.println(comboBox.getSelectedIndex());//output Indexที่เลือก
        }
    }

}
