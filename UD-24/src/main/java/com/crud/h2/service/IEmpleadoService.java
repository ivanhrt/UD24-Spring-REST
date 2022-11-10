package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Empleado;

public interface IEmpleadoService {
	
	public List<Empleado> listarEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado empleadoXID(Long id);
	
	public List<Empleado> listarEmpleadoNombre(String nombre);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(Long id);

}