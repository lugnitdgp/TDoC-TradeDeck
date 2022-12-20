import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Graph extends JPanel {
    int[] cordx={30,70,125};
    int[] cordy={20,30,50};
    int marg=30;
    
    protected void paintComponent(Graphics grf){
        super.paintComponent(grf);
        Graphics2D graph= (Graphics2D)grf;
        
        int height= getHeight();
        int width = getWidth();
        
//        graph.setPaint(Color.black);
        
        //xaxis
        graph.draw(new Line2D.Double(marg,height-marg,width-marg,height-marg));
        //Yaxis
         graph.draw(new Line2D.Double(marg,marg,marg,height-marg));
         graph.setPaint(Color.red);
         for(int i=0;i<cordx.length;i++){
             int x=marg+cordx[i];
             int y=height-marg-cordy[i];
         graph.fill(new Ellipse2D.Double(x,y,10,12));
         }
    }
}
