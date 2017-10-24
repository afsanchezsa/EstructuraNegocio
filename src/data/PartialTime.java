/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class PartialTime extends Profesor{
private String category;
private int classHours;
    public PartialTime(String id, String name, Date hiringDate, String school, String departament,String category,int classHours) {
        super(id, name, hiringDate, school, departament);
    this.category=category;
    this.classHours=classHours;
    }

    @Override
    public float paySalary() {
        if(this.category.equals("A")){
        return this.classHours*60000;
        }else if(this.category.equals("B")){
        
        return this.classHours*80000;
        
        }else if(this.category.equals("C")){
        
        return this.classHours*100000;
        }
        else{
            throw new IllegalArgumentException("Category not found");
       // return 0;//aqui podriamos lanzar un illegalargument exception
        }
    }
    
}
