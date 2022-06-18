import java .awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.*;
public class CxView extends JPanel {
	public JTextField b;
	
	
	JButton buttonLogin;
	Chaxunqueding cxqd;
   CxView() {






		
		b=new JTextField(20);
	


        
        buttonLogin = new JButton("查询");
add(new JLabel("请输入学号"));

        add(b);
        
	cxqd=new Chaxunqueding();
		cxqd.setView(this);
		buttonLogin.addActionListener(cxqd);
        add(buttonLogin);
    }
    
}