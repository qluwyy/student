import java.awt.event.*;
import java.sql.*;
public class Huatuqueding implements ActionListener {
	
	HtView view;
	public void setView(HtView view){
		this.view=view;
	}//补充窗体类！！！！！！！！！！！！！！！！！！！！！！！！！！
	

		public void actionPerformed (ActionEvent e) {
		String bb=view.b.getText();
		String dd=view.d.getText();
		String ff=view.f.getText();
		int bbb=Integer.parseInt(bb); 
		int ddd=Integer.parseInt(dd); 
		int fff=Integer.parseInt(ff); 
		//System.out.println(dd+ff+hh+jj+ll+nn);
		Huatu1 aa= new Huatu1(bbb,ddd,fff);
		}
}