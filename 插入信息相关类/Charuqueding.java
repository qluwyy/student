import java.awt.event.*;
import java.sql.*;
public class Charuqueding implements ActionListener {
	
	CrView view;
	public void setView(CrView view){
		this.view=view;
	}//补充窗体类！！！！！！！！！！！！！！！！！！！！！！！！！！
	

		public void actionPerformed (ActionEvent e) {
			String bb=view.b.getText();
		String dd=view.d.getText();
		String ff=view.f.getText();
		String hh=view.h.getText();
		String jj=view.j.getText();
		String ll=view.l.getText();
		String nn=view.n.getText();
		//System.out.println(dd+ff+hh+jj+ll+nn);
		try{
			Connection con=GetDBConnection.connectDB("student","root","");
			String add="insert into chengji values (?,?,?,?,?,?,?)";
			PreparedStatement sql=con.prepareStatement(add);
			sql.setString (1,bb);
			sql.setString (2,dd);
			sql.setString (3,ff);
			sql.setString (4,hh);
			sql.setString (5,jj);
			sql.setString (6,ll);
			sql.setString (7,nn);
			int ok=sql.executeUpdate();
			con.close();
		}
		catch(SQLException ex){
			System.out.println(ex);
		}
		}
}