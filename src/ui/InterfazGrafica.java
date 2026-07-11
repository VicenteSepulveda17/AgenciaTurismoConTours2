package ui;

import data.GestorEntidades;
import model.*;


import javax.swing.JOptionPane;

public class InterfazGrafica {

    private GestorEntidades gestor;

    public InterfazGrafica() {
        gestor = new GestorEntidades();
    }

    public void iniciar() {

        String opcion;

        do {

            opcion = JOptionPane.showInputDialog(
                    "==== LLANQUIHUE TOUR ====\n\n" +
                            "1. Registrar Guía Turístico\n" +
                            "2. Registrar Vehículo\n" +
                            "3. Mostrar Entidades\n" +
                            "4. Salir\n\n" +
                            "Seleccione una opción: "
            );

            switch (opcion) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Nombre del guía:");

                    String rut = JOptionPane.showInputDialog("RUT:");

                    String telefono = JOptionPane.showInputDialog("Teléfono:");

                    String especialidad = JOptionPane.showInputDialog("Especialidad:");

                    int experiencia = Integer.parseInt(
                            JOptionPane.showInputDialog("Años de experiencia:")
                    );

                    Direccion direccion = new Direccion(
                            "Sin dirección",
                            "Llanquihue",
                            0
                    );

                    GuiaTuristico guia = new GuiaTuristico(
                            direccion,
                            nombre,
                            rut,
                            telefono,
                            experiencia,
                            especialidad
                    );

                    gestor.agregarEntidad(guia);

                    JOptionPane.showMessageDialog(
                            null,
                            "Guía turístico registrado correctamente."
                    );
                    break;

                case "2":
                    String patente = JOptionPane.showInputDialog("Patente:");

                    String tipo = JOptionPane.showInputDialog("Tipo de vehículo:");

                    int capacidad = Integer.parseInt(
                            JOptionPane.showInputDialog("Capacidad de pasajeros:")
                    );

                    Vehiculo vehiculo = new Vehiculo(
                            patente,
                            tipo,
                            capacidad
                    );

                    gestor.agregarEntidad(vehiculo);

                    JOptionPane.showMessageDialog(
                            null,
                            "Vehículo registrado correctamente."
                    );
                    break;

                case "3":
                    StringBuilder mensaje = new StringBuilder();

                    if (gestor.getListaEntidades().isEmpty()) {

                        JOptionPane.showMessageDialog(
                                null,
                                "No hay entidades registradas."
                        );

                    } else {

                        mensaje.append("===== ENTIDADES REGISTRADAS =====\n\n");

                        for (Registrable entidad : gestor.getListaEntidades()) {

                            if (entidad instanceof GuiaTuristico guiaRegistrado) {

                                mensaje.append("[Guía Turístico]\n");
                                mensaje.append("Nombre: ").append(guiaRegistrado.getNombre()).append("\n");
                                mensaje.append("Especialidad: ").append(guiaRegistrado.getEspecialidad()).append("\n");
                                mensaje.append("Años de experiencia: ").append(guiaRegistrado.getAniosexperiencia()).append("\n\n");

                            } else if (entidad instanceof Vehiculo vehiculoRegistrado) {

                                mensaje.append("[Vehículo]\n");
                                mensaje.append("Patente: ").append(vehiculoRegistrado.getPatente()).append("\n");
                                mensaje.append("Tipo: ").append(vehiculoRegistrado.getTipo()).append("\n");
                                mensaje.append("Capacidad: ").append(vehiculoRegistrado.getCapacidad()).append(" pasajeros\n\n");

                            } else if (entidad instanceof ColaboradorExterno colaboradorRegistrado) {

                                mensaje.append("[Colaborador Externo]\n");
                                mensaje.append("Nombre: ").append(colaboradorRegistrado.getNombre()).append("\n");
                                mensaje.append("Especialidad: ").append(colaboradorRegistrado.getEspecialidad()).append("\n\n");
                            }
                        }

                        JOptionPane.showMessageDialog(
                                null,
                                mensaje.toString()
                        );
                    }

                    break;

                case "4":
                    JOptionPane.showMessageDialog(null,
                            "Hasta Luego");

                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción Inválida");
            }
        } while (!opcion.equals("4"));
    }
}

