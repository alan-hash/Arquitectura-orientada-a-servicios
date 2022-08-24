/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 */
public class Usuario {
    
    private String IdAlumno, Nombre,Entrada,Salida,Actividad,Fecha;

    public Usuario(String IdAlumno, String Nombre, String Entrada, String Salida,String Actividad,String Fecha) {
        this.IdAlumno =IdAlumno;
        this.Nombre = Nombre;
        this.Entrada=Entrada;
        this.Salida=Salida;
        this.Actividad=Actividad;
        this.Fecha=Fecha;
        
    }

    public String getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(String IdAlumno) {
        this.IdAlumno = IdAlumno;
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEntrada() {
        return Entrada;
    }

    public void setEntrada(String Entrada) {
        this.Entrada = Entrada;
    }

    public String getSalida() {
        return Salida;
    }

    public void setSalida(String Salida) {
        this.Salida = Salida;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    

  
}
