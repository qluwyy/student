import java .awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.*;
public class CsView extends JPanel {
	
	JButton buttonLogin;
	Ceshiqueding csqd;
   CsView() {





        
 
        
        buttonLogin = new JButton("生成10万测试数据");
        
	csqd=new Ceshiqueding();
		csqd.setView(this);
		buttonLogin.addActionListener(csqd);
        add(buttonLogin);
    }
    
}