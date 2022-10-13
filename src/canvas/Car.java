package canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Car extends Vehicle {
    private int w, h;
    
    public Car(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }
    
    public void draw(Graphics g){
        g.setColor(this.getColor());
        g.fillRect(getDot().getX(), getDot().getY(), w, h);
        
        g.fillRect(getDot().getX()+w/5, getDot().getY()-(h*3)/4, w/2, (h*3)/4);
        g.setColor(Color.GRAY);
        g.fillOval(getDot().getX()+(w*4)/5, getDot().getY()+h, h/5, w/5);
        g.fillOval(getDot().getX()+w/20, getDot().getY()+h, w/5, w/5);
        g.setColor(Config.GRAY_T);
        g.fillOval((getDot().getX()+(w))-w/7, getDot().getY()+(h+ (h/10)), w/10, w/10);
        g.fillOval(getDot().getX()+w/10, getDot().getY()+(h+ (h/10)), h/10, h/10);
        g.setColor(Config.BLUE);
        g.fillRect(getDot().getX()+w/4, getDot().getY()-(h*2/3), w/5, (h*3)/5);
        g.fillRect(getDot().getX()+w/2, getDot().getY()-(h*2/3), w/6, (h*3)/5);
        g.setColor(Config.YELLOW);
        g.fillRect((getDot().getX()+w)-w/10, getDot().getY()+(h*4)/6, w/10, h/10);

    }
    
}
