package com.proyectofinal.clublaemilia.servicio;

import java.util.Set;

public interface ServicioCrud<T, ID> {

	Set<T> buscarTodos();
	
	T buscarPorId(ID id);
	
	T guardar(T objeto);
	
	void borrar(T objeto);
	
	void borrarPorId(ID id);	
	
	
}
