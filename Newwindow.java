import javax.swing.JFrame;
import javax.swing.JLabel;

public class Newwindow {
    Newwindow(){
        JLabel label = new JLabel("Hello");
        label.setBounds(300,300,150,100);
        JFrame f = new JFrame(); // สร้างหน้าต่าง
        f.setTitle("new frame"); // ตั้งชื่อ
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ปุ่ม x
        f.setResizable(false);// ปรับขนาดหน้าจอได้
        f.setSize(600, 600); // ขนาดหน้าต่าง
        f.add(label);
        f.setVisible(true);

    }
}
