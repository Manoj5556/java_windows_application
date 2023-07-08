/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kit_bakery;

import java.awt.LayoutManager;
import javax.swing.JFrame;

/**
 *
 * @author veeramanikandan
 */
public class Kit_baker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        kit_bakery home= new kit_bakery();
        JFrame f = new JFrame();
        f.add(home);//adding button in JFrame  
 
        f.setSize(750,500);//400 width and 500 height  
//        f.setLayout(LayoutManager());//using no layout managers    
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
