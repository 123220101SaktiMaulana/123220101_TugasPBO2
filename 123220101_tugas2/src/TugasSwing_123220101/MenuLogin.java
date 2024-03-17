/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasSwing_123220101;

/**
 *
 * @author Aibra
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuLogin extends JFrame implements ActionListener{
    JLabel tulisan1 = new JLabel("Selamat Datang !");
    
    JLabel tulisan2 = new JLabel("Silahkan masuk untuk melanjutkan.");
    
    JLabel labelinput1 = new JLabel("Username");

    JTextField Inputuser = new JTextField();    
    
    
    JLabel labelpassword = new JLabel("Password");
    JTextField inputpassword = new JTextField(); 
    
    JLabel jenisKelamin = new JLabel("Jenis Kelamin");
    
    JRadioButton newBtn = new JRadioButton("Lakik");
    JRadioButton newBtn2 = new JRadioButton("Perempuan");
    
    JButton login1 = new JButton("Login");
    
//    ButtonGroup biji = new ButtonGroup();
    
    
    MenuLogin(){
        setVisible(true);
        setSize(720,480);
        setResizable(false);
        
//        biji.add(newBtn);
//        biji.add(newBtn2);
        
        setTitle("Login Page");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
        add(tulisan1);
        tulisan1.setHorizontalAlignment(JLabel.CENTER);
        tulisan1.setBounds(100, 10, 500, 30);
        tulisan1.setFont(new Font("Arial", Font.BOLD, 25));
        
        
        add(tulisan2);
        tulisan2.setBounds(5, 50, 300, 20);
        tulisan2.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(labelinput1);
        labelinput1.setBounds(5,110 ,200,20);
        labelinput1.setFont(new Font("Arial", Font.BOLD, 15));
        
        add(Inputuser);
        Inputuser.setBounds(4,130,690,35);
        
        add(labelpassword);
        labelpassword.setFont(new Font("Sans", Font.BOLD,15));
        labelpassword.setBounds(4,180,200,25);
        
        add(inputpassword);
        inputpassword.setBounds(4,200,690,35);
        
        
        add(jenisKelamin);
        jenisKelamin.setBounds(5, 250, 300, 20);
        jenisKelamin.setFont(new Font("Arial", Font.BOLD, 15));
        
        
        ButtonGroup pilihkelamin = new ButtonGroup();
        pilihkelamin.add(newBtn);
        pilihkelamin.add(newBtn2);
        
        add(newBtn);
        newBtn.setBounds(10, 280, 100, 32);
        
        add(newBtn2);
        newBtn2.setBounds(210, 280, 160, 32);
        
        add(login1);
        login1.setBounds(10,320,680,35);
        login1.setBackground(Color.white);
        login1.setFont(new Font("Arial", Font.BOLD, 15));
        login1.addActionListener(this);
    }
        @Override
        public void actionPerformed(ActionEvent e) {
            
            try {
                // Mengambil nilai dari username
                String username = Inputuser.getText();
                String password = inputpassword.getText();
                
                //Mengambil nilai dari jenis kelamin
                String JK = newBtn.isSelected() ? "L" : "P";


                //Memberikan error handling
                if (username.isEmpty()){
                    throw new Exception("Username tidak boleh kosong");
                }
                if (password.isEmpty()){
                    throw new Exception("Password tidak boleh kosong");
                }
            
                new HomePage(username,password,JK);
                this.dispose();
            }
            catch(Exception error){
                // Menampilkan error dalam bentuk pop up
                JOptionPane.showMessageDialog(this, error.getMessage());
            }
        }
}



//public 



//public class MenuLogin {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        Login log = new Login();
//    }
//    
//}
