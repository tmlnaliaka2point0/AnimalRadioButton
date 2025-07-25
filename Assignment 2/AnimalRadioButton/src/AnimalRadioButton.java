
import javax.swing.*;
import java.awt.event.*;

public class AnimalRadioButton extends javax.swing.JFrame {


    public AnimalRadioButton() {
        initComponents(); // NetBeans generated method

        // Default image
        updateImage("pig");

        // Shared ActionListener for all radio buttons
        ActionListener listener = (ActionEvent e) -> {
            String selected = ((JRadioButton) e.getSource()).getText().toLowerCase();
            updateImage(selected);
            JOptionPane.showMessageDialog(AnimalRadioButton.this,
                    "You selected: " + selected.substring(0, 1).toUpperCase() + selected.substring(1),
                    "Pet Selection",
                    JOptionPane.INFORMATION_MESSAGE);
        };

        // Add listener to each button
        rdBird.addActionListener(listener);
        rdDog.addActionListener(listener);
        rdCat.addActionListener(listener);
        rdPig.addActionListener(listener);
        rdRabbit.addActionListener(listener);
    }

    private void updateImage(String animalName) {
        try {
            String fileName = "/images/" + animalName + ".jpeg";
            ImageIcon icon = new ImageIcon(getClass().getResource(fileName));
            jlImage.setIcon(icon);
            jlImage.setText(""); // clear fallback text
        } catch (Exception e) {
            jlImage.setIcon(null);
            jlImage.setText("Image not found for " + animalName);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        animals = new javax.swing.ButtonGroup();
        rdBird = new javax.swing.JRadioButton();
        rdDog = new javax.swing.JRadioButton();
        rdCat = new javax.swing.JRadioButton();
        rdPig = new javax.swing.JRadioButton();
        rdRabbit = new javax.swing.JRadioButton();
        jlImage = new javax.swing.JLabel();
        jlTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        animals.add(rdBird);
        rdBird.setText("Bird");
        rdBird.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rdBird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBirdActionPerformed(evt);
            }
        });
        getContentPane().add(rdBird, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 58, -1));

        animals.add(rdDog);
        rdDog.setText("Dog");
        rdDog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(rdDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 58, -1));

        animals.add(rdCat);
        rdCat.setText("Cat");
        rdCat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(rdCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 58, -1));

        animals.add(rdPig);
        rdPig.setText("Pig");
        rdPig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(rdPig, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 58, -1));

        animals.add(rdRabbit);
        rdRabbit.setText("Rabbit");
        rdRabbit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(rdRabbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jlImage.setText("imageLabel");
        jlImage.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(jlImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 610, 340));

        jlTitle.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jlTitle.setText("ANIMAL RADIO BUTTON");
        jlTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jlTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdBirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBirdActionPerformed
        

    // TODO add your handling code here:

            
    }//GEN-LAST:event_rdBirdActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new AnimalRadioButton().setVisible(true));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup animals;
    private javax.swing.JLabel jlImage;
    private javax.swing.JLabel jlTitle;
    public javax.swing.JRadioButton rdBird;
    private javax.swing.JRadioButton rdCat;
    private javax.swing.JRadioButton rdDog;
    private javax.swing.JRadioButton rdPig;
    private javax.swing.JRadioButton rdRabbit;
    // End of variables declaration//GEN-END:variables
}
