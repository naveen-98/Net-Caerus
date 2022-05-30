
import java.awt.Color;

/**
 *
 * @author Naviya
 */
public class loading extends javax.swing.JFrame implements Runnable{

  
    public loading() {
              initComponents();
        loadbar.setForeground(Color.GREEN);
        loadbar.setBackground(Color.BLACK);
        
        Thread t = new Thread((Runnable) this);
        t.start();
    }
    
    
    public void run() {
        
        for(int i = 1;i <= 100;i++){
            try{
                Thread.sleep(20);
            }catch (Exception e){
                e.printStackTrace();
            }
            
            jLabel1.setText(i+" %");
            loadbar.setValue(i);
            
        }
         
         Menu me = new Menu();
         me.setVisible(true);
         dispose();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loadbar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("0 %");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 70, -1));

        loadbar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                loadbarAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(loadbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 800, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\Loading-GIF-Image-28.gif")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadbarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_loadbarAncestorAdded

       
    }//GEN-LAST:event_loadbarAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar loadbar;
    // End of variables declaration//GEN-END:variables

    
    private Color Color(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
