/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookfinder;


import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.*;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ihsanfrr
 */
public class HomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("./Images/icon.png")).getImage();
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton3.setBackground(new java.awt.Color(176, 38, 61));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("jButton1");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(529, 269));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtSearch.setText("Cari berdasarkan ISBN, Judul atau Pengarang");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnCari.setBackground(new java.awt.Color(176, 38, 61));
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tableBuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 38, 61)));
        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "JUDUL", "PENGARANG", "PENERBIT", "RAK", "STOK"
            }
        ));
        jScrollPane1.setViewportView(tableBuku);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(176, 38, 61));
        jLabel3.setText("Search Engine");

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookfinder/Images/harvard-white.png"))); // NOI18N

        btnLogout.setBackground(new java.awt.Color(176, 38, 61));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(176, 38, 61));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Riwayat Peminjaman");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(176, 38, 61));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Pencarian Buku");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(176, 38, 61));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Pengembalian");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(176, 38, 61));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Peminjaman");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(btnCari)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed
    Hashtable<Integer, Buku> hashtable = new Hashtable<>();
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:

        String keyword = txtSearch.getText().trim();
        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kata kunci tidak boleh kosong! \n Silahkan masukkan kata kunci lain!");
            return;
        }

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        for (Integer key : hashtable.keySet()) {
            Buku buku = hashtable.get(key);
            if (buku.getIsbn().contains(keyword) ||
                buku.getJudul().toLowerCase().contains(keyword.toLowerCase()) ||
                buku.getPengarang().toLowerCase().contains(keyword.toLowerCase()) ||
                buku.getPenerbit().toLowerCase().contains(keyword.toLowerCase())) {

                // Create a JLabel for each book information
                JLabel label = new JLabel("<html><body>"
                        + "<h3>ISBN: " + buku.getIsbn() + "</h3>"
                        + "<h4>Judul: " + buku.getJudul() + "</h4><br>"
                        + "<p>Pengarang: " + buku.getPengarang() + "<br>"
                        + "Penerbit: " + buku.getPenerbit() + "<br>"
                        + "Rak: " + buku.getRak() + "<br>"
                        + "Stok: " + buku.getStok() + "</p>"
                        + "<br>"
                        + "<img src='" + buku.getCoverUrl() + "' width='150' height='210'>"
                        + "</body></html>");

                // Add the JLabel to the JPanel
                Border border = BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 10 pixels of margin
                label.setBorder(border);
                panel.add(label);
            }
        }

        if (panel.getComponentCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tidak ada hasil yang ditemukan.");
        } else {
            // Create a JScrollPane for the JPanel
            JScrollPane scrollPane = new JScrollPane(panel);
            JOptionPane.showMessageDialog(null, scrollPane);
        }
        
    }//GEN-LAST:event_btnCariActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        
        hashtable.put(1, new Buku("9780061120084", "The Alchemist", "Paulo Coelho", "HarperOne", "A1", 5,"https://cdn-v2.theculturetrip.com/610x921/wp-content/uploads/2015/06/alchemist.webp"));
        hashtable.put(2, new Buku("9780142437209", "To Kill a Mockingbird", "Harper Lee", "Harper Perennial", "B2", 3,"https://cdn2.penguin.com.au/covers/original/9781785150357.jpg "));
        hashtable.put(3, new Buku("9780544003415", "The Lord of the Rings", "J.R.R. Tolkien", "Mariner Books", "C3", 7,"https://www.bibdsl.co.uk/imagegallery/bookdata/cd427/9780261103252.JPG "));
        hashtable.put(4, new Buku("9780140283334", "1984", "George Orwell", "Signet Classics", "D4", 2,"https://live.staticflickr.com/65535/5264195495_16c0ce80d6_b.jpg "));
        hashtable.put(5, new Buku("9780140449334", "Pride and Prejudice", "Jane Austen", "Penguin Classics", "E5", 4,"https://th.bing.com/th/id/OIP.4uvk-hCrj_dT2KcN3rTLOAAAAA?w=198&h=304&c=7&r=0&o=5&pid=1.7"));
        hashtable.put(6, new Buku("9780679720201", "Norwegian Wood", "Haruki Murakami", "Vintage Books", "F6", 6,"https://th.bing.com/th/id/OIP.Cr4OWeJ9g_5eDOIc66dzkgHaLc?w=198&h=305&c=7&r=0&o=5&pid=1.7"));
        hashtable.put(7, new Buku("9780062315007", "The Great Gatsby", "F. Scott Fitzgerald", "Scribner", "A2", 1,"https://th.bing.com/th/id/R.7c5697ee72aae7fe607f69d223740452?rik=sgWxstAv8tg2Eg&riu=http%3a%2f%2fd28hgpri8am2if.cloudfront.net%2fbook_images%2fonix%2fcvr9781471173936%2fthe-great-gatsby-9781471173936_hr.jpg&ehk=Jz0jBOB5sZkGZ0GWHtNFPKtFLQNRZEIuO6rAtLbpOOA%3d&risl=&pid=ImgRaw&r=0"));
        hashtable.put(8, new Buku("9780060935467", "Beloved", "Toni Morrison", "Vintage", "B3", 8,"https://th.bing.com/th/id/OIP.M5JeTZe9TyiepWmXWIJnDgAAAA?w=198&h=302&c=7&r=0&o=5&pid=1.7"));
        hashtable.put(9, new Buku("9780743273565", "The Catcher in the Rye", "J.D. Salinger", "Little, Brown", "C4", 3,"https://www.hachettebookgroup.com/wp-content/uploads/2017/06/9780316769488.jpg"));
        hashtable.put(10, new Buku("9780061120084", "The Alchemist", "Paulo Coelho", "HarperOne", "D5", 5,"https://cdn-v2.theculturetrip.com/610x921/wp-content/uploads/2015/06/alchemist.webp "));
        hashtable.put(11, new Buku("9780374530874", "The Road", "Cormac McCarthy", "Vintage", "E6", 2,"https://th.bing.com/th/id/OIP.UMK3ZnYpdWXH-8fQeQ3X6QHaLN?w=198&h=299&c=7&r=0&o=5&pid=1.7"));
        hashtable.put(12, new Buku("9781400032716", "The Kite Runner", "Khaled Hosseini", "Riverhead Books", "F1", 6,"https://th.bing.com/th/id/OIP.nOWyPMT5oB6t7rIjBedw5QHaLg?w=198&h=308&c=7&r=0&o=5&pid=1.7"));
        hashtable.put(13, new Buku("9780385484510", "Slaughterhouse-Five", "Kurt Vonnegut", "Dial Press", "A3", 3,"https://www.readersdigest.co.uk/media/Slaughterhouse-Five-2.jpg"));
        hashtable.put(14, new Buku("9780062073488", "The Bell Jar", "Sylvia Plath", "Harper Perennial", "B4", 7,"https://th.bing.com/th/id/OIP.2spRUnuizDWCxAvio8kZLgHaLR?w=198&h=302&c=7&r=0&o=5&pid=1.7"));
        hashtable.put(15, new Buku("9781400033416", "A Thousand Splendid Suns", "Khaled Hosseini", "Riverhead Books", "C5", 4,"https://th.bing.com/th/id/OIP.hYr3XfE5h-7rjo_fV380NwHaLL?w=178&h=269&c=7&r=0&o=5&pid=1.7"));
        hashtable.put(16, new Buku("9780143105985", "The Picture of Dorian Gray", "Oscar Wilde", "Penguin Classics", "D6", 5,"https://1.bp.blogspot.com/-pqX5hMyk1aY/YRo_i3Zi_vI/AAAAAAAAA-g/pTVlTxIshbkLvAbpzrNeoh-uOAl7TCx0gCLcBGAsYHQ/s2048/dorian%2Bgray.jpg"));
        hashtable.put(17, new Buku("9780143039433", "One Hundred Years of Solitude", "Gabriel Garcia Marquez", "Harper Perennial", "E1", 9,"https://th.bing.com/th/id/OIP.j7FnLmZzg3-rR2hbuIaVCgHaLS?w=178&h=271&c=7&r=0&o=5&pid=1.7"));
        hashtable.put(18, new Buku("9780062315007", "The Great Gatsby", "F. Scott Fitzgerald", "Scribner", "F2", 1,"https://th.bing.com/th/id/R.7c5697ee72aae7fe607f69d223740452?rik=sgWxstAv8tg2Eg&riu=http%3a%2f%2fd28hgpri8am2if.cloudfront.net%2fbook_images%2fonix%2fcvr9781471173936%2fthe-great-gatsby-9781471173936_hr.jpg&ehk=Jz0jBOB5sZkGZ0GWHtNFPKtFLQNRZEIuO6rAtLbpOOA%3d&risl=&pid=ImgRaw&r=0"));
        hashtable.put(19, new Buku("9781594480003", "The Road", "Cormac McCarthy", "Vintage", "A4", 4,"https://th.bing.com/th/id/OIP.UMK3ZnYpdWXH-8fQeQ3X6QHaLN?w=198&h=299&c=7&r=0&o=5&pid=1.7"));
        hashtable.put(20, new Buku("9780446310789", "To Kill a Mockingbird", "Harper Lee", "Warner Books", "B5", 2,"https://th.bing.com/th/id/OIP.Mu1VbXiNWT4T1SJ-g0z11AHaL7?w=178&h=286&c=7&r=0&o=5&pid=1.7"));

        DefaultTableModel model = (DefaultTableModel) tableBuku.getModel();

        for (Integer key : hashtable.keySet()) {
            Buku buku = hashtable.get(key);
            Object[] rowData = {buku.getIsbn(), buku.getJudul(), buku.getPengarang(), buku.getPenerbit(), buku.getRak(), buku.getStok()};
            model.addRow(rowData);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new AuthScreen().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchFocusGained

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        txtSearch.setText("Cari berdasarkan ISBN, Judul atau Pengarang");
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
          // inisiasi data buku
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeScreen homeScreen = new HomeScreen();
                homeScreen.setVisible(true);
              
                
            
            }
        });
        
        
       
        
        
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBuku;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
