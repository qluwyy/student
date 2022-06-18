import java .awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.*;
public class ScView extends JPanel {
	public JTextField b;
	
	
	JButton buttonLogin;
	Shanchuqueding scqd;
   ScView() {






		
		b=new JTextField(20);
	


        
        buttonLogin = new JButton("删除");
        add(new JLabel("请输入学号"));
        add(b);
        
	scqd=new Shanchuqueding();
		scqd.setView(this);
		buttonLogin.addActionListener(scqd);
        add(buttonLogin);
    }
    
}