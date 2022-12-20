import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class  candlestick_graph extends JPanel{
    int[] cordx={80,120,150,200,180};
    int[] low={200,150,120,80,37};
    int[] high={260,200,215,275,250};
    int[] open={110,215,250,240,100};
    int[] close={220,225,205,115,200};
    int marg=10;
    
    protected void paintComponent(Graphics grf){
        super.paintComponent(grf);
        Graphics2D graph= (Graphics2D)grf;
        
        int height= getHeight();
        int width = getWidth();
        
        //xaxis
        graph.draw(new Line2D.Double(marg,height-marg,width-marg,height-marg));
        //Yaxis
         graph.draw(new Line2D.Double(marg,marg,marg,height-marg));
         
         for(int i=0;i<cordx.length;i++){
             if(open[i]<=close[i]){
                 graph.setPaint(Color.green);
                 graph.draw(new Line2D.Double(marg+cordx[i],height-marg-low[i],marg+cordx[i],height-marg-open[i]));
                 graph.fillRect(marg+cordx[i]-10,height-marg-close[i],18,close[i]-open[i]);
                 graph.draw(new Line2D.Double(marg+cordx[i],height-marg-close[i],marg+cordx[i],height-marg-high[i]));
             }
             else{
                 graph.setPaint(Color.red);
                 graph.draw(new Line2D.Double(marg+cordx[i],height-marg-low[i],marg+cordx[i],height-marg-close[i]));
                 graph.fillRect(marg+cordx[i]-8,height-marg-open[i],12,open[i]-close[i]);
                 graph.draw(new Line2D.Double(marg+cordx[i],height-marg-open[i],marg+cordx[i],height-marg-high[i]));
                 
             }
                 
                 
             }
         }
         
    
}
