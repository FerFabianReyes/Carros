package canvas;
import java.awt.Color;
public class Vehicle {
    private int speedY, speedX;
    private Color color;
    private Dot dot;
    
    public Vehicle(int x, int y, int speedX, int speedY, Color color){
        dot = new Dot(x,y);
        this.speedX = speedX;
        this.speedY = speedY;
        this.color = color;
    }
    
    public Vehicle(Dot d, int speedY, int speedX, Color color){
        dot = new Dot(d.getX(), d.getY());
        this.speedX = speedX;
        this.speedY = speedY;
        this.color = color;
    }
    
    public int getSpeedX(){
        return speedX;
    }
    
    public int getSpeedY(){
        return speedY;
    }
    
    public Color getColor(){
        return color;
    }
    
    public void setSpeedX(int speedX){
        this.speedX = speedX;
    }
    
    public Dot getDot(){
        return dot;
    }
    
    public void setSpeedY(int speedY){
        this.speedY = speedY;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public void setDot(Dot dot){
        this.dot = dot;
    }

    public void move(){
        dot.addX(speedX);
        dot.addY(speedY);
    }
}
