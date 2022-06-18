import java .awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.*;
public class HtView extends JPanel {
	public JTextField b;
	public JTextField d;
	public JTextField f;
	public JTextField h;
	public JTextField j;
	public JTextField l;
	public JTextField n;
	JButton buttonLogin;
	Huatuqueding htqd;
   HtView() {

	
		b=new JTextField(20);
	
		d=new JTextField(20);
	
		f=new JTextField(20);
		
		



        
        buttonLogin = new JButton("生成柱状图");
        add(new JLabel("请输入数学成绩"));
        add(b);
        add(new JLabel("请输入JAVA成绩"));
        add(d);
	add(new JLabel("请输入体育成绩"));
        add(f);
	
	htqd=new Huatuqueding();
		htqd.setView(this);
		buttonLogin.addActionListener(htqd);
        add(buttonLogin);
    }
    
}