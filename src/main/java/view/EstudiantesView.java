package view;

import controllers.EstudianteControler;

public class EstudiantesView {
    public static void main(String[] args) {


        //Crear Estudiante
        //String createEstudiante = new EstudianteControler().createEstudiante(5,"Lautaro", 45367286);
        //System.out.println(createEstudiante);


        //Borrar Estudiante (con el id)
        String deleteEstudiante = new EstudianteControler().deleteEstudiante(5);
        System.out.println(deleteEstudiante);


        //Actualizar Estudiante
        //String updateEstudiante = new EstudianteControler().updateEstudiante(2);
        //System.out.println(updateEstudiante);


        // Mostrar estudiante
        //String getEstudiante = new EstudianteControler().getEstudiante(2);
        //System.out.println(getEstudiante);

    }
}
