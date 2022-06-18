import java .awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.*;
public class CrView extends JPanel {
	public JTextField b;
	public JTextField d;
	public JTextField f;
	public JTextField h;
	public JTextField j;
	public JTextField l;
	public JTextField n;
	JButton buttonLogin;
	Charuqueding crqd;
   CrView() {












		
		b=new JTextField(20);
	
		d=new JTextField(20);
	
		f=new JTextField(20);
		
		h=new JTextField(20);
		
		j=new JTextField(20);
	
		l=new JTextField(20);
	
		n=new JTextField(20);







        
 
        
        buttonLogin = new JButton("插入");
        add(new JLabel("请输入学号"));
        add(b);
        add(new JLabel("请输入姓名"));
        add(d);
	add(new JLabel("请输入性别"));
        add(f);
	add(new JLabel("请输入出生日期"));
        add(h);
	add(new JLabel("请输入数学成绩"));
        add(j);
	add(new JLabel("请输入JAVA成绩"));
        add(l);
	add(new JLabel("请输入体育成绩"));
        add(n);
	crqd=new Charuqueding();
		crqd.setView(this);
		buttonLogin.addActionListener(crqd);
        add(buttonLogin);
    }
    
}