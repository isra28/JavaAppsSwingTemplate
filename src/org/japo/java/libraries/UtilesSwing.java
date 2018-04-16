/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class UtilesSwing {
    public static final String LNF_WINDOWS = "Windows";
    public static final String LNF_WINDOWS_CLASSIC = "Windows Classic";
    public static final String LNF_MOTIF = "CDE/Motif";
    public static final String LNF_METAL = "Metal";
    public static final String LNF_NIMBUS = "Nimbus";
    
    public static boolean establecerLnF (String lnf) {
        boolean procesoOK;
        try {
            for (UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
                if (lnf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
            }
        }
        procesoOK = true;    
    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        procesoOK = false;
            System.out.println("ERROR: Instalación de Lnf cancelada");
    }
       return procesoOK;
}
    
    public static void establecerFavicon (JFrame ventana, String rutaFavicon) {
        try {
            URL icnUrl = ClassLoader.getSystemResource(rutaFavicon);
            ventana.setIconImage(new ImageIcon(icnUrl).getImage());
        } catch (Exception e) {
            System.out.println("ERROR: Instalación de favicon cancelada");
        }
    }
}
