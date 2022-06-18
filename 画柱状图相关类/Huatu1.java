

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Huatu1 extends JFrame{
    private Mypanel mp = null;
    public Huatu1(int h1,int h2,int h3)
    {
        mp = new Mypanel(h1,h2,h3);
        this.add(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setVisible(true);
    }
    class Mypanel extends JPanel
    {
        int h1,h2,h3;

        public Mypanel(int h1, int h2, int h3) {
            this.h1 = 500*h1/100;
            this.h2 = 500*h2/100;
            this.h3 = 500*h3/100;
        }
        public void paint(Graphics g) {

            super.paint(g);
            g.setColor(Color.BLACK);
            int[] pointx1 = {97,107,102};
            int[] pointx2 = {700,700,709};
            int[] pointy1 = {100,100,91};
            int[] pointy2 = {697,707,702};

            g.fillRect(100,100,4,600);
            g.fillRect(100,700,600,4);
            g.fillRect(100,600,10,4);
            g.fillRect(100,500,10,4);
            g.fillRect(100,400,10,4);
            g.fillRect(100,300,10,4);
            g.fillRect(100,200,10,4);
            g.fillPolygon(pointx1,pointy1,3);
            g.fillPolygon(pointx2,pointy2,3);
            g.setColor(Color.RED);
            g.fillRect(225,700-h1,50,h1);
            g.setColor(Color.BLACK);
            g.fillRect(425,700-h2,50,h2);
            g.setColor(Color.ORANGE);
            g.fillRect(625,700-h3,50,h3);
            Graphics2D g2d = (Graphics2D) g;
            Font f = new Font("微软雅黑",Font.BOLD,20);
            g2d.setFont(f);
            g2d.setColor(Color.BLACK);
            g2d.drawString("数学",230,695-h1);
            g2d.drawString("Java",430,695-h2);
            g2d.drawString("体育",630,695-h3);
            g2d.drawString("20",75,610);
            g2d.drawString("40",75,510);
            g2d.drawString("60",75,410);
            g2d.drawString("80",75,310);
            g2d.drawString("100",60,210);
            g2d.drawString("成绩",55,110);
            g2d.drawString("科目",660,725);
            Font f1 = new Font("方正舒体",Font.BOLD,50);
            g2d.setFont(f1);
            g2d.drawString("成绩分布柱状图",210,60);
        }
    }
}
