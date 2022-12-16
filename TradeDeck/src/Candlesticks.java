import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Candlesticks extends JPanel {
    int[] cordx={80,100,120,140,160,180};
    int low[]={200,100,150,100,90,110};
    int high[]={260,200,190,180,180,190};
    int[] open={215,240,180,220,160,160};
    int[] close={245,210,200,280,140,170};
    int marg=20;
    
    protected void paintComponent(Graphics grf){
        super.paintComponent(grf);
        Graphics2D graph=(Graphics2D)grf;
        
        int height = getHeight();
        int width= getWidth();
        //x-axis
        graph.draw(new Line2D.Double(marg,height-marg,width-marg,height-marg));
        
        //y-axis
        graph.draw(new Line2D.Double(marg,marg,marg,height-marg));
        
        //vertical grids
        int xstart=0;
        for(int i=2;i<20;i++){
            xstart=i*(width/21);
            graph.drawLine(xstart,marg,xstart,height-marg);
        }
        //horizontal grids
        int ystart=1;
        for(int i=1;i<13;i++){
            ystart=i*(width/21);
            graph.drawLine(marg,ystart,width-marg,ystart);
        }
        
        for(int i=0;i<cordx.length;i++){
            if(open[i]<=close[i]){
                graph.setPaint(Color.green);
                graph.draw(new Line2D.Double(marg+cordx[i],height-marg-low[i],marg+cordx[i],height-marg-open[i]));
                graph.fillRect(marg+cordx[i]-10, height-marg-close[i], 20, close[i]-open[i]);
                graph.draw(new Line2D.Double(marg+cordx[i],height-marg-close[i],marg+cordx[i],height-marg-high[i]));
            }else{
                graph.setPaint(Color.red);
                graph.draw(new Line2D.Double(marg+cordx[i],height-marg-low[i],marg+cordx[i],height-marg-open[i]));
                graph.fillRect(marg+cordx[i]-10, height-marg-close[i], 20, open[i]-close[i]);
                graph.draw(new Line2D.Double(marg+cordx[i],height-marg-close[i],marg+cordx[i],height-marg-high[i]));
            }    
        }    
    }    
}
