/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SupSci;
import java.awt.Color;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 *
 * @author abusyed
 */
public class SuperScience extends javax.swing.JFrame {

   int callquestions;
    
     public void init()
     {
         callquestions = 0;
     }

    public SuperScience() {
        initComponents();
    }

    int count = 0;
    String[] imagenames = {"lotmoney 1_11.png"};
    
    int people = 0;
    String[]imagepeople={"audi_pole_x_11.png"};
    
    int phone = 0;
    String[] imagephone = {"phone_friend_x_11.png"};
    
    int fifty50 = 0;
    String[] imagefifty50 = {"50_50_x_11.png"};
    
    int correct0 = 0;
    String[] imagecorrect0  = {"lotmoney_1.png"};
    
    int correct1 = 0;
    String[] imagecorrect1  = {"lotmoney_2.png"};
    
    int correct2 = 0;
    String[] imagecorrect2  = {"lotmoney_3.png"};
    
    int correct3 = 0;
    String[] imagecorrect3  = {"lotmoney_4.png"};
    
    int correct4 = 0;
    String[] imagecorrect4  = {"lotmoney_5.png"};
    
    int correct5 = 0;
    String[] imagecorrect5  = {"lotmoney_6.png"};
    
    int correct6 = 0;
    String[] imagecorrect6  = {"lotmoney_7.png"};
    
    int correct7 = 0;
    String[] imagecorrect7  = {"lotmoney_8.png"};
    
    int correct8 = 0;
    String[] imagecorrect8  = {"lotmoney_9.png"};
    
    int correct9 = 0;
    String[] imagecorrect9  = {"lotmoney_10.png"};
    
    int correct10 = 0;
    String[] imagecorrect10  = {"lotmoney_11.png"};
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 760));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SupSci/images/audi_pole_11.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SupSci/images/phone_friend_11.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SupSci/images/50_50_11.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SupSci/images/lotmoney_1.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SupSci/images/sup_logo.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 4, true));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 4, true));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jTextField3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 4, true));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jTextField4.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 4, true));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jTextField5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 4, true));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel5.setForeground(java.awt.Color.blue);
        jLabel5.setText("Sure?");

        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton3.setForeground(java.awt.Color.blue);
        jButton3.setText("No");
        jButton3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 4, true));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton2.setForeground(java.awt.Color.blue);
        jButton2.setText("Yes");
        jButton2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 4, true));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jButton1))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(2, 2, 2)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     this.getContentPane().setBackground(Color.black);
         jButton1.setBackground(Color.black);
         
         jTextField1.setText("Who wants to be a Millionaire");
        jTextField2.setText("                   ");
         jTextField3.setText("                   ");
          jTextField4.setText("                   ");
           jTextField5.setText("                   ");
           
           jButton3.setVisible(false);
       jButton2.setVisible(false);
      
     jLabel5.setVisible(false);
     jButton3.setBackground(Color.black);
     jButton2.setBackground(Color.black);

    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       callquestions = callquestions+ 1;
       
       jTextField3.setForeground(Color.WHITE);
       jTextField2.setForeground(Color.WHITE);
       jTextField4.setForeground(Color.WHITE);
       jTextField5.setForeground(Color.WHITE);
       jTextField1.setForeground(Color.WHITE);
       
       jTextField3.setBackground(Color.BLACK);
       jTextField2.setBackground(Color.BLACK);
       jTextField4.setBackground(Color.BLACK);
       jTextField5.setBackground(Color.BLACK);
       jTextField1.setBackground(Color.BLACK);
       
       jButton3.setVisible(false);
       jButton2.setVisible(false);
       
       jLabel5.setVisible(false);
      
       if(callquestions == 1){
           jTextField1.setText("Who is Robert Brown?");
           jTextField2.setText("A) Scientist");
           jTextField3.setText("B) Mathematician");
           jTextField4.setText("C) Teacher");
           jTextField5.setText("D) Professor");
           
           ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/lotmoney_1.png"));
        }
       if(correct1 < 0)correct1 = 1;
       if(correct1 >= 0 && correct1< imagecorrect1.length){
           jLabel6.setIcon(imagelist1[correct1]);
           
           
           correct1++;
       }      
       }
           
           if(callquestions == 2){
           jTextField1.setText("Which among these parts is in digestive system?");
           jTextField2.setText("A) Brain");
           jTextField3.setText("B) Liver");
           jTextField4.setText("C) Kidney");
           jTextField5.setText("D) Uterus");
           
           ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/lotmoney_2.png"));
        }
       if(correct2 < 0)correct2 = 1;
       if(correct2 >= 0 && correct2< imagecorrect2.length){
           jLabel6.setIcon(imagelist1[correct2]);
           
           
           correct2++;
       }      
           }
    
           if(callquestions == 3){
           jTextField1.setText("Who proposed relativity theory?");
           jTextField2.setText("A) Thomas Alva Edison");
           jTextField3.setText("B) Isaac Newton");
           jTextField4.setText("C) Albert Einstein");
           jTextField5.setText("D) Charles Darwin");
    
           ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/lotmoney_3.png"));
        }
       if(correct3 < 0)correct3 = 1;
       if(correct3 >= 0 && correct3< imagecorrect3.length){
           jLabel6.setIcon(imagelist1[correct3]);
           
           
           correct3++;
       }      
    }  
    if(callquestions == 4){
           jTextField1.setText("What does liver secrete?");
           jTextField2.setText("A) Pancreatic Juice");
           jTextField3.setText("B) Bile");
           jTextField4.setText("C) Hydrocloric Acid");
           jTextField5.setText("D) Saliva");
    
           ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/lotmoney_4.png"));
        }
       if(correct4 < 0)correct4 = 1;
       if(correct4 >= 0 && correct4< imagecorrect4.length){
           jLabel6.setIcon(imagelist1[correct4]);
           
           
           correct4++;
       }      
    }  
    if(callquestions == 5){
           jTextField1.setText("Who was the person used his brain the most?");
           jTextField2.setText("A) Albert Einstein");
           jTextField3.setText("B) Thomas Alva Edison");
           jTextField4.setText("C) Isaac Newton");
           jTextField5.setText("D) Andrew Steve Thomson");
    
           ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/lotmoney_5.png"));
        }
       if(correct5 < 0)correct5 = 1;
       if(correct5 >= 0 && correct5< imagecorrect5.length){
           jLabel6.setIcon(imagelist1[correct5]);
           
           
           correct5++;
       }      
           
    }  if(callquestions == 6){
           jTextField1.setText("What is the speed of light?");
           jTextField2.setText("A) 3 km/h");
           jTextField3.setText("B) 3 00 000 km/h");
           jTextField4.setText("C) 3 00 000 km/s");
           jTextField5.setText("D) 3 00 000 m/s");
           
           ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/lotmoney_6.png"));
        }
       if(correct6 < 0)correct6 = 1;
       if(correct6 >= 0 && correct6< imagecorrect6.length){
           jLabel6.setIcon(imagelist1[correct6]);
           
           
           correct6++;
       }      
    
    }  if(callquestions == 7){
           jTextField1.setText("How many bones are there in our body?");
           jTextField2.setText("A) 100");
           jTextField3.setText("B) 212");
           jTextField4.setText("C) 206");
           jTextField5.setText("D) 266");
           
           ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/lotmoney_7.png"));
        }
       if(correct7 < 0)correct7 = 1;
       if(correct7 >= 0 && correct7< imagecorrect7.length){
           jLabel6.setIcon(imagelist1[correct7]);
           
           
           correct7++;
       }      
    
    }  if(callquestions == 8){
           jTextField1.setText("What is the size of our heart?");
           jTextField2.setText("A) The size of finger");
           jTextField3.setText("B) The size of fist");
           jTextField4.setText("C) The size of palm");
           jTextField5.setText("D) The size of wrist");
           
           ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/lotmoney_8.png"));
        }
       if(correct8 < 0)correct8 = 1;
       if(correct8 >= 0 && correct8< imagecorrect8.length){
           jLabel6.setIcon(imagelist1[correct8]);
           
           
           correct8++;
       }      
    
    }  if(callquestions == 9){
           jTextField1.setText("In which unit is pulse measured?");
           jTextField2.setText("A) bpm");
           jTextField3.setText("B) ppm");
           jTextField4.setText("C) bps");
           jTextField5.setText("D) bph");
           
           ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/lotmoney_9.png"));
        }
       if(correct9 < 0)correct9 = 1;
       if(correct9 >= 0 && correct9< imagecorrect9.length){
           jLabel6.setIcon(imagelist1[correct9]);
           
           
           correct9++;
       }      
    
    }  if(callquestions == 10){
           jTextField1.setText("What is the lightest element in periodic table?");
           jTextField2.setText("A) Helium");
           jTextField3.setText("B) Lithium");
           jTextField4.setText("C) Hydroxide");
           jTextField5.setText("D) Hydrogen");
    
           ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/lotmoney_10.png"));
        }
       if(correct10 < 0)correct10 = 1;
       if(correct10 >= 0 && correct10< imagecorrect10.length){
           jLabel6.setIcon(imagelist1[correct10]);
           
           
           correct10++;
       }      
    } 
    
    if(callquestions == 11){
        
        
       this.dispose();
      
    }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/audi_pole_x_11.png"));
        }
       if(people < 0)people = 1;
       if(people >= 0 && people< imagepeople.length){
           jLabel2.setIcon(imagelist1[people]);
           
           
           people++;
       }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/phone_friend_x_11.png"));
        }
       if(phone < 0)phone = 1;
       if(phone >= 0 && phone< imagephone.length){
           jLabel1.setIcon(imagelist1[phone]);
           
           
           phone++;
       }

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i=0;i< imagelist1.length;i++){
            imagelist1[i] = new ImageIcon(getClass().getResource("/SupSci/images/50_50_x_11.png"));
        }
       if(fifty50 < 0)fifty50 = 1;
       if(fifty50 >= 0 && fifty50< imagefifty50.length){
           jLabel3.setIcon(imagelist1[fifty50]);
           
           
           fifty50++;
       }      
       if(callquestions == 1 && jLabel1.isFocusable()){
           jTextField3.setForeground(Color.black);
           jTextField5.setForeground(Color.black);
       }
       if(callquestions == 2 && jLabel1.isFocusable()){
           jTextField2.setForeground(Color.black);
           jTextField5.setForeground(Color.black);
       }
       if(callquestions == 3 && jLabel1.isFocusable()){
           jTextField3.setForeground(Color.black);
           jTextField5.setForeground(Color.black);
       }
       if(callquestions == 4 && jLabel1.isFocusable()){
           jTextField2.setForeground(Color.black);
           jTextField5.setForeground(Color.black);
       }
       if(callquestions == 5 && jLabel1.isFocusable()){
           jTextField3.setForeground(Color.black);
           jTextField5.setForeground(Color.black);
       }
       if(callquestions == 6 && jLabel1.isFocusable()){
           jTextField2.setForeground(Color.black);
           jTextField3.setForeground(Color.black);
       }
       if(callquestions == 7 && jLabel1.isFocusable()){
           jTextField2.setForeground(Color.black);
           jTextField5.setForeground(Color.black);
       }
       if(callquestions == 8 && jLabel1.isFocusable()){
           jTextField2.setForeground(Color.black);
           jTextField5.setForeground(Color.black);
       }
       if(callquestions == 9 && jLabel1.isFocusable()){
           jTextField4.setForeground(Color.black);
           jTextField5.setForeground(Color.black);
       }
       if(callquestions == 10 && jLabel1.isFocusable()){
           jTextField3.setForeground(Color.black);
           jTextField4.setForeground(Color.black);
       }

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setBackground(Color.yellow);
        jButton3.setVisible(true);
        jButton2.setVisible(true);
        jLabel5.setVisible(true);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
       jTextField3.setBackground(Color.yellow);
        jButton3.setVisible(true);
        jButton2.setVisible(true);
        jLabel5.setVisible(true);
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField4.setBackground(Color.yellow);
        jButton3.setVisible(true);
        jButton2.setVisible(true);
        jLabel5.setVisible(true);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        jTextField5.setBackground(Color.yellow);
        jButton3.setVisible(true);
        jButton2.setVisible(true);
        jLabel5.setVisible(true);
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       if(callquestions == 1 && jTextField2.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        
        }
       if(callquestions == 1 && jTextField3.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        jTextField3.setBackground(Color.red);
               }
       if(callquestions == 1 && jTextField4.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        jTextField4.setBackground(Color.red);
               }
       if(callquestions == 1 && jTextField5.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        jTextField5.setBackground(Color.red);
               }
       
       
       if(callquestions == 2 && jTextField2.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.red);
        jTextField3.setBackground(Color.green);
        
        }
       if(callquestions == 2 && jTextField3.getBackground() == (Color.yellow)){
        
        jTextField3.setBackground(Color.green);
               }
       if(callquestions == 2 && jTextField4.getBackground() == (Color.yellow)){
        jTextField3.setBackground(Color.green);
        jTextField4.setBackground(Color.red);
               }
       if(callquestions == 2 && jTextField5.getBackground() == (Color.yellow)){
        jTextField3.setBackground(Color.green);
        jTextField5.setBackground(Color.red);
               }
       
       if(callquestions == 3 && jTextField2.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.red);
        jTextField4.setBackground(Color.green);
        
        }
       if(callquestions == 3 && jTextField3.getBackground() == (Color.yellow)){
        jTextField4.setBackground(Color.green);
        jTextField3.setBackground(Color.red);
               }
       if(callquestions == 3 && jTextField4.getBackground() == (Color.yellow)){
        jTextField4.setBackground(Color.green);
        
               }
       if(callquestions == 3 && jTextField5.getBackground() == (Color.yellow)){
        jTextField4.setBackground(Color.green);
        jTextField5.setBackground(Color.red);
               }
       
       if(callquestions == 4 && jTextField2.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.red);
        jTextField3.setBackground(Color.green);
        
        }
       if(callquestions == 4 && jTextField3.getBackground() == (Color.yellow)){
        
        jTextField3.setBackground(Color.green);
               }
       if(callquestions == 4 && jTextField4.getBackground() == (Color.yellow)){
        jTextField3.setBackground(Color.green);
        jTextField4.setBackground(Color.red);
               }
       if(callquestions == 4 && jTextField5.getBackground() == (Color.yellow)){
        jTextField3.setBackground(Color.green);
        jTextField5.setBackground(Color.red);
               }
       
       if(callquestions == 5 && jTextField2.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        
        }
       if(callquestions == 5 && jTextField3.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        jTextField3.setBackground(Color.red);
               }
       if(callquestions == 5 && jTextField4.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        jTextField4.setBackground(Color.red);
               }
       if(callquestions == 5 && jTextField5.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        jTextField5.setBackground(Color.red);
               }
       
        if(callquestions == 6 && jTextField2.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.red);
        jTextField4.setBackground(Color.green);
        }
       if(callquestions == 6 && jTextField3.getBackground() == (Color.yellow)){
        jTextField4.setBackground(Color.green);
        jTextField3.setBackground(Color.red);
               }
       if(callquestions == 6 && jTextField4.getBackground() == (Color.yellow)){
        
        jTextField4.setBackground(Color.green);
               }
       if(callquestions == 6 && jTextField5.getBackground() == (Color.yellow)){
        jTextField4.setBackground(Color.green);
        jTextField5.setBackground(Color.red);
               }
       
       if(callquestions == 7 && jTextField2.getBackground() == (Color.yellow)){
        jTextField4.setBackground(Color.green);
        jTextField2.setBackground(Color.red);
        
        }
       if(callquestions == 7 && jTextField3.getBackground() == (Color.yellow)){
        jTextField4.setBackground(Color.green);
        jTextField3.setBackground(Color.red);
               }
       if(callquestions == 7 && jTextField4.getBackground() == (Color.yellow)){
       
        jTextField4.setBackground(Color.green);
               }
       if(callquestions == 7 && jTextField5.getBackground() == (Color.yellow)){
        jTextField4.setBackground(Color.green);
        jTextField5.setBackground(Color.red);
               }
       
       if(callquestions == 8 && jTextField2.getBackground() == (Color.yellow)){
        jTextField3.setBackground(Color.green);
        jTextField2.setBackground(Color.red);
        }
       if(callquestions == 8 && jTextField3.getBackground() == (Color.yellow)){
      
        jTextField3.setBackground(Color.green);
               }
       if(callquestions == 8 && jTextField4.getBackground() == (Color.yellow)){
        jTextField3.setBackground(Color.green);
        jTextField4.setBackground(Color.red);
               }
       if(callquestions == 8 && jTextField5.getBackground() == (Color.yellow)){
        jTextField3.setBackground(Color.green);
        jTextField5.setBackground(Color.red);
               }
       
       if(callquestions == 9 && jTextField2.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        
        }
       if(callquestions == 9 && jTextField3.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        jTextField3.setBackground(Color.red);
               }
       if(callquestions == 9 && jTextField4.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        jTextField4.setBackground(Color.red);
               }
       if(callquestions == 9 && jTextField5.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.green);
        jTextField5.setBackground(Color.red);
               }
       
       if(callquestions == 10 && jTextField2.getBackground() == (Color.yellow)){
        jTextField2.setBackground(Color.red);
        jTextField5.setBackground(Color.green);
        
        }
       if(callquestions == 10 && jTextField3.getBackground() == (Color.yellow)){
        jTextField5.setBackground(Color.green);
        jTextField3.setBackground(Color.red);
               }
       if(callquestions == 10 && jTextField4.getBackground() == (Color.yellow)){
        jTextField5.setBackground(Color.green);
        jTextField4.setBackground(Color.red);
               }
       if(callquestions == 10 && jTextField5.getBackground() == (Color.yellow)){
        jTextField5.setBackground(Color.green);
       
               }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       jButton2.setVisible(false);
        jButton3.setVisible(false);
        jLabel5.setVisible(false);
        
        jTextField2.setBackground(Color.black);
        jTextField3.setBackground(Color.black);
        jTextField4.setBackground(Color.black);
        jTextField5.setBackground(Color.black);
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(SuperScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperScience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperScience().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}







































































































































