import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class Shanchuqueding implements ActionListener {
	
	ScView view;
	
	String a;
	String b;
	String c;
	String d;
	String ee;
	String f;
	String g;
	public void setView(ScView view){
		this.view=view;
	}//补充窗体类！！！！！！！！！！！！！！！！！！！！！！！！！！
	

		public void actionPerformed (ActionEvent e) {
			String bb=view.b.getText();
		
		try{
			Connection con=GetDBConnection.connectDB("student","root","");
			String add="delete from chengji where 学号=?";
			PreparedStatement sql=con.prepareStatement(add);
			sql.setString (1,bb);
			int ok=sql.executeUpdate();
			
				
			

		}
		catch(SQLException ex){
			System.out.println(ex);
		}



		
		}
}