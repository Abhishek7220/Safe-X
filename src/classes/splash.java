/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;
import static ui.SplashScreen.prLabel;
import static ui.SplashScreen.progressbar;

/**
 *
 * @author ABHISHEK
 */
public class splash {

    public static void main(String[] args) {
        ui.SplashScreen frame = new ui.SplashScreen();
        frame.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                int s = 20;
                Thread.sleep(s);
                prLabel.setText(Integer.toString(i) + "%");
                
                int x = prLabel.getX();
                int y = prLabel.getY();
                int h = prLabel.getHeight();
                int w = prLabel.getWidth();
                x += 6;

                prLabel.setBounds(x, y, h, w);
                progressbar.setValue(i);
                
            }
        } catch (Exception e) {
        }
    }
}
