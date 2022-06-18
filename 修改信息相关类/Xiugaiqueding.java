import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class Xiugaiqueding implements ActionListener {
	
	XgView view;
	
	String a;
	String b;
	String c;
	String d;
	String ee;
	String f;
	String g;
	public void setView(XgView view){
		this.view=view;
	}//补充窗体类！！！！！！！！！！！！！！！！！！！！！！！！！！
	

		public void actionPerformed (ActionEvent e) {
			String bb=view.b.getText();
		try{
			Connection con=GetDBConnection.connectDB("student","root","");
			String add=bb;
			

			Statement sql=con.createStatement();
			
			
			int ok=sql.executeUpdate(add);
			
			

		}
		catch(SQLException ex){
			System.out.println(ex);
		}



		
		}
}