import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class Chaxunqueding implements ActionListener {
	
	CxView view;
	ResultSet rs;
	String a;
	String b;
	String c;
	String d;
	String ee;
	String f;
	String g;
	public void setView(CxView view){
		this.view=view;
	}//补充窗体类！！！！！！！！！！！！！！！！！！！！！！！！！！
	

		public void actionPerformed (ActionEvent e) {
			String bb=view.b.getText();
		
		try{
			Connection con=GetDBConnection.connectDB("student","root","");
			String add="select * from chengji where 学号=?";
			PreparedStatement sql=con.prepareStatement(add);
			sql.setString (1,bb);
			rs=sql.executeQuery();
			while (rs.next())
			{
				a=rs.getString(1);
				b=rs.getString(2);
				c=rs.getString(3);
				d=rs.getString(4);
				ee=rs.getString(5);
				f=rs.getString(6);
				g=rs.getString(7);
  			}
				
			

		}
		catch(SQLException ex){
			System.out.println(ex);
		}



		JFrame win =new JFrame();
			JTextField ff=new JTextField(300);
			
			win.setBounds(100,100,800,260);
			ff.setText("学号"+a+" "+"姓名"+b+" "+"性别"+c+" "+"出生日期"+d+" "+"数学"+ee+" "+"JAVA"+f+" "+"体育"+g);
			win.add(ff,BorderLayout.CENTER);
			
			win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        			win.setVisible(true);
		}
}