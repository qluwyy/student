
import java.sql.*;
import javax.swing.JOptionPane;

public class HandleLogin {
    Connection con;
    PreparedStatement preSql;
    ResultSet rs;
    public HandleLogin(){
        try{           //加载 JDBC - MySQL8.0.15 连接器
               Class.forName("con.mysql.cj.jdbc.Driver");
        }
        catch (Exception e){}
        String uri = "jdbc:mysql://localhost:3306/user?"+
        "useSSL = false&serverTimezone =GMT%2B8&characterEncoding = utf-8";
        String user = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(uri,"root","");
        }
        catch (SQLException e){}
    }
    public Login queryVerify(Login loginModel) {
	
        String id ="abc";
	String idd="abcd";
	String iddd="123";

 	if(id.equals( loginModel.getID())){

		
                loginModel.setLoginSuccess(true);
                JOptionPane.showMessageDialog(null,"登录成功",
                                 "恭喜",JOptionPane.WARNING_MESSAGE);
            }


            else if(idd.equals( loginModel.getID())){


                loginModel.setLoginSuccess(true);
                JOptionPane.showMessageDialog(null,"登录成功",
                                 "恭喜",JOptionPane.WARNING_MESSAGE);
            }
	else if(iddd.equals( loginModel.getID())){


                loginModel.setLoginSuccess(true);
                JOptionPane.showMessageDialog(null,"登录成功",
                                 "恭喜",JOptionPane.WARNING_MESSAGE);
            }
	else{
		 loginModel.setLoginSuccess(false);
                JOptionPane.showMessageDialog(null,"登陆失败",
                   "登陆失败，重新登录",JOptionPane.WARNING_MESSAGE);
           
	}
        /*String pw = loginModel.getPassword();
        String sqlStr = "select id,password from register where"+
                         "id=? and password=?";
        try{

            preSql = con.prepareStatement(sqlStr);

            preSql.setString(1,id);
            preSql.setString(2,pw);

            rs = preSql.executeQuery();

            if(rs.next() == true){

		System.out.println("101010");
                loginModel.setLoginSuccess(true);
                JOptionPane.showMessageDialog(null,"登录成功",
                                 "恭喜",JOptionPane.WARNING_MESSAGE);
            }
            else{


		System.out.println("111111");
                loginModel.setLoginSuccess(false);
                JOptionPane.showMessageDialog(null,"登陆失败",
                   "登陆失败，重新登录",JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        }
	
        catch (SQLException e){}*/
	
        return loginModel;
    }
}
