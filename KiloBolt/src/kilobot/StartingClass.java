package kilobot;
import java.applet.Applet;
import java.awt.Graphics;

public class StartingClass extends Applet implements Runnable{
  
  public StartingClass() {
    // TODO Auto-generated constructor stub
  }
  @Override
  public void init() {
    // TODO Auto-generated method stub
    super.init();
  }
  @Override
  public void start() {
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
  public void run() {
    // TODO Auto-generated method stub
    
  }
}
