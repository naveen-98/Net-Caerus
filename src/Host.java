
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.net.InetAddress;

 public class Host {
    Host() {
    }
        public static void main (String[] args){
//int ai;
            try {
                InetAddress ia = InetAddress.getLocalHost();
                JOptionPane.showMessageDialog(null, "My Host Name : "+ ia.getCanonicalHostName(), "Net Caerus", JOptionPane.PLAIN_MESSAGE);
           //    System.out.println("Address: " + ia.getHostAddress());
            } catch (Exception var2) {
            }

      //      JOptionPane.showMessageDialog(null, "Address:"+ ia.getHostAddress, "Title", JOptionPane.PLAIN_MESSAGE);
        }

    void setVisible(boolean b) {
         WindowEvent closeWindow;
    //     closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
     //    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    }
    

