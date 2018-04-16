/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class UtilesDB {

    public static final String FICHERO_PRP = "db.properties";
    public static final String PRP_PROT = "protocol";
    public static final String PRP_HOST = "host";
    public static final String PRP_PORT = "port";
    public static final String PRP_DBAM = "db";
    public static final String PRP_USER = "user";
    public static final String PRP_PASS = "pass";

    public static final String DEF_FORM_MYSQL = "%s://%s:%s/%s?user=%s&password=%s";
    public static final String DEF_PROT_MYSQL = "jdbc : mysql";
    public static final String DEF_HOST_MYSQL = "127.0.0.1";
    public static final String DEF_PORT_MYSQL = "3306";

    private static final String DEF_DBAM_MYSQL = "agenda";
    private static final String DEF_USER_MYSQL = "usuario";
    private static final String DEF_PASS_MYSQL = "usuario";
    private static final String DEF_CONS_MYSQL = String.format(DEF_FORM_MYSQL, DEF_PROT_MYSQL,
            DEF_HOST_MYSQL, DEF_PORT_MYSQL, DEF_DBAM_MYSQL, DEF_USER_MYSQL, DEF_PASS_MYSQL);

    public static final Connection obtenerConexion() throws SQLException {
        Connection con;
        if (new File(FICHERO_PRP).exists()) {
            Properties prp = UtilesApp.importarPropiedades(FICHERO_PRP);
            con = obtenerConexion(prp);
        } else {
            System.out.println("ERROR: Fichero propiedadesBD NO ENCONTRADO");
            con = obtenerConexion(DEF_CONS_MYSQL);
        }
        return con;
    }

    public static final Connection obtenerConexion(Properties prp) throws SQLException {
          String cadenaConexion = String.format (DEF_FORM_MYSQL, 
                prp.getProperty(PRP_PROT, DEF_PROT_MYSQL),
                prp.getProperty(PRP_HOST, DEF_HOST_MYSQL),
                prp.getProperty(PRP_PORT, DEF_PORT_MYSQL),
                prp.getProperty(PRP_DBAM, DEF_DBAM_MYSQL),
                prp.getProperty(PRP_USER, DEF_USER_MYSQL),
                prp.getProperty(PRP_PASS, DEF_PASS_MYSQL));
          return obtenerConexion(cadenaConexion);
    }
    
    public static final Connection obtenerConexion(String cadenaConexion) throws SQLException {
        return DriverManager.getConnection(cadenaConexion);
    }
    
    public static final Connection obtenerConexion(String prot, String host, String port, String db, String user, String pass) throws SQLException {
        String cadenaConexion = String.format (DEF_FORM_MYSQL, prot, host, port, db, user, pass);
        return obtenerConexion (cadenaConexion);
    }
    
    public static final Connection obtenerConexion(File f) throws SQLException {
        Connection con = null;
        if (f.exists()) {
            Properties prp = UtilesApp.importarPropiedades(f.getName());
            con = obtenerConexion(prp);
        }
        return con;
    }

}
