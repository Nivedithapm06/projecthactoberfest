import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class TrafficSignal extends JPanel implements ActionListener{
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private Color cred;
    private Color cgreen;
    private Color cyellow;
    
    public TrafficSignal()
    {
        setBounds(0,0,640,480);
        rb1 = new JRadioButton("Red");
        rb2 = new JRadioButton("Yellow");
        rb3 = new JRadioButton("Green");
        rb1.setSelected(true);
        cred=Color.red;
        cyellow=getBackground();
        cgreen=getBackground();
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        add(rb1);
        add(rb2);
        add(rb3);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(rb1.isSelected()==true){
            cred=Color.red;
            cyellow=getBackground();
            cgreen=getBackground();
        }
        else if(rb2.isSelected()==true){
            cred=getBackground();
            cyellow=Color.yellow;
            cgreen=getBackground();
        }
        else if(rb3.isSelected()==true){
            cred=getBackground();
            cyellow=getBackground();
            cgreen=Color.green;
        }
        
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawOval(50,50,50,50);
        g.drawOval(50,110,50,50);
        g.drawOval(50,170,50,50);
        g.setColor(cred);
        g.fillOval(50,50,50,50);
        g.setColor(cyellow);
        g.fillOval(50,110,50,50);
        g.setColor(cgreen);
        g.fillOval(50,170,50,50);
    }
}

class TrafficLight{
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(640,480);
        jf.setLayout(null);
        TrafficSignal ts = new TrafficSignal();
        jf.add(ts);
    }
}
