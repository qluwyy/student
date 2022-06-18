import java.awt.event.*;
import java.sql.*;
import java.io.*;
public class Ceshiqueding implements ActionListener {
	
	CsView view;
	public void setView(CsView view){
		this.view=view;
	}//补充窗体类！！！！！！！！！！！！！！！！！！！！！！！！！！
	

		public void actionPerformed (ActionEvent e) {
			BufferedOutputStream fileOutputStream = null;
                    //创建文件
                    try {
                        fileOutputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\86158\\Documents\\ch14\\a.txt"));
                    } catch (FileNotFoundException exx) {
                        throw new RuntimeException(exx);
                    }
                    String[] name = RandomName.getname().split("q");
                    String[] number = random_number.getnumber().split("q");
                    String[] score1 = normal_random.getscore().split("q");
                    String[] score2 = normal_random.getscore().split("q");
                    String[] score3 = normal_random.getscore().split("q");
                    StringBuffer sb = new StringBuffer();
                    //连接字符串
        for (int i = 0; i < 100000; i++) {
            sb.append(i+1);
            sb.append(". ");
            sb.append("姓名 ");
            sb.append(name[i]);
            sb.append("     ");
            if(name[i].length()==3)
                sb.append("   ");
            else if(name[i].length()==2)
                sb.append("      ");
            sb.append("学号 ");
            sb.append(number[i]);
            sb.append("     ");
            sb.append("数学 ");
            sb.append(score1[i]);
            sb.append("     ");
            sb.append("java ");
            sb.append(score2[i]);
            sb.append("     ");
            sb.append("体育 ");
            sb.append(score3[i]);
            sb.append("     ");
            sb.append("\r\n");
        }
         String str = new String(sb);

        //添加数据到b.txt;
        try {
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
		}
}