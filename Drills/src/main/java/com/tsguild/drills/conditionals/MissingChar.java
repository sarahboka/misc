/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.conditionals;

/**
 *
 * @author apprentice
 */
public class MissingChar {
//        Given a non-empty String and an int n, return a new String where the char at index n has been removed. The value of n will be a valid index of a char in the original String (Don't check for bad index). 
//
//    missingChar("kitten", 1) -> "ktten"
//    missingChar("kitten", 0) -> "itten"
//    missingChar("kitten", 4) -> "kittn"

    public String missingChar(String str, int n) {
        String newStr = str.substring(0, n) + str.substring(n + 1, str.length());
        return newStr;
//        char x = str.charAt(n);
//        String newStr = "";
//        for (char c : str.toCharArray()){
//            if (c != x){
//                Character.toString(c);
//                newStr += c;
//            }
//        }
//        return newStr;
    }
}
