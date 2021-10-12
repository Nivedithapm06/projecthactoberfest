import java.awt.*;
import java.awt.event.*;
public class MouseHandling extends Frame implements MouseListener{
    int x=0;int y=0;
    String str="";
    Label l;
    MouseHandling(){
        addMouseListener(this);
        l=new Label();
        setLayout(null);
        setSize(450,450);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
    str="The Mouse is Clicked";
    x=e.getX();
    y=e.getY();
    repaint();
    }

    public void mouseEntered(MouseEvent e){
    str="The Mouse Entered";
    x=e.getX();
    y=e.getY();
    repaint();
    }

    public void mouseMoved(MouseEvent e){
    str="The Mouse Moved";
    repaint();
    }

    public void mouseDragged(MouseEvent e){
    str="The Mouse is Dragged";
    repaint();
    }

    public void mouseExited(MouseEvent e){
    str="The Mouse is Exited";
    repaint();
    }

    public void mousePressed(MouseEvent e){
    str="The Mouse is Pressed";
    repaint();
    }

    public void mouseReleased(MouseEvent e){
    str="The Mouse is Released";
    repaint();
    }

    public void paint(Graphics g){
    g.drawString(str+" at("+x+","+y+")",50,50);
    }

    public static void main(String[] args){
    new MouseHandling();
    }
}
