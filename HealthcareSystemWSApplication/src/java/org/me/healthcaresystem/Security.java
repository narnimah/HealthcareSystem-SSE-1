/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.healthcaresystem;

import java.util.Arrays;

/**
 *
 * @author DanielMedina
 */
public class Security {
    
    public String encrypt(String data){
        System.out.println("Decrypted Data: " + data);
        char[] prep = data.toCharArray();
        char[] encrypted = new char[prep.length];
        for(int i = 0; i < prep.length; i++){
            encrypted[i] = (char) (prep[i] + 1);
        }
        System.out.println("Ecrypted data: " + String.valueOf(encrypted));
        return String.valueOf(encrypted);
    }
    
    
    
    public String decrypt(String data){
        System.out.println("Encrypted Data: " + data);
        char[] prep = data.toCharArray();
        System.out.println("Prep data: " + Arrays.toString(prep));
        char[] decrypted = new char[prep.length];
        for(int i = 0; i < prep.length; i++){
            decrypted[i] = (char) (prep[i] - 1);
        }
        System.out.println("Decrypted data: " + String.valueOf(decrypted));
        return String.valueOf(decrypted);
    }
}