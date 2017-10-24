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
public class FullTime extends Profesor{
    private float salary;

    public FullTime(String id, String name, Date hiringDate, String school, String departament,float salary) {
        super(id, name, hiringDate, school, departament);
        this.salary=salary;
    }

    @Override
    public float paySalary() {
        return salary;
    }
    
}
