
import javax.swing.*;
import java.awt.*;

public class RegisterAndLoginView extends JPanel{
    JTabbedPane p;
    RegisterView registerView;
    LoginView loginView;

	CrView cr ;
	CxView cx;
	ScView sc;
	XgView xg;
	CsView cs;
	HtView ht;

    public RegisterAndLoginView(){
        registerView = new RegisterView();
        loginView = new LoginView();
        setLayout(new BorderLayout());
        p = new JTabbedPane();

	cr=new CrView();
	cx=new CxView();
	sc=new ScView();
	xg=new XgView();
	cs=new CsView();
	ht=new HtView();

        p.add("我要注册",registerView);
        p.add("我要登录",loginView);

	p.add("我要插入",cr);
	p.add("我要查询",cx);
	p.add("我要删除",sc);
	p.add("我要修改",xg);
	p.add("生成测试",cs);
	p.add("生成柱状图",ht);

        p.validate();
        add(p,BorderLayout.CENTER);
    }
    public boolean isLoginSuccess() {
        return loginView.isLoginSuccess();
    }
}
