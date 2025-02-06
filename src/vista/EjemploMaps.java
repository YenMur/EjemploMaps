/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import model.Estudiante;

/**
 *
 * @author lxyen
 */
public class EjemploMaps {
    
    public static void main(String[]args){
//        Map<Integer, String> mapsName=new HashMap<>();
//        mapsName.put(20, "Alejo");
//        mapsName.put(14, "Maria");
//        mapsName.put(2, "Andrea");
//        
//        
//        
//        Iterator<Map.Entry<Integer, String>> entryIterator= mapsName.entrySet().iterator();
//        while(entryIterator.hasNext()){
//            Map.Entry<Integer, String> entry= entryIterator.next();
//            System.out.println("Clave: "+ entry.getKey()+", Valor "+entry.getValue());
//        }

        Map<Integer, Estudiante> mapEstudiante=new HashMap<>();
        
        mapEstudiante.put(20, new Estudiante("Ing multimedia", "23874", "Alejo","Alejo@uao.com","cra 287"));
        mapEstudiante.put(21, new Estudiante("Ing multimedia", "29843", "Maria","Maria@uao.com","cll 983"));
    }
    
}
