import java .awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.*;
public class XgView extends JPanel {
	public JTextField b;
	public JTextField c;
	public JTextField d;
	public JTextField e;
	JButton buttonLogin;
	Xiugaiqueding xgqd;
   XgView() {
		





		
		b=new JTextField(60);
		


        
        buttonLogin = new JButton("修改");
        add(new JLabel("请按数据库更新语句输入要修改的信息(不懂请看课本P400)"));
	add(b);

	
	xgqd=new Xiugaiqueding();
		xgqd.setView(this);
		buttonLogin.addActionListener(xgqd);
        add(buttonLogin);
	
    }
    
}