/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseAbs;

/**
 *
 * @author LAB-USR-NA116-C0401
 */
public class Main {
    
    public static void main(String[] args) {
        
        Humano humano1 = new Humano();
        humano1.Comer();
        
        AnimalCarnivoro ac = new AnimalCarnivoro();
        ac.Comer();
        
        AnimalHerbivoro ah = new AnimalHerbivoro();
        ah.Comer();
    }
    
}
