/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jflexpruebacup;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

import umg.compiladores.Lexer;
import umg.compiladores.*;

/**
 *
 * @author fredy
 */
public class JflexpruebaCUP {

    public static void main(String[] args) throws FileNotFoundException, Exception {
     
        Reader r =new FileReader("C:/Users/fredy/Documents/UMG/PRUEBA.TXT");
        Lexer lex= new Lexer(r);
        
        parser p= new parser(lex);
        p.parse( );
    }
}
