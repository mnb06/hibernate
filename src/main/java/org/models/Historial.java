package org.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historial")
public class Historial {
    @Id
    @Column(name = "idhistorial")
    private int idhistorial;
    @Column(name = "materia")
    private String materia;
    @Column(name = "nota")
    private int nota;
    @Column(name = "idestudiante")
    private int idestudiante;

    //Constructor
    public Historial(String materia, int nota, int idestudiante) {
        this.materia = materia;
        this.nota = nota;
        this.idestudiante = idestudiante;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "idhistorial=" + idhistorial +
                ", materia='" + materia + '\'' +
                ", nota=" + nota +
                ", idestudiante=" + idestudiante +
                '}';
    }

    //IdHistorial
    public int getIdhistorial() {
        return idhistorial;
    }
    public void setIdhistorial(int idhistorial) {
        this.idhistorial = idhistorial;
    }

    //Materia
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }

   //Nota
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }

    //IdEstudiante
    public int getIdestudiante() {
        return idestudiante;
    }
    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }
}
