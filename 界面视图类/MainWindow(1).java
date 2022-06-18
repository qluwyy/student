import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class MainWindow extends JFrame implements ActionListener{
	
    JButton computerButton;
    JButton aa;
    RegisterAndLoginView view;

    MainWindow(){
        setBounds(100,100,800,260);
        view = new RegisterAndLoginView();
        computerButton = new JButton("导出成绩");
	
        computerButton.addActionListener(this);

	
        add(view,BorderLayout.CENTER);
        add(computerButton,BorderLayout.NORTH);
	
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(view.isLoginSuccess() == false){
            JOptionPane.showMessageDialog(null,"请登录","登录提示",
                                         JOptionPane.WARNING_MESSAGE);
        }
        else {
            Query a=new Query();
		String [] b;
		String [] []c;
		JTable table;
		JFrame winn=new JFrame();
		a.setSQL("select*from chengji");
		c=a.getRecord();
		b=a.getColumnName();
		table=new JTable(c,b);
		winn.add(new JScrollPane(table));
		winn.setBounds(12,100,400,200);
		winn.setVisible(true);
		winn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            



		File file = new File("学生成绩汇总.txt");
     		   
     	  try {
     	       FileWriter outOne = new FileWriter(file);
     	       BufferedWriter outTwo = new BufferedWriter(outOne);
		for (int j=0;j<a.getl();j++){
			outTwo.write(b[j]);
			outTwo.write("  ");
		}
		outTwo.newLine();
    	        for (int i=0;i<a.geth();i++)
    	        {
    	          for (int j=0;j<a.getl();j++){
			outTwo.write(c[i][j]);
			outTwo.write("   ");
		}
			
    	          outTwo.newLine();
    	        }
		outTwo.close();
            	outOne.close();
	}
	catch (IOException ex) {
            throw new RuntimeException(ex);
        }				
      }
    }
    public static void main(String args[]) {
        MainWindow window = new MainWindow();
        window.setTitle("学生成绩管理系统");
    }
}
