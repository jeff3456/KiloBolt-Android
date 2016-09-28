package kilobot;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StartingClass extends Applet implements Runnable, KeyListener{
  private Robot robot;
  private Image image;
  private Graphics second;

  public StartingClass() {
    // TODO Auto-generated constructor stub
  }
  
  @Override
  public void init() {
    // TODO Auto-generated method stub
    setSize(800, 480);
    setBackground(Color.BLACK);
    setFocusable(true);
    Frame frame = (Frame) this.getParent().getParent();
    frame.setTitle("Q-Bot Alpha");
    addKeyListener(this);
  }
  @Override
  public void start() {
    robot = new Robot();
    Thread thread = new Thread(this);
    thread.start();
    super.start();
  }
  @Override
  public void destroy() {
    // TODO Auto-generated method stub
    super.destroy();
  }
  
  @Override
  public void stop() {
    // TODO Auto-generated method stub
    super.stop();
  }
  
  @Override
  public void paint(Graphics g) {
    // TODO Auto-generated method stub
    super.paint(g);
  }
  
  @Override
  public void update(Graphics g) {
    if (image == null) {
      image = createImage(this.getWidth(), this.getHeight());
      second = image.getGraphics();
    }


    second.setColor(getBackground());
    second.fillRect(0, 0, getWidth(), getHeight());
    second.setColor(getForeground());
    paint(second);


    g.drawImage(image, 0, 0, this);
  }

  @Override
  public void run() {
    // TODO Auto-generated method stub
    while(true){
      repaint();
      try {
      Thread.sleep(17);
      }catch (InterruptedException e) {
        e.printStackTrace();
      }

    }
  }

  @Override
  public void keyTyped(KeyEvent e) {
    switch (e.getKeyCode()) {
    case KeyEvent.VK_UP:
    break;

    case KeyEvent.VK_DOWN:
    break;

    case KeyEvent.VK_LEFT:
    break;

    case KeyEvent.VK_RIGHT:
    break;

    case KeyEvent.VK_SPACE:
    break;
    }
  }
  @Override
  public void keyPressed(KeyEvent e) {
    // TODO Auto-generated method stub
    
  }
  @Override
  public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub
    
  }
}
