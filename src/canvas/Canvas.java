package canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;
import javax.swing.JPanel;

public class Canvas extends JPanel implements ActionListener{
    ArrayList<Car> cars = new ArrayList<Car>();

    public Canvas () {
        setPreferredSize(new Dimension(400,300));
        Timer timer = new Timer(80, this);
        timer.start();
        cars.add(new Car(10, 250, 2, 0, Color.RED, 60,30));
        cars.add(new Car(10, 200, 3, 0, Color.BLUE, 50, 25));
        cars.add(new Car(10, 150, 4, 0, Color.GREEN, 40,20));
        cars.add(new Car(10, 100, 5, 0, Color.ORANGE, 30, 15) );
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        PaintBrush paintBrush = new PaintBrush(g);
        for(Car c : cars){
            c.move();
            c.draw(g);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}