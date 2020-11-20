/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan62.livingthing;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: Living Thing
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    }    
    
    public void eat(String nama) {
        System.out.println(nama + " Makan");
    }    
}